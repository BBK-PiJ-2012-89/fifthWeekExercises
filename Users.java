public class Users{
    private String name;
	private Library library;
	private int iD = 0;
	
	/** 
	* Constructor makes a new user with an immutable name string
	*/
	public Users(String name){  
	    this.name = name;
	}
	
	/**
	*@return name of appropriate user
	*/
	public String getName(){ 
	    return name;
	}
	
	/**
	*@param library represents the name of the library that the user intends to register with
	*/
	public void register(Library library){
	    this.library = library;
	}
	
	/**
	*@return passes the iD number back to the library allowing it to return it
	*/
	public int getID(){
	    return iD;
	}
	
	/**
	*@param sets the current users iD number
	*/
	public void setID(int iD){
	    this.iD = iD;
	}
	
	/**
	*@return Library that the user is currently registered to.
	*/
	public String getLibrary(){
	    return library.getLibName();
	}

}