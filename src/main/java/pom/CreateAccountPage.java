package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	@FindBy (xpath = "//input[@id='create-account-first-name']") 	private WebElement firstNameField;
	@FindBy (xpath = "//input[@id='create-account-last-name']") 	private WebElement lastnameField;
	@FindBy (xpath = "//input[@name='new-password']") 				private WebElement passwordFied;
	@FindBy (xpath = "//span[text()='Use another email address']") 	private WebElement useAnotherEmail;
	@FindBy (xpath = "//div[text()='Enter your first name.']") 		private WebElement firstNameFieldError;
	@FindBy (xpath = "//div[text()='Enter your last name.']") 		private WebElement lastNameFieldError;
	@FindBy (xpath = "//div[text()='Password cannot be blank.']") 	private WebElement passwordFieldError;
	@FindBy (xpath = "//p[text()='SHOW']") 							private WebElement passwordShowButton;
	@FindBy (xpath = "//span[text()='Mobile Number']") 				private WebElement mobileNumberField;
	@FindBy (xpath = "//button[text()='CREATE ACCOUNT']") 			private WebElement createAccountButton;
	@FindBy (xpath = "//a[@class=\"p-link-a\"][2]") 			    private WebElement Privacy_Policy;
	@FindBy (xpath = "//a[@class=\"p-link-a\"][1]") 			    private WebElement Terms_Condition;


	public CreateAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterFirstName(String FirstName) {
		firstNameField.sendKeys(FirstName);
	}
	public void enterLastName(String LastName) {
		lastnameField.sendKeys(LastName);
	}
	public void enterPassword(String Pass) {
		passwordFied.sendKeys(Pass);
	}
	public void clickOnShowPassword() {
		passwordShowButton.sendKeys();
	}
	public void enterMobileNumber(CharSequence[] mobile) {
		mobileNumberField.sendKeys(mobile);
	}
	public void clickOncreateAccountButton() {
		createAccountButton.click();
	}
	public void clickOnuseAnotherEmail() {
		useAnotherEmail.click();
	}
	public void clickOnTermsAndCondition() {
		Terms_Condition.click();
	}
	public void clickOnPrivacyAndPolicy() {
		Privacy_Policy.click();
	}
	
}
