import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase {
	WebDriver driver = new ChromeDriver();
	String WebSite = "https://www.saucedemo.com";
	String InputUserName = "standard_user";
	String InputPassword = "secret_sauce";
	@BeforeTest
	public void SetUp () {
		
	driver.get(WebSite);	
	driver.manage().window().maximize();	
		
		
	}
	
	
	@Test(priority=1)
	
	public void LogIn () throws InterruptedException {
		
	WebElement InputUn = driver.findElement(By.id("user-name"))	;
	InputUn.sendKeys(InputUserName);	
		
	WebElement InputP= driver.findElement(By.id("password"))	;
	InputP.sendKeys(InputPassword);	
	Thread.sleep(2000);
	WebElement LoginInput= driver.findElement(By.id("login-button"))	;
	LoginInput.click();
			
		
	}

	
	@Test(priority=2)
	public void AddToCart () {
		
	List<WebElement>AddToCartButtons = driver.findElements(By.className("btn"));
		
	for(int i=0 ; i<AddToCartButtons.size(); i++) {
		
		AddToCartButtons.get(i).click();}
		
//		if i add the first3 elements 
		//for(int i=0 ; i<3 ; i++) {
			
		//	AddToCartButtons.get(i).click();
	
		//if i want description elements 
		//AddToCartButtons.get(i).getText();
	
	//if i add 1,3,5 elements
	//for(int i=0 ; i<AddToCartButtons.size();i=i+2);
	//AddToCartButtons.get(i).click();

		}
	}	
		
		
		
		
		
	
	
	


