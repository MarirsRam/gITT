package A8_iTestResult;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class A1_ITest {


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
@AfterMethod
public void tearDown(ITestResult r){
	System.out.println("----------------------------------");
	System.out.println("r.getHost"+r.getHost());
	System.out.println("r.getInstance"+r.getInstance());
	System.out.println("r.getInstanceName"+r.getInstanceName());
	System.out.println("r.getEndMillis"+r.getEndMillis());
	System.out.println("r.getName"+r.getName());    
	System.out.println("r.getStartMillis"+r.getStartMillis());
	System.out.println("r.getStatus"+r.getStatus());
	System.out.println("r.getTestName"+r.getTestName());
	System.out.println("r.isSuccess"+r.isSuccess());
	System.out.println("r.getMethod"+r.getMethod());
	System.out.println("r.getParameters"+r.getParameters());
	System.out.println("r.getThrowable"+r.getThrowable());
	System.out.println("r.getTestContext"+r.getTestContext()); 
	
	
	
	
	
	System.out.println("***********************************");
}

}
