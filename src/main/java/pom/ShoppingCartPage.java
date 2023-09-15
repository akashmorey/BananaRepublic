package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCartPage {
	
	@FindBy (xpath = "//a[@class='offerDetailsButton']")            private WebElement OfferDeatails;
	@FindBy (xpath = "//a[text()= 'apply now']")				    private WebElement ApplyNow;
	@FindBy (xpath = "//span[@class='remove-button__times-icon']")	private WebElement RemoveButton;
	@FindBy (xpath = "//button[text()='Save For Later']")			private WebElement SaveForLater;
	@FindBy (xpath = "//div[1]/section/ul/li/section/div[2]/div[2]/div/div/div/button")	private WebElement Quantity ;
	@FindBy (xpath = "//div[1]/section/ul/li/div[1]/label[2]/span/span[2]/button")		private WebElement FindAStore;
	@FindBy (xpath = "//div[@ class='fui_radio-button bopis-fulfillment__button shopping-bag-1vz6iww']")	private WebElement PickUp;
	@FindBy (xpath = "//button[@id='checkout-button']")				private WebElement Checkout ;
	@FindBy (xpath = "//img [@aria-label=\"paypal\"]")	        	private WebElement PayPal;
	@FindBy (xpath = "//span[text()= 'Enter Promo Code']")		    private WebElement EnterPromoCode;
	@FindBy (xpath = "//button[text()='APPLY']")				    private WebElement APPLY;
	@FindBy (xpath = "//div[1]/aside/section[1]/div/div[2]/div[5]/div/div/div/a")		private WebElement LimitsApply ;


	public ShoppingCartPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public void clickOnOfferDeatails() {
		OfferDeatails.click();
	}
	public void clickOnApplyNow() {
		ApplyNow.click();
	}
	public void clickOnRemoveButton() {
		RemoveButton.click();
	}
	public void clickOnSaveForLater() {
		SaveForLater.click();
	}
	public void selectQuantity(int no) {
		Quantity.click();
		Select s = new Select(Quantity);
		s.selectByIndex(no);
	}
	public void clickOnFindAStore() {
		FindAStore.click();
	}
	public void clickOnPickUp() {
		PickUp.click();
	}
	public void clickOnCheckout() {
		Checkout.click();
	}
	public void clickOnPayPal() {
		PayPal.click();
	}
	
	public void clickOnEnterPromoCode() {
		EnterPromoCode.click();
	}
	public void clickOnAPPLY() {
		APPLY.click();
	}
	public void clickOnLimitsApply() {
		LimitsApply.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
