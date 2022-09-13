package a2_KeywordsTest;

import org.testng.annotations.Test;

public class A9_InvocationCountTest {


	@Test(priority=1, invocationCount=5)
	public void loginTest(){
		System.out.println("---loginTest completed---");
		
		
	}
	@Test(priority=2)
	public void searchTest(){
		System.out.println("--searchTest completed---");
	} 
}
