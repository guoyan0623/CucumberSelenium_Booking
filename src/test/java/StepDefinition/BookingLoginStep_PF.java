package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pageFactory.BookingLoginPage_PF;
import pageFactory.HomePage_PF;

public class BookingLoginStep_PF {
	
	BookingLoginPage_PF login;
//	HomePage_PF home;
	WebDriver driver = null;
	//execute before every scenario
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
	

	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		driver.navigate().to("https://www.booking.com/");
		Thread.sleep(2000);
	}
	@When("user clicks on signin")
	public void user_clicks_on_signin() {
		login = new BookingLoginPage_PF(driver);
		login.signin();
		//driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
		
	}

	@And("^user enters (.*)$")
	public void user_enters_username(String username) {
		login = new BookingLoginPage_PF(driver);
		login.enterUsername(username);
		login.continueemail();
		//driver.findElement(By.id("username")).sendKeys(username);
		//driver.findElement(By.xpath("//span[contains(text(),'Continue with email')]")).click();
	}

	@And("^user enter (.*)$")
	public void user_enters_password(String password) {
		login = new BookingLoginPage_PF(driver);
		login.enterPassword(password);
	//	driver.findElement(By.id("password")).sendKeys(password);
		
		
	}
	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
		login = new BookingLoginPage_PF(driver);
		login.clickLogin();
		//driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
		Thread.sleep(2000);
	}


	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		driver.getPageSource().contains("Booking.com");
		
	}
}
