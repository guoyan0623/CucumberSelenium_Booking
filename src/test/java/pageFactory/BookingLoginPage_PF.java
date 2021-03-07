package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingLoginPage_PF {
	@FindBy(xpath="//span[contains(text(),'Sign in')]")
	WebElement signin;
	
	@FindBy(id="username")
    WebElement txt_username;
	
	 @FindBy(xpath="//span[contains(text(),'Continue with email')]")
		WebElement continuewithemail;
	
	@FindBy(id="password")
	WebElement txt_password;
	
   
    
	@FindBy(xpath="//span[contains(text(),'Sign in')]")
   WebElement button_login;
	

	
	WebDriver driver; 
	
	public BookingLoginPage_PF(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void signin() {
		signin.click();
	 }
	 public void enterUsername(String username) {
		 txt_username.sendKeys(username);
	 }
	 public void continueemail() {
		 continuewithemail.click();
	 }
	 public void enterPassword(String password) {
		 txt_password.sendKeys(password);
	 }
	 public void clickLogin() {
		 button_login.click();
	 }


}
