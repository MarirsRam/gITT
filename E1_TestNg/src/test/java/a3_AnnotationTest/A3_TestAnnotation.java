package a3_AnnotationTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A3_TestAnnotation {
     @BeforeTest
	public void verifyLogininternet(){
		System.out.println("******** verifyLogininternet***********");
	}
     @AfterTest
	public void verifyLogoutinternet(){
	System.out.println("*********verifyLogoutinternet*************");	
	}

	@BeforeClass
	public  void verifyLogindp(){
		System.out.println("===== login dp ====");
	}
	@AfterClass
	public void verifyLogoutdp(){
	System.out.println("==== logout dp====");
	}
	
	
	
	

	@BeforeMethod                 //----------- PreCondition
	public void verifyOpenBrowser(){
		System.err.println("<<<<<< open browesr>>>>>");
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


