package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
	WebDriver driver;
	By username=By.xpath("//input[@name='username']");
	By password=By.xpath("//input[@placeholder='Password']");
	By submit=By.xpath("//button[@type='submit']");
	

public void passdriver(WebDriver driver1)	{
	
	
	this.driver=driver1;
}
	
public void Login(String Username,String Password) {
	
	
	driver.findElement(username).sendKeys(Username);
	driver.findElement(password).sendKeys(Password);
	driver.findElement(submit).click();

	
	
	
}
	
	
}


