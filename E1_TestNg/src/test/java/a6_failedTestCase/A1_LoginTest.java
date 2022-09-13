package a6_failedTestCase;

import org.testng.annotations.Test;

public class A1_LoginTest {

	@Test(priority=1)
	public void loginTest(){
		System.out.println("-----login Test-----");
	}
	@Test(priority=2)
	public void searchTest(){
		System.out.println("-----searchTest-----");
}
	
	@Test(priority=3)
	public void addTocardTest(){
		int a= 1/0;
		System.out.println("-----addTocardTest-----");
	}
}