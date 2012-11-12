public class HashUtilities{
    
    public static int shortHash(int theInt){
        int temp = theInt % 1000;
        
        int product = Math.abs(temp);
        
        return product;
    }
}
    
    