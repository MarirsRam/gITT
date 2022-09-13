package practiesTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginpagefactoryusingvariable {
	public static WebElement username;
	public static WebElement password;
	public static WebElement firstName;
	public static WebElement middleName;
//	public static WebElement 
	
	@Test
	public static void logintest(){
	WebDriverManager.chromedriver().setup();
	WebDriver wd=new ChromeDriver();
	wd.manage().window().maximize();
	wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	PageFactory.initElements(wd,loginpagefactoryusingvariable.class);

username.sendKeys("Admin");
password.sendKeys("admin123");
password.submit();

wd.findElement(By.xpath("(.//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[6]")).click();
firstName.sendKeys("sriram");
middleName.sendKeys("s");
}
}