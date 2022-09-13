package practiesTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.signature.qual.ClassGetName;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart {
public static	WebDriver wd;
	String price1;
	String parent;
	String child;
	String 	price2;
	String price3;
@BeforeClass
public void setup() {
	WebDriverManager.chromedriver().setup();
	wd=new ChromeDriver();
	wd.manage().window().maximize();	
}
@Test(priority = 1)
public void searchproduct() {
wd.get("https://www.flipkart.com/");
wd.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
 wd.findElement(By.name("q")).sendKeys("realme mobile");
	wd.findElement(By.xpath(".//button[@class='L0Z3Pu']")).click();
}
@Test(priority = 2)
public void price1() throws InterruptedException {
	Thread.sleep(1000);
wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
WebElement data=	wd.findElement(By.xpath("(.//div[contains(@class,'_30jeq3')])[1]"));
price1=	data.getText();
	System.out.println(price1);
	wd.findElement(By.xpath("(.//div[contains(@class,'_4rR01T')])[1]")).click();
}
@Test(priority = 3)
 public void price2() {
Set<String> windows=wd.getWindowHandles();
Iterator<String>it=windows.iterator();
parent=it.next();
child=it.next();
wd.switchTo().window(child);
 WebElement data1= wd.findElement(By.xpath("(.//div[contains(@class,'_30jeq3 _16Jk6d')])"));
	price2= data1.getText();
	System.out.println(price2);
	Assert.assertEquals(price1,price2 );	
}
@Test(priority = 4)
public void price3() throws InterruptedException {
	wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
wd.findElement(By.xpath(".//button[contains(@class,'_2KpZ6l _2U9uOA _3v1-ww')]")).click();
Thread.sleep(5000);
 WebElement data=  wd.findElement(By.xpath(".//span[contains(@class,'_2-ut7f _1WpvJ7')]"));
 price3=data.getText();
System.out.println(price3);
Assert.assertEquals(price2, price3);
}
@Test(priority=5)
public void Remove () {
JavascriptExecutor	js=(JavascriptExecutor)wd;

WebElement input1=wd.findElement(By.xpath("//div[@class='_10vWcL td-FUv WDiNrH']/child::div[2]"));
js.executeScript("arguments[0].scrollIntoView(true);",input1);
input1.click();	
wd.findElement(By.xpath("//div[contains(@class,'_3dsJAO _24d-qY FhkMJZ')]")).click();
}
@Test(priority = 6)
public void missingcard() {
String data=	wd.findElement(By.xpath(".//div[@class='_1LCJ1U']")).getText();
	System.out.println(data);
}
@AfterMethod
public void screenshot(ITestResult br) throws IOException {
	File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src,new File("C:\\Users\\Public\\SriRam1\\E1_TestNg\\screenshot/FlipKart"+br.getName()+".jpeg"));
}
}                                                                                                //System.currentTimeMillis()






