package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInOrJoinPage {
	@FindBy (xpath = "//input[@data-testid='email-input']") 			private WebElement emailFied;
	@FindBy (xpath = "//div[text()='Email address cannot be blank.']") 	private WebElement emailFieldError;
	@FindBy (xpath = "(//button[@type='submit'])[2]") 					private WebElement continewButton;
	@FindBy (xpath = "//a[text()='Manage']") 	 						private WebElement manageLink; 
	@FindBy (xpath = "//button[text()='Back']") 						private WebElement backButton;
	
	public SignInOrJoinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailField(String email) {
		emailFied.sendKeys(email);
	}
	public boolean verifyEmailErrorMassege() {
		boolean result=emailFieldError.isDisplayed();
		return result;
	}
	public void clickOnContinewButton() {
		continewButton.click();
	}
	public void clickOnManageButtonLink() {
		manageLink.click();
	}
	public void clickOnBackButton() {
		backButton.click();
	}
}
