package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetaillPage {
	@FindBy (xpath = "//button[text()='Exclusions apply']") 			private WebElement exclusionsApply;
	@FindBy (xpath = "//div[@class='amount-price']") 					private WebElement productPrice;
	@FindBy (xpath = "//input[@name='color-radio']") 					private List <WebElement> selectProductColours;
	@FindBy (xpath = "//div[@id='swatch-label--Color']") 				private WebElement productColour;
	@FindBy (xpath = "//span[@class='pdp-dimension__text']") 			private List <WebElement> productSizes ;
	@FindBy (xpath = "//button[@id='AddToBag_add-to-bag__button']") 	private WebElement addToBagButton;
	@FindBy (xpath = "//button[text()='Want it sooner? Find in store']")private WebElement wantToSooner; //dropdown
	@FindBy (xpath = "//span[text()='Select a store to check Pickup In-Store product availability']") 	private WebElement freePickupErrorMassege;
	@FindBy (xpath = "//p[text()='Free Pickup']") 														private WebElement freePickupRadio;
	@FindBy (xpath = "//button[text()='Change Store']") 												private WebElement changeStore;
	@FindBy (xpath = "//div[@class='radio-container checked pdp-mfe-18qv8es']") 						private WebElement freeFastShippingRadio ;
	@FindBy (xpath = "//button[text()='product details']") 												private WebElement productDetaill;
	@FindBy (xpath = "//button[text()='Fit & Sizing']") 												private WebElement fitAndSizing;
	@FindBy (xpath = "//button[text()='fabric & care']") 												private WebElement fabricAndCare;
	@FindBy (xpath = "//button[text()='Reviews']") 														private WebElement reviews;
	@FindBy (xpath = "//span[@data-testid='bag-count']") 												private WebElement bagButton;
	
	public ProductDetaillPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnExclusionsApply() {
		exclusionsApply.click();
	}
	public double getProductPrice() {
		String price=productPrice.getText().substring(1);
		double d=Double.parseDouble(price);
		return d;
	}
	public void selectProductColour(int i) {
		selectProductColours.get(i).click();
	}
	public String getPorductColour() {
		String s=productColour.getText().substring(7);
		return s;
	}
	public void selectProductSize(int i) {
		productSizes.get(i).click();
	}
	public  void clickOnAddToBagButton() {
		addToBagButton.click();
	}
	public void clickOnWantToSooner() {
		wantToSooner.click();
	}
	public boolean ToCheckErrorMassageOfFreePickup() {
		boolean result=freePickupErrorMassege.isDisplayed();
		return result;
	}
	public void clickOnFreePickupRadio() {
		freePickupRadio.click();
	}
	public void clickOnChangeStore() {
		changeStore.click();
	}
	public void clickOnFreeFastShippingRadio() {
		freeFastShippingRadio.click();
	}
	public void clickOnProductDetaill() {
		productDetaill.click();
	}
	public void clickOnFitAndSizing () {
		fitAndSizing.click();
	}
	public void clickOnFabricAndCare () {
		fabricAndCare.click();
	}
	public void clickOnReviews () {
		reviews.click();
	}
	public void clickOnBagButton () {
		bagButton.click();
	}
}
