package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy (xpath = "//a[text()='New']")						private WebElement newButtonLink;
	@FindBy (xpath = "//a[text()='Women']")						private WebElement womenButtonLink;
	@FindBy (xpath = "//a[text()='Men']")						private WebElement menButtonLink;
	@FindBy (xpath = "//a[text()='Baby & Toddler']")			private WebElement babyAndToddlerButtonLink;
	@FindBy (xpath = "(//a[text()='Home'])[2]")					private WebElement homeButtonLink;
	@FindBy (xpath = "//a[text()='BR Classics']")				private WebElement BrBasicsButtonLink;
	@FindBy (xpath = "(//a[text()='Cashmere'])[1]")				private WebElement cashmereButtonLink;
	@FindBy (xpath = "//a[text()='Sale']")						private WebElement saleButtonLink;
	@FindBy (xpath = "//input[@type='search']")					private WebElement searchField;
	@FindBy (xpath = "//button[@type='submit']")				private WebElement searchButton ;
	@FindBy (xpath = "//input[@name='email']")					private WebElement emailField;
	@FindBy (xpath = "//input[@name='phoneNumber']")			private WebElement mobileNumberField;
	@FindBy (xpath = "//button[text()='Sign Up for Emails']")	private WebElement signUpForEmails;
	@FindBy (xpath = "//button[text()='Sign up for Texts']")	private WebElement signUpForMobilr;
	@FindBy (xpath = "//a[text()='SIGN IN OR JOIN']")			private WebElement signUpButtonLink;
	@FindBy (xpath = "//button[@data-testid='account-button']")	private WebElement accountButton;
	@FindBy (xpath = "//button[@id='shopping-bag']")			private WebElement shoppingBagbutton;
	@FindBy (xpath = "(//a[text()='Find a store'])[1]")			private WebElement findStoreButtonLink;
	@FindBy (xpath = "(//a[text()='Gift Card'])[1]")			private WebElement giftCardButtonLink;
	@FindBy (xpath = "(//a[text()='Credit Card'])[1]")			private WebElement creaditCardButtonLink;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
