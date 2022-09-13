package failedScreenshotTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_failScreenshot {
	WebDriver wd;
@Test
	public void logintest(){
		WebDriverManager.chromedriver().setup();
	 wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
	WebElement input=	wd.findElement(By.name("qvjhk"));
	input.sendKeys("chennai");
	input.submit();
}
@AfterMethod
 public void tearDown(ITestResult r) throws IOException {
	if(!r.isSuccess()) {
File src=	((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
FileHandler.copy(src, new File("C:/Users/Public/SriRam1/E1_TestNg/screenshot/sample.jpeg"));
		System.out.println("screenshot took...");
	}
}
}	
	


