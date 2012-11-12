import org.junit.*;
import static org.junit.Assert.*;
import java.util.Random;

public class HashTest{
     
		@Test
		public void HashTest(){
		
		Random r = new Random();
		String alphabet = "qwertyuiouiopadfhjkl;zxcnvm,.n;lkjagh";
		for(int i = 0; i<2000; i++){
        System.out.println("Give me a string and I will calculate its hash code");
        String str = Integer.toString(i)+ alphabet.charAt(r.nextInt(alphabet.length()));
        int hash = str.hashCode();
        int smallHash = HashUtilities.shortHash(hash);
        System.out.println("0< " + smallHash + " < 1000");
		System.out.println("HashCounter: " + i);
		System.out.println(str);
		assertTrue(smallHash <= 1000 && smallHash >= 0);
		}
		}
        
}