package a5_assertionTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A4_SoftAssertTest {

	@Test(priority=1)
    public void loginTest(){
	System.out.println("login test validation start"); 
	String expected="welcome vcentry";
	String actual="welcome";
	SoftAssert s=new SoftAssert();
	s.assertEquals(actual, expected);
		
	System.out.println("login test validation complete");
	s.assertAll();
}
    
}
