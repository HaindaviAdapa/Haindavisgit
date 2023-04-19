package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JobsPage {
	
	WebDriver driver;
	By Admin=By.xpath("//span[text()='Admin']");
	By Jobs=By.xpath("//span[text()='Job ']");
	By Jobtitle=By.xpath("//a[text()='Job Titles']");
	By Addbutton=By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']");
	By Jobtitles=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By Jobdesc=By.xpath("//textarea[@placeholder='Type description here']");
	By Jobnote=By.xpath("//textarea[@placeholder='Add note']");
	By Save=By.xpath("//button[@type='submit']");
	
	
public void passdriver(WebDriver driver1) {
		
		this.driver=driver1;
		
		
}

public void NavigateJobs() {
	
	
	
	driver.findElement(Admin).click(); 
	driver.findElement(Jobs).click(); //Jobs
	driver.findElement(Jobtitle).click(); //Job Titles
	
}
	
	
public void AddJobs(String JobTitles,String JobDescriptions,String JobNotes) throws InterruptedException	{
	
	driver.findElement(Addbutton).click(); //Add button
	
	
	driver.findElement(Jobtitles).sendKeys(JobTitles);
	driver.findElement(Jobdesc).sendKeys(JobDescriptions);
	driver.findElement(Jobnote).sendKeys(JobNotes);
	
	
	Thread.sleep(5000); //execution will be passed for 5 seconds
		
	driver.findElement(Save).click();  //Save

	
	
	
}
	
	
	
}
