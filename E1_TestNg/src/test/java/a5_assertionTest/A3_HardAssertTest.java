package a5_assertionTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A3_HardAssertTest {

	@Test
	public void login(){
		boolean data = false;
		System.out.println("login validation start");
		String expected="welcome vcentry";
		String actual="vcentry";
		if(expected.endsWith(actual)){
			System.out.println("pass");
			data=true;
		}else{
			System.out.println("failed");
			data=false;
		}
		//Assert.assertFalse(data);
		Assert.assertTrue(data);
			System.out.println("login test validation complete"); 
		}
	}

