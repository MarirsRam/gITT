package a9_DataproviderTest;



	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Factory;
	import org.testng.annotations.Test;

	public class A4_MultiTestSingleDataProvider {

		String browser;
		String url;
		String username;
		String password;
		String product;
		String code;
		
		@Factory(dataProvider="data")
		public A4_MultiTestSingleDataProvider(String browser, String url, String username,String password, String product, String code){
			this.browser=browser;
			this.url=url;
			this.username=username;
			this.password=password;
			this.product=product;
			this.code=code;
					
		}
		
		@Test(priority=1)
		public void loginTest(){
			System.out.println("Open Browser     :"+ browser);//0
			System.out.println("Enter Url        :"+url);//1
			System.out.println("Enter User Name  :"+username);//2
			System.out.println("Enter Password   :"+password);//3
			System.out.println("----Click login---");
		}
		@Test(priority=2)
		public void bookingTest(){
			System.out.println("Search product  :"+product);//4
			System.out.println("Enter offer code:"+code);//5
			System.out.println("---Click book----");
		}
		
		@DataProvider(name="data")
		public static Object[][] getData(){
			Object[][] data=new Object[3][6];
			data[0][0]="chrome";
			data[0][1]="sample url 1";
			data[0][2]="user-A";
			data[0][3]="password-123";
			data[0][4]="mobile";
			data[0][5]="code-01";
			
			data[1][0]="firefox";
			data[1][1]="sample url 2";
			data[1][2]="user-B";
			data[1][3]="password-345";
			data[1][4]="laptop";
			data[1][5]="code-02";

			data[2][0]="ie";
			data[2][1]="sample url 3";
			data[2][2]="user-C";
			data[2][3]="password-678";
			data[2][4]="tab";
			data[2][5]="code-03";

			return data;
		}
	}


	
	
