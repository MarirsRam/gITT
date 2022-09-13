package a2_KeywordsTest;

import org.testng.annotations.Test;

public class A4_DependsonTest {


	@Test(priority=1)
	public void loginTest() {
		System.out.println("--------loginTest completed----");//----- passed
	}

	@Test(priority=2,dependsOnMethods="loginTest")
	public void searchProduct() {
		int i=1/0;
		System.out.println("--------searchProduct completed----");//------ fail
	}

	@Test(priority=3,dependsOnMethods="searchProduct")
	public void addToCart() {
		System.out.println("--------addToCart completed----");//------ Skip
	}

	@Test(priority=4, dependsOnMethods="addToCart")
	public void checkoutTest() {
		System.out.println("--------checkoutTest completed----");//------Skip
	}

	@Test(priority=5,dependsOnMethods="checkoutTest")
	public void placeOrder() {
		System.out.println("--------placeOrder completed----");//------Skip 
	}

}


