package pom;

import java.time.Duration;
import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchProductResultPage {
	@FindBy (xpath = "//button[@id='filterButton']" ) 		private WebElement filterButton;
	@FindBy (xpath = "//button[text()='sort']" ) 			private WebElement sortButton;
	@FindBy (xpath = "//div[@spacing='0.5']") 				private List <WebElement> products;
	@FindBy (xpath = "//span[text()='Download our App']") 	private WebElement downloadAppLink;
	@FindBy (xpath = "//button[@id='nebula_div_btn']" ) 	private WebElement feedbackButton;
	@FindBy (xpath = "//li[@aria-selected='false']") 		private List <WebElement> sortButtonOptions;
	
	//filters
	@FindBy (xpath = "//button[text()='Department']") 		private WebElement department;
	@FindBy (xpath = "//div[@class='css-t6qlkq']")			private List <WebElement> departmentsDn;
	@FindBy (xpath = "(//button[text()='Color']") 	private WebElement colour;
	@FindBy (xpath = "//div[@class='css-v9rzsj']")			private List <WebElement> coloursOptions;
	@FindBy (xpath = "//button[text()='Price']") 			private WebElement priceDn;
	@FindBy (xpath = "(//button[@aria-haspopup='listbox'])[2]")	private WebElement minPrizeDn;
	@FindBy (xpath = "//li[@aria-selected='false']")		private List <WebElement> minPrices;
	@FindBy (xpath = "(//div[@class='css-69ar0x'])[2]")		private WebElement maxPrize;
	@FindBy (xpath = "//li[@aria-selected='false']")		private List <WebElement> maxPrices;
	@FindBy (xpath = "//button[text()='Done']")				private WebElement done;
	@FindBy (xpath = "//button[text()='occasion']") 		private WebElement occasions;
	@FindBy (xpath = "//button[text()='Fabric Material']") 	private WebElement fabricMaterials;
	
	
	public SearchProductResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public int getSizeOfProducts(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElements(products));
		int size=products.size();
		System.out.println(size);
		return size;
	}
	public void clickOnPerticularProduct(int i) {
		products.get(i).click();
	}
	public void clickOnFeedbackButton() {
		feedbackButton.click();
	}
	public void clickOnDownloadLink() {
		downloadAppLink.click();		
	}
	
	
	public void clickOnSortButton() {
		sortButton.click();
	}
	public void selectSortOptions(int i) {
		sortButtonOptions.get(i).click();
	}
	
	//Filters
	public void clickOnFilterButton(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(filterButton));
		filterButton.click();
	}
	public void selectDepartments (int i,WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElements(department));
		department.click();
		
		WebDriverWait waits=new WebDriverWait(driver, Duration.ofSeconds(5));
		waits.until(ExpectedConditions.visibilityOfAllElements(departmentsDn));
		departmentsDn.get(i).click();
	}
	public void selectColour (int i,WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(colour));
		colour.click();
		
//		WebDriverWait waits=new WebDriverWait(driver, Duration.ofSeconds(5));
//		waits.until(ExpectedConditions.visibilityOfAllElements(coloursOptions)); 
//		coloursOptions.get(i).click();
	}
	public void clickOnPrice(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElements(priceDn));
		priceDn.click();
	}
	public void clickOnDoneFilters() {
		done.click();
	}
	public void  clickOnPriceDn(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.visibilityOf(priceDn));
		priceDn.click();
	}
	public void selectMinPriceValueFromDn(WebDriver driver,int i) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.visibilityOf(minPrizeDn));
		minPrizeDn.click();
		
		WebDriverWait waits=new WebDriverWait(driver, Duration.ofSeconds(5));
		waits.until(ExpectedConditions.visibilityOfAllElements(minPrices));
		minPrices.get(i).click();
	}
	public void clickOnOccasions () {
		occasions.click();
	}
	public void clickOnFabricMaterials () {
		fabricMaterials.click();
	}
	public void ScrollProductPageToDownloadAppLinc(WebDriver driver,int i) {
		JavascriptExecutor jse=((JavascriptExecutor)driver);
		jse.executeScript("arguments[0].scrollIntoView();", products.get(i)); 
	}
}
