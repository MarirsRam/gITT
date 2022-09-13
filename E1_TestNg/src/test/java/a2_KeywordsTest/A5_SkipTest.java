
package a2_KeywordsTest;

import org.testng.annotations.Test;

public class A5_SkipTest {


	@Test(priority=1)
	public void loginTest(){
		System.out.println("---loginTest completed---");
		
		
	}
	@Test(priority=2,enabled=false)
	public void b_searchTest(){
		System.out.println("--A_ searchTest completed---");
	}
}
