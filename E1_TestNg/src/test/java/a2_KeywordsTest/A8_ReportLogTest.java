
package a2_KeywordsTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A8_ReportLogTest {


	@Test(priority=1)
	public void loginTest(){
		//System.out.println("---loginTest completed---");
	Reporter.log("---loginTest completed---");	
		
	}
	@Test(priority=2)
	public void searchTest(){
		//System.out.println("--searchTest completed---");
		Reporter.log("-----searchTest completed---");	
	}
	@Test(priority=3)
	public void addTocardTest(){
		//System.out.println("---addTocardTest completed---");
		Reporter.log("--addTocardTest completed---");	
	}
	@Test(priority=4)
	public void cheakoutpage(){
		//System.out.println("---cheakoutpage---");
		Reporter.log("-----cheakoutpage----");	
	}
	@Test(priority=5)
	public void placeOrder(){
		//System.out.println("---placeOrder---");
		Reporter.log("------placeOrder----");
	}


	
}
