package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AthletaPage {
	@FindBy (xpath = "//a[text()='New']") 									private WebElement newButton;
	@FindBy (xpath = "//a[text()='Bottoms']") 								private WebElement buttoms;
	@FindBy (xpath = "Tops") 												private WebElement tops;
	@FindBy (xpath = "Bras") 												private WebElement bras;
	@FindBy (xpath = "//a[text()='Dresses']") 								private WebElement dresses;
	@FindBy (xpath = "//a[text()='Jackets']") 								private WebElement jackets ;
	@FindBy (xpath = "//a[text()='Swim']") 									private WebElement swim;
	@FindBy (xpath = "//a[text()='Accessories']") 							private WebElement accessories ;
	@FindBy (xpath = "//a[text()='Athleta Girl']") 							private WebElement athletaGirl;
	@FindBy (xpath = "//a[text()='Sale']") 									private WebElement sale;
	@FindBy (xpath = "//a[text()='Preloved']") 								private WebElement preloved ;
	@FindBy (xpath = "//a[text()='Stores & Events']") 						private WebElement storesAndEvents;
	@FindBy (xpath = "//a[text()='Athleta Rewards']") 						private WebElement athletaRewards;
	@FindBy (xpath = "//a[text()='Gift Card']") 							private WebElement giftCard;
	@FindBy (xpath = "//a[text()='SHOP IT FIRST']")						 	private WebElement shopItFirst;
	@FindBy (xpath = "//a[text()='Shop New Arrivals']") 					private WebElement shopNewArrivals;
	@FindBy (xpath = "//a[text()='Shop Pants']") 							private WebElement shopPants;
	@FindBy (xpath = "//button[@class='slick-arrow slick-prev sitewide-0']")private WebElement previousButton;
	@FindBy (xpath = "//button[@class='slick-arrow slick-next sitewide-0']")private WebElement nextButton ;
	@FindBy (xpath = "//span[text()='Tights & Leggings']") 					private WebElement tightsAndLaggings;
	@FindBy (xpath = "//span[text()='Back to School']")						private WebElement backToSchool ;
	@FindBy (xpath = "//span[text()='Sweatshirts & Jackets']") 				private WebElement sweatshirtsAndJackets ;
	@FindBy (xpath = "//div[text()='why this matters']") 					private WebElement whyThisMattersButtonLink;
	@FindBy (xpath = "//div[text()='search jobs']") 						private WebElement searchJobs;
	@FindBy (xpath = "//a[text()='Apply Now']") 							private WebElement aplyNow;
	@FindBy (xpath = "//a[text()='Learn More']") 							private WebElement learnMore;
	@FindBy (xpath = "(//button[text()='Join Here'])[1]") 					private WebElement joinHere ;
	@FindBy (xpath = "//a[text()='Privacy Policy ']") 						private WebElement privacyPolicyButtonLink;
	@FindBy (xpath = "//div[text()='Terms & Conditions']") 					private WebElement termsAndConditions;
	
	@FindBy (xpath = "//span[text()='Customer Service']") 			private WebElement custemerService;
	@FindBy (xpath = "//span[text()='Shipping']") 					private WebElement shipping;
	@FindBy (xpath = "//span[text()='Free Returns']") 				private WebElement freeReturns;
	@FindBy (xpath = "//span[text()='Track Your Order']") 			private WebElement trackYourOrder;
	@FindBy (xpath = "//span[text()='Gift Cards']") 				private WebElement giftCards;
	@FindBy (xpath = "//span[text()='Size & Fit Guides']") 			private WebElement sizeAndFitGuides;
	
	public AthletaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnNewButton () {
		newButton.click();
	}
	public void clickOnButtoms () {
		buttoms.click();
	}
	public void clickOnTops () {
		tops.click();
	}
	public void clickOnBras () {
		bras.click();
	}
	public void clickOnDresses () {
		dresses.click();
	}
	public void clickOnJackets () {
		jackets.click();
	}
	public void clickOnSwim () {
		swim.click();
	}
	public void clickOnAccessories () {
		accessories.click();
	}
	public void clickOnAthletaGirl () {
		athletaGirl.click();
	}
	public void clickOnSale () {
		sale.click();
	}
	public void clickOnPreloved () {
		preloved.click();
	}
	public void clickOnStoresAndEvents () {
		storesAndEvents.click();
	}
	public void clickOnAthletaRewards () {
		athletaRewards.click();
	}
	public void clickOnGiftCard () {
		giftCard.click();
	}
	public void clickOnShopItFirst () {
		shopItFirst.click();
	}
	public void clickOnShopNewArrivals () {
		shopNewArrivals.click();
	}
	public void clickOnShopPants () {
		shopPants.click();
	}
	public void clickOnPreviousButton () {
		previousButton.click();
	}
	public void clickOnNextButton () {
		nextButton.click();
	}
	public void clickOnTightsAndLaggings () {
		tightsAndLaggings.click();
	}
	public void clickOnBackToSchool () {
		backToSchool.click();
	}
	public void clickOnSweatshirtsAndJackets () {
		sweatshirtsAndJackets.click();
	}
	public void clickOnWhyThisMattersButtonLink () {
		whyThisMattersButtonLink.click();
	}
	public void clickOnSearchJobs () {
		searchJobs.click();
	}
	public void clickOnAplyNow () {
		aplyNow.click();
	}
	public void clickOnLearnMore () {
		learnMore.click();
	}
	public void clickOnJoinHere () {
		joinHere.click();
	}
	public void clickOnPrivacyPolicyButtonLink () {
		privacyPolicyButtonLink.click();
	}
	public void clickOnTermsAndConditions () {
		termsAndConditions.click();
	}
	public void clickOnCustemerService () {
		custemerService.click();
	}
	public void clickOnShipping () {
		shipping.click();
	}
	public void clickOnFreeReturns () {
		freeReturns.click();
	}
	public void clickOnTrackYourOrder () {
		trackYourOrder.click();
	}
	public void clickOnGiftCards () {
		giftCards.click();
	}
	public void clickOnSizeAndFitGuides () {
		sizeAndFitGuides.click();
	}
	
}
