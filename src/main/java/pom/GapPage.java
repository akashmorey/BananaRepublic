package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GapPage {

	@FindBy (xpath = "//*[@id=\"topNavWrapper\"]/div/div/ul/li[1]") 	private WebElement New;
	@FindBy (xpath = "//*[@id=\"topNavWrapper\"]/div/div/ul/li[2]") 	private WebElement Women;
	@FindBy (xpath = "//*[@id=\"topNavWrapper\"]/div/div/ul/li[3]") 	private WebElement Men;
	@FindBy (xpath = "//*[@id=\"topNavWrapper\"]/div/div/ul/li[4]") 	private WebElement Girls;
	@FindBy (xpath = "//*[@id=\"topNavWrapper\"]/div/div/ul/li[5]") 	private WebElement Boys;
	@FindBy (xpath = "//*[@id=\"topNavWrapper\"]/div/div/ul/li[6]") 	private WebElement Toddler;
	@FindBy (xpath = "//*[@id=\"topNavWrapper\"]/div/div/ul/li[7]") 	private WebElement Baby;
	@FindBy (xpath = "//*[@id=\"topNavWrapper\"]/div/div/ul/li[8]") 	private WebElement Maternity;
	@FindBy (xpath = "//*[@id=\"topNavWrapper\"]/div/div/ul/li[9]") 	private WebElement Sale;
	@FindBy (xpath = "//input[@type= 'search']") 	                    private WebElement SearchInput;
	@FindBy (xpath = "//button[@type='submit']") 	                    private WebElement SearchIcon;
	@FindBy (xpath = "//button[@data-testid='pause-button']") 	        private WebElement PauseButton ;
	@FindBy (xpath = "//button[@data-testid='play-button']") 	        private WebElement PlayButton;
	@FindBy (xpath = "//div[3]/div/div/div[2]/div/div/div[2]") 	        private WebElement Shop_New_Arrivals;
	@FindBy (xpath = "//a[text()='Shop Cashsoft']") 	                private WebElement Shop_Cashsoft;
	@FindBy (xpath = "//div[6]/div/div/div[2]/div/div/div/button") 	    private WebElement Get_Shopping;
	@FindBy (xpath = "//div[8]/div/div/div/div/div[1]/div/div/button") 	private WebElement Jeans;
	@FindBy (xpath = "//div[8]/div/div/div/div/div[2]/div/div/button") 	private WebElement Dresses;
	@FindBy (xpath = "//div[8]/div/div/div/div/div[3]/div/div/button") 	private WebElement Sweaters;
	@FindBy (xpath = "//div[8]/div/div/div/div/div[4]/div/div/button") 	private WebElement Outerwear;
	@FindBy (xpath = "//div/div/div/button[2]/img") 	                private WebElement NextArrow;
	
	public GapPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void moveToNew(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(New);
	}
	public void moveToWomen(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(Women);
	}
	public void moveToMen(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(Men);
	}
	public void moveToGirls(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(Girls);
	}
	public void moveToBoys(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(Boys);
	}
	public void moveToToddler(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(Toddler);
	}
	public void moveToBaby(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(Baby);
	}
	public void moveToMaternity(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(Maternity);
	}
	public void moveToSale(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(Sale);
	}
	public void EnterSearchInput(String text) {
		SearchInput.sendKeys(text);
	}
	public void clickOnSearchIcon() {
		SearchIcon.click();
	}
	public void clickOnPauseButton() {
		PauseButton.click();
	}
	public void clickOnPlayButton() {
		PlayButton.click();
	}
	public void clickOnShop_New_Arrivals() {
		Shop_New_Arrivals.click();
	}
	public void clickOnShop_Cashsoft() {
		Shop_Cashsoft.click();
	}
	public void clickOnGet_Shopping() {
		Get_Shopping.click();
	}
	public void clickOnJeans(int no) {
		Jeans.click();
		Select s = new Select(Jeans);
		s.selectByIndex(no);
	}
	public void clickOnDresses(int no) {
		Dresses.click();
		Select s = new Select(Dresses);
		s.selectByIndex(no);
	}
	public void clickOnSweaters(int no) {
		Sweaters.click();
		Select s = new Select(Sweaters);
		s.selectByIndex(no);
	}
	public void clickOnOuterwear(int no) {
		Outerwear.click();
		Select s = new Select(Outerwear);
		s.selectByIndex(no);
	}
	public void clickOnNextArrow() {
		NextArrow.click();
	}

}
