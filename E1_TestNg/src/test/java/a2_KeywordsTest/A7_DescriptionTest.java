

package a2_KeywordsTest;

import org.testng.annotations.Test;

public class A7_DescriptionTest {


	@Test(priority=1, description="login admin")
	public void loginTest(){
		System.out.println("---loginTest completed---");
		
		
	}
	@Test(priority=2, description= "mobile" )
	public void searchTest(){
		System.out.println("--searchTest completed---");
	}
	@Test(priority=3,  description="click the mobile get perform" )
	public void addTocardTest(){
		System.out.println("---addTocardTest completed---");
	
	}
	@Test(priority=4, description="card page cheak")
	public void cheakoutpage(){
		System.out.println("---cheakoutpage---");
	}
	@Test(priority=5, description="order the moile place")
	public void placeOrder(){
		System.out.println("---placeOrder---");
	}


	
}
