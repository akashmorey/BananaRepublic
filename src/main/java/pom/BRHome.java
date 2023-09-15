package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BaseTest;

public class BRHome {
	
	@FindBy (xpath = "//*[@id=\"headerContent\"]/div/div[1]/nav/div/ul/li[1]") 	private WebElement Living;
	@FindBy (xpath = "//*[@id=\"headerContent\"]/div/div[1]/nav/div/ul/li[2]") 	private WebElement Dining;
	@FindBy (xpath = "//*[@id=\"headerContent\"]/div/div[1]/nav/div/ul/li[3]") 	private WebElement Bedroom ;
	@FindBy (xpath = "//*[@id=\"headerContent\"]/div/div[1]/nav/div/ul/li[4]") 	private WebElement Rugs;
	@FindBy (xpath = "//*[@id=\"headerContent\"]/div/div[1]/nav/div/ul/li[5]") 	private WebElement Bedding;
	@FindBy (xpath = "//*[@id=\"headerContent\"]/div/div[1]/nav/div/ul/li[6]") 	private WebElement Lighting;
	@FindBy (xpath = "//*[@id=\"headerContent\"]/div/div[1]/nav/div/ul/li[7]") 	private WebElement Decor;
	@FindBy (xpath = "//*[@id=\"headerContent\"]/div/div[1]/nav/div/ul/li[8]") 	private WebElement Atelier;
	@FindBy (xpath = "//*[@id=\"headerContent\"]/div/div[1]/nav/div/ul/li[9]") 	private WebElement ReadyToWear;
	
	@FindBy (xpath = "//*[@id='searchTrigger']") 	            private WebElement Search;
	@FindBy (xpath = "//*[@id='searchInput']") 	                private WebElement SearchInput;
	@FindBy (xpath = "//*[@id=\"searchForm\"]/div/button[2]/i") private WebElement SearchIcon;
	@FindBy (xpath = "//div/div[1]/div[2]/a[1]/i") 	            private WebElement Account ;
	@FindBy (xpath = "//div/div[1]/div[2]/a[2]/i") 	            private WebElement Cart;
	@FindBy (xpath = "//*[@id='emailForm']") 	                private WebElement Email;
	@FindBy (xpath = "//section/section[1]/div[2]/ul/li[1]") 	private WebElement FindAStore;
	
	@FindBy (xpath = "//section/section[2]/div/div[1]/section/div[1]/ul/li[1]/a") 	private WebElement Shipping_Handling;
	@FindBy (xpath = "//section/section[2]/div/div[1]/section/div[1]/ul/li[2]/a") 	private WebElement Returns_Exchange;
	@FindBy (xpath = "//section/section[2]/div/div[1]/section/div[3]/ul/li[1]/a") 	private WebElement Contact_Us;
	
	
	public BRHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void moveToLiving(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(Living);
	}
	public void moveToDining(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(Dining);
	}
	public void moveToBedroom(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(Bedroom);
	}
	public void moveToRugs(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(Rugs);
	}
	public void moveToBedding(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(Bedding);
	}
	public void moveToLighting(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(Lighting);
	}
	public void moveToDecor(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(Decor);
	}
	public void moveToAtelier(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(Atelier);
	}
	public void clickOnReadyToWear() {
		ReadyToWear.click();
	}
	public void clickOnSearch() {
		Search.click();	
	}
	public void EnterToSearchInput(String text) {
		SearchInput.sendKeys(text);	
	}
	public void clickOnSearchIcon() {
		SearchIcon.click();	
	}
	public void clickOnAccount() {
		Account.click();	
	}
	public void clickOnCart() {
		Cart.click();	
	}
	public void EnterEmail(String mail) {
		Email.sendKeys(mail);	
	}
	public void clickOnFindAStore() {
		FindAStore.click();	
	}
	public void clickOnShipping_Handling() {
		 Shipping_Handling.click();	
	}
	public void clickOnReturns_Exchange() {
		Returns_Exchange.click();	
	}
	public void clickOnContact_Us() {
		Contact_Us.click();	
	}

}
