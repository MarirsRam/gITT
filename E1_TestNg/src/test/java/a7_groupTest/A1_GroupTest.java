package a7_groupTest;

import org.testng.annotations.Test;

public class A1_GroupTest {


	@Test(priority=1,groups={"CHECKOUT","SEARCH","AddTocard"})
	public void loginTest(){
		System.out.println("---loginTest completed---");
		
		
	}
	@Test(priority=2,groups={"CHECKOUT","SEARCH","AddTocard"})
	public void searchTest(){
		System.out.println("--searchTest completed---");
	}
	@Test(priority=3,groups={"CHECKOUT","AddTocard"})
	public void addTocardTest(){
		System.out.println("---addTocardTest completed---");
	
	}
	@Test(priority=4,groups={"CHECKOUT"})
	public void cheakoutpage(){
		System.out.println("---cheakoutpage---");
	}
	@Test(priority=5)
	public void placeOrder(){
		System.out.println("---placeOrder---");
	}

}
