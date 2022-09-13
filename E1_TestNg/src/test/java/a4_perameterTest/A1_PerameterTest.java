package a4_perameterTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A1_PerameterTest {
	  @Parameters({"browser","url","username","password"})
     @Test
	public void loginTest(String browser,String url,String username,String password){
		  
		System.out.println("----------test case start-----------");
		System.out.println("open browser :"+browser);
		System.out.println("enter url:"+url);
		System.out.println("username:"+username);
		System.out.println("password:"+password);
		System.out.println("click login");
		
		System.out.println("---------test case complete-----------");
	}
}
