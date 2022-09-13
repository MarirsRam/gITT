package a4_perameterTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A2_BooksTest {

	  @Parameters({"browser","url","product","orderplace","GetPrice"})
	     @Test
		public void loginTest(String browser,String url,String product,String orderplace,String GetPrice){
			  
		  if(browser.equals("chrome")){
			  System.out.println("chrome open sucees");
		  }
		  System.out.println("lanch the url"+url);
			System.out.println("----------test case start-----------");
			System.out.println("open browser :"+browser);
			System.out.println("enter url:"+url);
			System.out.println("enter product:"+product);
			System.out.println(" place:"+orderplace);
			System.out.println("Price:"+GetPrice);
			
			System.out.println("---------test case complete-----------");
		}
}
