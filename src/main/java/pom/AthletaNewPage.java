package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AthletaNewPage {
	
	@FindBy (xpath = "//header/div[4]/div/div/div[1]") 				    	            private WebElement AthletaLogo ;
	@FindBy (xpath = "//a[text()='New']") 								  	            private WebElement newButton;
	@FindBy (xpath = "//div[1]/div[2]/div/div/div/button") 					            private WebElement SortBy ;
	@FindBy (xpath = "//div/main/div[3]/div[1]/div[2]/div[1]/button") 	             	private WebElement ShowAll;	
	@FindBy (xpath = "//div/main/div[3]/div[1]/div[2]/div[1]/div/div/ul/div/ul/li[1]") 	private WebElement AllNewArrivals ;
	@FindBy (xpath = "//div/main/div[3]/div[1]/div[2]/div[1]/div/div/ul/div/ul/li[2]")  private WebElement buttoms;
	@FindBy (xpath = "//div/main/div[3]/div[1]/div[2]/div[1]/div/div/ul/div/ul/li[3]")	private WebElement tops;
	@FindBy (xpath = "//div/main/div[3]/div[1]/div[2]/div[1]/div/div/ul/div/ul/li[4]") 	private WebElement dresses_JumpSuites;
	@FindBy (xpath = "//div/main/div[3]/div[1]/div[2]/div[1]/div/div/ul/div/ul/li[6]") 	private WebElement bras_Underwear;
	@FindBy (xpath = "//div/main/div[3]/div[1]/div[2]/div[1]/div/div/ul/div/ul/li[5]") 	private WebElement jackets ;
	@FindBy (xpath = "//div/main/div[3]/div[1]/div[2]/div[1]/div/div/ul/div/ul/li[7]") 	private WebElement Accessories ;	
	@FindBy (xpath = "//div[@class='css-0 category-page-o72xrx'][1]") 					private WebElement  Category;
	@FindBy (xpath = "//div[@class='css-0 category-page-o72xrx'][2]") 					private WebElement  Size;
	@FindBy (xpath = "//div[@class='css-0 category-page-o72xrx'][3]") 					private WebElement  Color;
	@FindBy (xpath = "//div[@class='css-0 category-page-o72xrx'][4]")					private WebElement  Price;
	@FindBy (xpath = "//div[@class='css-0 category-page-o72xrx'][5]") 					private WebElement  Rating;
	@FindBy (xpath = "//div[@class='css-0 category-page-o72xrx'][6]") 					private WebElement  Support_Type;
	@FindBy (xpath = "//div[@class='css-0 category-page-o72xrx'][7]") 					private WebElement  Activity;
	@FindBy (xpath = "//div[@class='css-0 category-page-o72xrx'][8]") 					private WebElement  Fabric_Material;
	@FindBy (xpath = "//div[@class='css-0 category-page-o72xrx'][9]") 					private WebElement  Fit;
	@FindBy (xpath = "//div[@class='css-0 category-page-o72xrx'][10]") 					private WebElement  performance_Technology;
	@FindBy (xpath = "//div[@class='css-0 category-page-o72xrx'][11") 					private WebElement  Details;
	@FindBy (xpath = "//div[@class='css-0 category-page-o72xrx'][12]") 					private WebElement  Warmth_Rating;
	@FindBy (xpath = "//div[@class='css-0 category-page-o72xrx'][13]") 					private WebElement  Length;
	@FindBy (xpath = "//div[@class='css-0 category-page-o72xrx'][14]") 					private WebElement  legShape;
	@FindBy (xpath = "//div[@class='css-0 category-page-o72xrx'][15]") 					private WebElement  Collection;
	@FindBy (xpath = "//div[@class='css-0 category-page-o72xrx'][16]") 					private WebElement  Sleeve_Length;
	@FindBy (xpath = "//div[@class='css-0 category-page-o72xrx'][17]") 					private WebElement  Rise;

	
	public AthletaNewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickOnAthletaLogo() {
		AthletaLogo.click();
	}
	public void clickOnNewButton () {
		newButton.click();
	}
	public void sekectOnSortBy (int no) {
		SortBy.click();
		Select s = new Select(SortBy);
		s.selectByIndex(no);
	}
	public void clicOnShowAll () {
		ShowAll.click();
	}
	public void clicOnAllNewArrivals () {
		AllNewArrivals.click();
	}
	public void clickOnButtoms () {
		buttoms.click();
	}
	public void clickOnTops () {
		tops.click();
	}
	public void clickOnBrasUUnderwear () {
		bras_Underwear.click();
	}
	public void clickOnDresses () {
		dresses_JumpSuites.click();
	}
	public void clickOnJackets () {
		jackets.click();
	}
	public void clickOnAccessories () {
		Accessories.click();
	}
	public void selectCategory (int no) {
		Category.click();
		Select s = new Select(Category);
		s.selectByIndex(no);
	}
	public void selectSize (int no) {
		Size.click();
		Select s = new Select(Size);
		s.selectByIndex(no);
	}
	public void selectColor (int no) {
		Color.click();
		Select s = new Select(Color);
		s.selectByIndex(no);
	}
	public void selectPrice (int no) {
		Price.click();
		Select s = new Select(Price);
		s.selectByIndex(no);
	}
	public void selectRating (int no) {
		Rating.click();
		Select s = new Select(Rating);
		s.selectByIndex(no);
	}
	public void selectActivity (int no) {
		Activity.click();
		Select s = new Select(Activity);
		s.selectByIndex(no);
	}
	public void selectSupport_Type (int no) {
		 Support_Type.click();
		Select s = new Select(Support_Type);
		s.selectByIndex(no);
	}
	public void selectFabric_Material (int no) {
		Fabric_Material.click();
		Select s = new Select(Fabric_Material);
		s.selectByIndex(no);
	}
	public void selectFit (int no) {
		Fit.click();
		Select s = new Select(Fit);
		s.selectByIndex(no);
	}
	public void selectperformance_Technology (int no) {
		performance_Technology.click();
		Select s = new Select(performance_Technology);
		s.selectByIndex(no);
	}
	public void selectDetails (int no) {
		Details.click();
		Select s = new Select(Details);
		s.selectByIndex(no);
	}
	public void selectWarmth_Rating (int no) {
		Warmth_Rating.click();
		Select s = new Select(Warmth_Rating);
		s.selectByIndex(no);
	}
	public void selectLength (int no) {
		Length.click();
		Select s = new Select(Length);
		s.selectByIndex(no);
	}
	public void selectlegShape (int no) {
		legShape.click();
		Select s = new Select(legShape);
		s.selectByIndex(no);
	}
	public void selectCollection (int no) {
		Collection.click();
		Select s = new Select(Collection);
		s.selectByIndex(no);
	}
	public void selectSleeve_Length (int no) {
		Sleeve_Length.click();
		Select s = new Select(Sleeve_Length);
		s.selectByIndex(no);
	}
	public void selectRise (int no) {
		Rise.click();
		Select s = new Select(Rise);
		s.selectByIndex(no);
	}
}
