package CucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	public static WebDriver driver;
	public static void main(String[] args) {
		//abc
		// Create a new instance of the Firefox driver
		System.out.println(System.getProperty("user.dir") + "/resources/geckodriver3");
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/resources/geckodriver3");
	
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/resources/chromedriver");
		driver = new FirefoxDriver();
      
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Launch the Online Store Website
 
        driver.get("https://www.workprohr.com/");
 
        // Find the element that's ID attribute is 'account'(My Account) 
 
        driver.findElement(By.partialLinkText("Sign In")).click();
 
        // Find the element that's ID attribute is 'log' (Username)
 
        // Enter Username on the element found by above desc.
 
        driver.findElement(By.id("email")).sendKeys("parveen.sahu@power2sme.com"); 
 
        // Find the element that's ID attribute is 'pwd' (Password)
 
        // Enter Password on the element found by the above desc.
 
        driver.findElement(By.id("password")).sendKeys("skills@08");
 
        // Now submit the form. WebDriver will find the form for us from the element 
 
        driver.findElement(By.xpath("//button[normalize-space(text()=' SIGN IN  ')]")).click();
 
        // Print a Log In message to the screen
 
        System.out.println("Login Successfully");
 
        // Find the element that's ID attribute is 'account_logout' (Log Out)
 
        driver.findElement (By.xpath(".//*[@id='header']/div/ul[2]/li[2]/a/span")).click();
        
        driver.findElement (By.partialLinkText("Logout")).click();
        // Print a Log In message to the screen
 
        System.out.println("LogOut Successfully");
 
        // Close the driver
 
        driver.quit();
 
	}
}
