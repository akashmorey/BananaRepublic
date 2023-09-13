package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {

	
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

}
