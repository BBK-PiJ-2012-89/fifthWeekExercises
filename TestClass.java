import org.junit.*;
import static org.junit.Assert.*;

//javac - cp .;I:/Lib/junit4.10/junit-4.10.jar TestClass.java
//java - cp .;I:/Lib/junit4.10/junit-4.10.jar org.junit.runner.JUnitCore TestClass

public class TestClass{

    private Book book1;
	private Users user1;
	private Users user2;
	private Users user3;
	private Library lib1;
    /**
	*This method constructs a basic book and user object for testing purposes
	*/
	@Before
    public void buildUp(){
        book1 = new LibraryBook("GRR Martin", "A Game Of Thrones");
		user1 = new Users("Charlie Chaplin");
		user2 = new Users("Colin Mockerty");
		user3 = new Users("Bob Loblaw");
		lib1 = new Library("BritLib");
    }
	
	/**
	*This method deletes the previously created objects prior to rebuilding to prevent any data leakage to the next test
	*/
	@After
	public void cleanUp(){
        book1 = null;
		user1 = null;
		lib1 = null;
    }
	
	@Test
	public void getAuthorTest(){
	    String str = book1.getAuthor();
		
		assertEquals(str, "GRR Martin");
	}
	@Test
	public void getTitleTest(){
	    String str = book1.getTitle();
		
		assertEquals(str, "A Game Of Thrones");
	}
	@Test
	public void getNameTest(){
	    String str = user1.getName();
		
		assertEquals(str, "Charlie Chaplin");
	}
	@Test 
	public void registerTest(){
	    user1.register(lib1);
		String str = user1.getLibrary();
		assertEquals(str, "BritLib");
	}
	
	@Test
	public void setMaxBooksTest(){
	    lib1.setMax(9);
		int ans = lib1.getMax();
		assertEquals(ans, 9);
	}
	
	@Test
	public void iDtest(){
	    int ans1 = lib1.getID(user1);
		int ans2 = lib1.getID(user2);
		int ans3 = lib1.getID(user3);
		assertEquals(ans1, 1);
		assertEquals(ans2, 2);
		assertEquals(ans3, 3);
	}
}