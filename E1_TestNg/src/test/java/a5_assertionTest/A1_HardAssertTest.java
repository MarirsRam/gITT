package a5_assertionTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A1_HardAssertTest {

       @Test(priority=1)
       public void loginTest(){
	System.out.println("login test validation start"); 
	String expected="welcome vcentry";
	String actual="welcome";
	Assert.assertEquals(actual, expected);
		
	System.out.println("login test validation end");
	
}
       @Test(priority=2)
       public void bookingTest(){
    	   System.out.println("booking test complete");
       }
}