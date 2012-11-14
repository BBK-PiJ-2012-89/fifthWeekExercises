public class Library{
    private String name;
	private int iDNumbers = 1;
	private int maxBooks;
	private LibraryBook first;
	
    public Library(String name){
	    this.name = name;
	}
	
	/**
	*@return the maximum number of books which can be borrowed at any one time
	*/
	public int getMax(){
	    return maxBooks;
	}
	
	/**
	*@param sets the maximum number of books which can be borrowed at any one time
	*/
	public void setMax(int maxBooks){
	    this.maxBooks = maxBooks;
	}
	
	/**
	*@return name of the library selected
	*/
	public String getLibName(){
	    return name;
	}
	
	/**
	*@return iD number for the selected user
	*or, if the user has no iD number, then set the iD number for the user then return that value
	*@param the user whose iD you wish to return
	*/
	public int getID(Users user){ 
	
	    int theID = user.getID();
		
		if(theID == 0){
		    user.setID(iDNumbers);
			theID = user.getID();
			iDNumbers++;
			return theID;
		} else {
		    return theID;
		}
	}
	/**
	*@param title, the title of the new book to be added
	*@param author, the author of the new book to be added
	*/
	
	public void addBook(String title, String author){
	    if(first == null){
		    first = new LibraryBook(author, title);
		} else {
		    LibraryBook newBook = new LibraryBook(author, title);
			first.addBook(newBook);
		}
	}
}