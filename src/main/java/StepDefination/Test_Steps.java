package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {

		public static WebDriver driver;
		
		@Given("^User is on Home Page$")
		public void User_is_on_Home_Page() throws Throwable {
		    // Express the Regexp above with the code you wish you had
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/resources/geckodriver3");
			driver = new FirefoxDriver();
	      
	        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        //Launch the Online Store Website
	 
	        driver.get("https://www.workprohr.com/");
		   
		}

		@When("^User Navigate to LogIn Page$")
		public void User_Navigate_to_LogIn_Page() throws Throwable {
		    // Express the Regexp above with the code you wish you had
			driver.findElement(By.partialLinkText("Sign In")).click();
		}

		@When("^User enters UserName and Password$")
		public void User_enters_UserName_and_Password() throws Throwable {
		    // Express the Regexp above with the code you wish you had
			driver.findElement(By.id("email")).sendKeys("parveen.sahu@power2sme.com"); 
			driver.findElement(By.id("password")).sendKeys("skills@08");
			driver.findElement(By.xpath("//button[normalize-space(text()=' SIGN IN  ')]")).click();
		}

		@Then("^Message displayed Login Successfully$")
		public void Message_displayed_Login_Successfully() throws Throwable {
		    // Express the Regexp above with the code you wish you had
			System.out.println("Login Successfully");
		}

		@When("^User LogOut from the Application$")
		public void User_LogOut_from_the_Application() throws Throwable {
		    // Express the Regexp above with the code you wish you had
			driver.findElement (By.xpath(".//*[@id='header']/div/ul[2]/li[2]/a/span")).click();
	        driver.findElement (By.partialLinkText("Logout")).click();
		}

		@Then("^Message displayed LogOut Successfully$")
		public void Message_displayed_LogOut_Successfully() throws Throwable {
		    // Express the Regexp above with the code you wish you had
			System.out.println("LogOut Successfully");
			driver.quit();
		}

}
