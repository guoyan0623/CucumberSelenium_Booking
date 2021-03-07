package StepDefinition;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pageFactory.BookingLoginPage_PF;
import pageFactory.Register_PF;


public class RegisterStep_PF{
	Register_PF register;
	WebDriver driver = null;
	@Before
	public void browserSetup() {
		 String projectPath = System.getProperty("user.dir");
		    System.out.println("Project path is:"+projectPath);
		    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
			
		    driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	}
	//execute after every scenario
	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
	@Given("user is navigated to registeration page")
	public void user_is_navigated_to_registeration_page() throws InterruptedException {
		driver.navigate().to("https://www.booking.com/");
		Thread.sleep(2000);
		register = new Register_PF(driver);
		register.clickRegister();
		
	}
	
	@When("^user provides with (.*)$")
	public void user_provides_with_email(String username) {
		register = new Register_PF(driver);
		register.enterUsername(username);
		register.continueemail();
	}

	@And("^user provide with (.*)$")
	public void user_provides_with_password(String password) {
		register = new Register_PF(driver);
		register.enterPassword(password);
		register.confirmPassword(password);
		register.createAccount();
		
	}

	@Then("validate the welcome page")
	public void validate_the_welcome_page() {
		driver.getPageSource().contains("Booking.com");
		
	}

	
	
}
