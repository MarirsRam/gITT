package a3_AnnotationTest;

import org.testng.annotations.AfterMethod; 
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A1_MethodAnnotationTest {
	@BeforeMethod                 //----------- PreCondition
	public void verifyOpenBrowser(){
		System.err.print("<<<<<< open browesr>>>>>");
	}	
	   @AfterMethod              //------------post Condition
		public void verifyCloseBrowser(){
			System.err.println("<<<<CloseBrowser>>>>>>");
		}
	
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
