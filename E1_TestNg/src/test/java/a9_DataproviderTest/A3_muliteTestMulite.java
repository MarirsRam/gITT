package a9_DataproviderTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A3_muliteTestMulite {


	@Test(dataProvider="logindata",priority = 1)
	public void loginTest(String browser,String url,String userName,String password){
		System.out.println("open browser     :"+ browser);//0 index
		System.out.println("enter url        :"+url);     //1 index
		System.out.println("enter userName   :"+userName);//2 index
		System.out.println("enter password   :"+password);//3 index
		
		System.out.println("-----Click login-----");
	}	
		@Test(dataProvider = "bookingdata",priority = 2)
		public void bookingTest(String browser,String url,String product,String code ) {
			System.out.println("open browser     :"+ browser);//0 index
			System.out.println("enter url        :"+url);     //1 index
			System.out.println("search product :"+product);//2 index
			System.out.println("enter offer code  :"+code);//3 index
			System.out.println("-----Click login-----");
	}
	@DataProvider(name="mydata")
	public static  Object[][] sendDataToTest(){
		//browser ,url,name,password
		//[][], object Arrays- object[][]
		//object[iteration count][data count]
		//object[dataset count][data count]
		
	Object[][] data=new Object[3][4];
	data[0][0]="chrome";
	data[0][1]="sampleUrl1";
	data[0][2]="marirs@";
	data[0][3]="PASSWORD";
	//SECOND 
	data[1][0]="GOOGLE";
	data[1][1]="sampleUrl2";
	data[1][2]="marirs@1";
	data[1][3]="PASSWORD#";
	//Third
	data[2][0]="bings.com";
	data[2][1]="sampleUrl3";
	data[2][2]="marirs@2";
	data[2][3]="PASSWORD$";
		
	return data;
					
	}
	@DataProvider(name="myData")
	public static Object[][] sendDataToTest1(){
		Object[][] data=new Object[3][4];
		data[0][0]="chrome";
		data[0][1]="sampleUrl1";
		data[0][2]="moblie";
		data[0][3]="code01";
		//SECOND 
		data[1][0]="GOOGLE";
		data[1][1]="sampleUrl2";
		data[1][2]="watch";
		data[1][3]="code02";
		//Third
		data[2][0]="bings.com";
		data[2][1]="sampleUrl3";
		data[2][2]="Backpack";
		data[2][3]="code03";
			
		return data;
	}
	
}


