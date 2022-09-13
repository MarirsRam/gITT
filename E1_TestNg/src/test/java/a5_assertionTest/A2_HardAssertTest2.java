package a5_assertionTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A2_HardAssertTest2 {

	 @Test(priority=1)
     public void loginTest(){
	System.out.println("login test validation start"); 
	String expected="welcome vcentry";
	String actual="welcome";
	String message="expect and actual should be same";// Error coming to visuval
	Assert.assertEquals(actual, expected, message);
		
	System.out.println("login test validation end");
}
}