package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SkillsPage {
	
	WebDriver driver;
	By Admin=By.xpath("(//a[@class='oxd-main-menu-item'])[1]");
	By qualification=By.xpath("//span[text()='Qualifications ']");
	By Skills=By.xpath("//a[text()='Skills']");
	By Addbutton=By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']");
	By Skillname=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By Skilldesc=By.xpath("//textarea[ @placeholder='Type description here']");
	By save=By.xpath("//button[text()=' Save ']");

	
public void passdriver(WebDriver driver1) {
	
	this.driver=driver1;
	
	
}

public void NavigateSkillPage() {
	
	
	driver.findElement(Admin).click();
	driver.findElement(qualification).click();
	driver.findElement(Skills).click();
	
	
	
}
public void AddSkills(String SkillName,String SkillDescription) throws InterruptedException {
	
	driver.findElement(Addbutton).click();
	driver.findElement(Skillname).sendKeys(SkillName);
	driver.findElement(Skilldesc).sendKeys(SkillDescription);
	
	Thread.sleep(5000);
	driver.findElement(save).click();
  
	
	
	
	
}


}


