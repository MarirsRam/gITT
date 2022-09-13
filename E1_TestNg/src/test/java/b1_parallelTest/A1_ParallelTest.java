package b1_parallelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_ParallelTest {
	WebDriver wd;
	@Parameters({ "browser" })
	@BeforeClass
	public void setup(String browser){
		if(browser.equals("chrome")){
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		
	}else if(browser.equals("chrome")){
	WebDriverManager.chromedriver().setup();
 wd=new ChromeDriver ();
}
	wd.manage().window().maximize();
}
	@Test
	public void logintest() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
	WebElement input=	wd.findElement(By.name("q"));
	input.sendKeys("chennai");
	input.submit();
	Thread.sleep(2000);
	wd.navigate().back();
	Thread.sleep(2000);
	wd.navigate().forward();
	Thread.sleep(2000);
	wd.navigate().back();
	Thread.sleep(2000);
	wd.navigate().forward();
	}
}
