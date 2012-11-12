public class Stack{
    private PersonS head;

    public Stack(PersonS newPerson){
	    this.head = newPerson;
	}
	
	public void push(PersonS newPerson){
	    newPerson.setNext(head);
		head = newPerson;
		System.out.println("A new person has joined the stack");
	}
	
	public PersonS pop(){
	    System.out.println("A person has been removed from the stack");
	    PersonS popper = head;
		head = head.getNext();
		return popper;
	}
	
	public PersonS peek(){
	    return head;
	}
}