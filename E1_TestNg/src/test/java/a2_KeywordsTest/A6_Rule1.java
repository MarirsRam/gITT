package a2_KeywordsTest;

import org.testng.annotations.Test;

public class A6_Rule1 {

	@Test(priority=1,enabled=false)
	public void loginTest(){
		System.out.println("---loginTest completed---");
		
		
	}
	@Test(priority=2,dependsOnMethods="loginTest")
	public void b_searchTest(){
		System.out.println("--A_ searchTest completed---");
	}
}
