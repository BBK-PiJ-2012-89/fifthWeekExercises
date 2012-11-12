public class Queue implements PersonQueue{
    private Person nextPerson, currentPerson;
    public static int size = 0;
    

    public Queue(Person newPerson){
        currentPerson = newPerson;
        nextPerson = null;
        currentPerson.next = nextPerson;
        size++;
    }
    
    public void insert(Person newPerson){
        if(nextPerson == null){
            this.nextPerson = newPerson;
            this.currentPerson.next = newPerson;
            size++;
            System.out.println("A new member has joined the queue, that makes " + size + " members.");
        } else {
            nextPerson.addPerson(newPerson);
            size++;
            System.out.println("A new member has joined the queue, that makes " + size + " members.");
        }
    }
    
    
    public void retrieve(){
        Person returnPerson = currentPerson;
        currentPerson = this.nextPerson;
        this.nextPerson = currentPerson.next;
        size--;
        System.out.println("A member has left the queue, that makes " + size + " members.");
    }
    
    public int showQueue(){
        System.out.println("The number of people left in the queue is: " + size);
        System.out.println("The person at the front of the queue has " + currentPerson.items + " items.");
		return size;
    }
}
    