public class LibraryBook implements Book{
    private String author;
	private String title;
	private LibraryBook next;
	private LibraryBook previous;
	
	/**
	* This constructor creates the new library book object
	* and sets the (then unchangeable) title and author
	*/
	public LibraryBook(String author, String title){ 
	    this.author = author;
		this.title = title;
		this.next = null;
		this.previous = null;
	}
	
	/**
	*@return gives the author of the selected book
	*/
	public String getAuthor(){
	    return author;
	}
	
	/**
	*@return gives the title of the selected book
	*/
	public String getTitle(){
	    return title;
	}
	
	public void addBook(LibraryBook newBook){
	    if(this.next == null){
		    this.next = newBook;
			newBook.previous = this;
		} else {
		    this.next.addBook(newBook);
		}
	}
}