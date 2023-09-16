package pom;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProductResultPage {
	@FindBy (xpath = "//button[@id='filterButton']" ) 		private WebElement filterButton;
	@FindBy (xpath = "//button[text()='sort']" ) 			private WebElement sortButton;
	@FindBy (xpath = "//div[@spacing='0.5']") 				private List <WebElement> products;
	@FindBy (xpath = "//span[text()='Download our App']") 	private WebElement downloadAppLink;
	@FindBy (xpath = "//button[@id='nebula_div_btn']" ) 	private WebElement feedbackButton;
	@FindBy (xpath = "//li[@aria-selected='false']") 		private List <WebElement> sortButtonOptions;
	
	//filters
	@FindBy (xpath = "//button[text()='Department']") 		private WebElement departments;
	@FindBy (xpath = "//button[text()='Color']") 			private WebElement colours;
	@FindBy (xpath = "//button[text()='Price']") 			private WebElement prices;
	@FindBy (xpath = "//button[text()='occasion']") 		private WebElement occasions;
	@FindBy (xpath = "//button[text()='Fabric Material']") 	private WebElement fabricMaterials;
	
	
	public SearchProductResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public int getSizeOfProducts() {
		int size=products.size();
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
	public void clickOnFilterButton() {
		filterButton.click();
	}
	public void clickOnDepartments () {
		departments.click();
	}
	public void clickOnColours () {
		colours.click(); 
		
	}
	public void clickOnPrices () {
		prices.click();
		
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
