package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class SignUpPage {
	@FindBy (xpath = "//button[@aria-label='close email sign up modal']") 	private WebElement closeButton;
	@FindBy (xpath = "//span[text()='Enter Your Email Address']") 			private WebElement emailField;
	@FindBy (xpath = "//button[text()='Sign up now']")  					private WebElement signUpNowButton;
	
	@FindBy (xpath = "//span[text()='Enter Your Email Address']")      private WebElement emailField2;
	@FindBy (xpath = "//button[text()='Sign up now']")				private WebElement signUp;
	
	public SignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterEmailFieldWithIframe(String email,WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOf(emailField2));
		emailField2.sendKeys(email);
	}
	public void clickOnSignUpNow() {
		signUp.click();
	}
	
	public void clickOnClosePopupButton(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOf(closeButton));
		closeButton.click();
	}
	public void enterEmailField(String email) {
		emailField.sendKeys(email);
	}
	public void clickOnSignUpNowButton(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOf(signUpNowButton));
		signUpNowButton.click();
	}
}
