public class PersonS {

    private PersonS next;
    private int items;
    
    public PersonS(int items){
        this.items = items;
    }
	
	public int getItems(){
	    return items;
	}
	
	public void setNext(PersonS head){
	    this.next = head;
	}
	
	public PersonS getNext(){
	    return next;
	}
}
        
        
    