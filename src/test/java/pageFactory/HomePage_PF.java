package pageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage_PF {
@FindBy(xpath="//span[@class='bui-button__text']/div[@class='bui-avatar-block']")
WebElement but01;

@FindBy(xpath="//form[@data-ga='Sign out']")
WebElement signout;
WebDriver driver; 
public HomePage_PF(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void profileclick() {
	but01.click();
 }


public void Signout() {
	signout.click();
 }

}
