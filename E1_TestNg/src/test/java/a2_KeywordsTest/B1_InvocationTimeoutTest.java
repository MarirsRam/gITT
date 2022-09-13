package a2_KeywordsTest;

import org.testng.annotations.Test;

public class B1_InvocationTimeoutTest {


	@Test(priority=1, invocationTimeOut=10000)
	public void loginTest() throws InterruptedException{
		Thread.sleep(11000);
		System.out.println("---loginTest completed---");
}
}