package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_PF{
	@FindBy(xpath="//span[contains(text(),'Register')]")
	WebElement register;
	
	@FindBy(id="username")
    WebElement txt_username;
	
	@FindBy(xpath="//span[contains(text(),'Continue with email')]")
	WebElement continuewithemail;
	
	@FindBy(id="new_password")
	WebElement txt_password;
	
	@FindBy(id="confirmed_password")
	WebElement con_password;
	
	@FindBy(xpath="//span[contains(text(),'Create account')]")
	WebElement create_account;
	
	WebDriver driver; 
	
	public Register_PF(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickRegister() {
		register.click();
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
	 public void confirmPassword(String password) {
		 con_password.sendKeys(password);
	 }
	 public void createAccount() {
		 create_account.click();
	 }
}
