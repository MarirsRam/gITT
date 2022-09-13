
package a2_KeywordsTest;

import org.testng.annotations.Test;

public class A1_priorityTest {


	@Test(priority=1)
	public void loginTest(){
		System.out.println("---loginTest completed---");
		
		
	}
	@Test(priority=2)
	public void searchTest(){
		System.out.println("--searchTest completed---");
	}
	@Test(priority=3)
	public void addTocardTest(){
		System.out.println("---addTocardTest completed---");
	
	}
	@Test(priority=4)
	public void cheakoutpage(){
		System.out.println("---cheakoutpage---");
	}
	@Test(priority=5)
	public void placeOrder(){
		System.out.println("---placeOrder---");
	}


	
}