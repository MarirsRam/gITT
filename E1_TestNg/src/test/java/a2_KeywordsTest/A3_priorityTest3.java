package a2_KeywordsTest;

import org.testng.annotations.Test;

public class A3_priorityTest3 {
@Test(priority=-1)
	public void loginDb(){
		System.out.println("---logindp completed");
}
@Test(priority=0)
public void openBrowser(){
	System.out.println("---openBrowser completed");
}

		@Test(priority=1)
		public void loginTest(){
			System.out.println("---loginTest completed---");
			
			
		}
		@Test(priority=2)
		public void b_searchTest(){
			System.out.println("--A_ searchTest completed---");
		}
		@Test(priority=2)
		public void a_searchTest(){
			System.out.println("--B_searchTest completed---");
				
			
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
	
