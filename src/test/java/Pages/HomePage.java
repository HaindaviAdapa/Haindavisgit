package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	
	WebDriver driver;
	By Admin=By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
	By logoutbutton=By.xpath("//a[text()='Logout']");
	
public void passdriver(WebDriver driver1) {
	
	this.driver=driver1;
	
}
	
public void Logout() {
	
	
	
	
	driver.findElement(Admin).click();
	driver.findElement(logoutbutton).click();  
	
}
	
}
