package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInOrJoinPage {
	@FindBy (xpath = "//input[@id='verify-account-email']") private WebElement emailFied;
	@FindBy (xpath = "//div[text()='Email address cannot be blank.']") private WebElement emailFieldError;
	@FindBy (xpath = "(//button[@type='submit'])[2]") private WebElement continewButton;
	@FindBy (xpath = "//a[text()='Manage']") private WebElement manageLink;
	@FindBy (xpath = "//button[text()='Back']") private WebElement backButton;
	
	public SignInOrJoinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
