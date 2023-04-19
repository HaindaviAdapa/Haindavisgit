package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NationalityPage {
	
	WebDriver driver;
	By admin=By.xpath("//span[text()='Admin']");
	By nationalities=By.xpath("//a[text()='Nationalities']");
	By Addbutton=By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']");
	By Savebutton=By.xpath("//button[@type='submit']");
	
public void passdriver(WebDriver driver1) {
	
	this.driver=driver1;
}
	
public void NavigateNationality() {
	
	
	driver.findElement(admin).click(); 
	  driver.findElement(nationalities).click();
	  
}
	
public void AddNationality(String NationalityText) throws InterruptedException {
	
	driver.findElement(Addbutton).click(); //Addbuttonn
	  driver.findElement(Addbutton).sendKeys(NationalityText);
		
		Thread.sleep(5000);
		  driver.findElement(Savebutton).click();

	
	
}

}

