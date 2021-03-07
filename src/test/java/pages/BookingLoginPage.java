//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//
//public class BookingLoginPage {
// protected WebDriver driver;
// private By txt_username = By.id("username");
// private By txt_password = By.id("password");
// private By continuewithemail = By.xpath("//span[contains(text(),'Continue with email')]");
// private By button_login = By.xpath("//span[contains(text(),'Sign in')]");
// private By signin = By.xpath("//span[contains(text(),'Sign in')]");
//
//
// public BookingLoginPage(WebDriver driver) {
//	 this.driver = driver;
//	 
//	 
// }
// public void signin() {
//	 driver.findElement(signin).click();
// }
// public void enterUsername(String username) {
//	 driver.findElement(txt_username).sendKeys(username);
// }
// public void continueemail() {
//	 driver.findElement(continuewithemail).click();
// }
// public void enterPassword(String password) {
//	 driver.findElement(txt_password).sendKeys(password);
// }
// public void clickLogin() {
//	 driver.findElement(button_login).click();
// }
//
//public void getPageSource() {
//	// TODO Auto-generated method stub
//	driver.getPageSource().contains("Booking");
//}
// 
//}
