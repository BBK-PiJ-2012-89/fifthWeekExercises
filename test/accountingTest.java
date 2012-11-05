/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.tester.Bill;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author charliebrodie
 */
public class accountingTest {
    
    @Test
    public void testAddBillToList(){
        String inputWord = "firstBill";
        int input = 788;
        Bill firstBill = new Bill(inputWord, input);
        String inputWord2 = "secondBill";
        int input2 = 234;
        Bill secondBill = new Bill(inputWord2, input2);
                
        Bill current = firstBill;
        while (current!= null){
            if(current.getNextBill() == null){
                current.setNextBill(secondBill);
                return;
            }
            int output = current.getNextBill();
        }
        return;
      int expected = 788;
      assertEquals(output, expected);
        
    }
    
    @Test
    public void launchTester(){
        String concept = "heatingBill";
        int strAmount = 500;
        
           /* if(!concept.equals("END")){
                System.out.print(" Amount: ");
                amount = Integer.parseInt(strAmount);
            }*/
            
            Bill newBill = new Bill(concept, strAmount);
            this.addBillToList(newBill);
        
        int count = 0;
        int totalDebt = 0;
        for(Bill current = newBill.getFirstBill(); current != null; current = current.getNextBill()){
            count++;
            totalDebt += current.getAmount();
        }
        
        int expectedCount = 1;
        int expectedTotalDebt = 500;
        int outputCount = count;
        int output = totalDebt;
        assertEquals(expectedCount, outputCount);
        assertEquals(expectedTotalDebt, output); 
    }
    
    private void addBillToList(Bill bill){
        if(bill.getFirstBill() == null){
            bill.setFirstBill(bill);
            return;
        }
        Bill current = this.getFirstBill();
        while (current!= null){
            if(current.getNextBill() == null){
                current.setNextBill(bill);
                return;
            }
            current = current.getNextBill();
        }
        return;
    }

}