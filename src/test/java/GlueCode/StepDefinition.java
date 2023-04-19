package GlueCode;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.JobsPage;
import Pages.LoginPage;
import Pages.NationalityPage;
import Pages.SkillsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefinition {

	WebDriver driver;
	
	@Given("User opens chrome browser")
	public void user_opens_chrome_browser() {
	    
	System.setProperty("webdriver.chrome.driver","c://chromedriver_win32//chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	
	
	}
	@When("User opens application URL{string}")
	public void user_opens_application_url_https_opensource_demo_orangehrmlive_com_web_index_php_auth_login(String TestURL) {
	    
	driver.get(TestURL);
	
	
	
	}
	@Given("User enters Username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String Username, String Password) {
	    
		LoginPage L1= new LoginPage();
		L1.passdriver(driver);
		L1.Login(Username,Password);
	
	
	
	}
	@When("User navigates to Nationality Page")
	public void user_navigates_to_nationality_page() {
	    
		NationalityPage N1= new NationalityPage();
		N1.passdriver(driver);
		N1.NavigateNationality();
	
	
	
	
	}
	@Then("User creates Nationality record as")
	public void user_creates_nationality_record_as(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    
		List<Map<String,String>>NationalityData=dataTable.asMaps(String.class,String.class);
		
		System.out.println("Number of rows:"+NationalityData.size());
		
		for(int i=0;i<NationalityData.size();i++) {
			
	   System.out.println(NationalityData.get(i).get("NationalityText"));
	   
	   String NationalityText=NationalityData.get(i).get("NationalityText");
	   
	   System.out.println("__________________________");{
		   
		   NationalityPage N2= new   NationalityPage();
		   N2.passdriver(driver);
		   N2.AddNationality(NationalityText);
		   
		   
	   }
	   
	}
	}
	@When("User navigates to Jobs Page")
	public void user_navigates_to_jobs_page() {
		
		
		
		JobsPage J1= new JobsPage();
		J1.passdriver(driver);
		J1.NavigateJobs();
	   
	
	
	
	
	}
	@Then("User creates jobs record enters JobTitle as {string} JobDescription as {string} and JobNote as {string}")
	public void user_creates_jobs_record_enters_job_title_as_job_description_as_and_job_note_as(String JobTitles, String JobDescriptions, String JobNotes) throws InterruptedException {
	   
    
    
   	
    
	    JobsPage J1= new JobsPage();
		J1.passdriver(driver);
		J1.AddJobs(JobTitles,JobDescriptions,JobNotes);
		
	
	
	}
	@When("User navigates to Skills Page")
	public void user_navigates_to_skills_page() {
		
		
		SkillsPage S1= new SkillsPage();
		S1.passdriver(driver);
		S1.NavigateSkillPage();
	    
	
	
	}
	@Then("User creates Skills record as")
	public void user_creates_skills_record_as(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    
	List<List<String>>SkillsData=dataTable.cells();
	
	System.out.println("Number of rows:"+SkillsData.size());
	
	for(int i=0;i<SkillsData.size();i++) {
		
	System.out.println(SkillsData.get(i).get(0));
	
	String SkillName=SkillsData.get(i).get(0);
	
	String SkillDescription=SkillsData.get(i).get(1);
	
	System.out.println("________________");{
		
		
		
		
		SkillsPage S2= new SkillsPage();
		S2.passdriver(driver);
		S2.AddSkills(SkillName,SkillDescription);
	}
		
		
}
	
	}
    @Then("User logout")
	public void user_logout() {
	    
    
    	HomePage H1= new HomePage();
    	H1.passdriver(driver);
    	H1.Logout();
    
    }
	@Then("User close browser")
	public void user_close_browser() {
	   
	
	driver.close();
	
	}

	
	
	
	
}
