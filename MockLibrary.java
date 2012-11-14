public class MockLibrary{
    private String name;
	private int iD;
	
    public MockLibrary(String name, int iD){
	    this.name = name;
		this.iD = iD;
	}
	
	/**
	*@return name of the library selected
	*/
	public String getLibName(){
	    return name;
	}
	
	/**
	*@return iD number for the selected library
	*/
	public int getID(){ 
	    return iD;
	}
}