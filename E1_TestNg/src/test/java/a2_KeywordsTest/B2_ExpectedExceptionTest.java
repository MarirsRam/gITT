package a2_KeywordsTest;

import org.testng.annotations.Test;

public class B2_ExpectedExceptionTest {


	@Test(priority=1, expectedExceptions={ArithmeticException.class,NullPointerException.class})
	
	public void loginTest(){
		System.out.println("---loginTest completed---");
		//int i=1/0;        //------------------------------ ArithemeticException
		String a=null;  //------------------------------ Null point Exception
		a.concat("s");
}
}