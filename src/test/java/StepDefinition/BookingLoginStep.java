//package StepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import org.openqa.selenium.By;
//
//import io.cucumber.java.en.*;
//
//public class BookingLoginStep {
//	WebDriver driver = null;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		   String projectPath = System.getProperty("user.dir");
//		    System.out.println("Project path is:"+projectPath);
//		    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
//			
//		    driver = new ChromeDriver();
//		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		    
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		driver.navigate().to("https://www.booking.com/");
//	}
//	@When("user clicks on signin")
//	public void user_clicks_on_signin() {
//		driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
//		
//	}
//
//	@And("^user enters (.*)$")
//	public void user_enters_username(String username) {
//		driver.findElement(By.id("username")).sendKeys(username);
//		driver.findElement(By.xpath("//span[contains(text(),'Continue with email')]")).click();
//	}
//
//	@And("^user enter (.*)$")
//	public void user_enters_password(String password) {
//		driver.findElement(By.id("password")).sendKeys(password);
//		
//		
//	}
//	@And("user clicks on login")
//	public void user_clicks_on_login() throws InterruptedException {
//		driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
//		Thread.sleep(2000);
//	}
//
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() throws InterruptedException {
//		driver.getPageSource().contains("Booking.com");
//		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
//	}
//}
