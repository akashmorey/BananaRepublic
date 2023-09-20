package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddedToYourBagPopupPage {
	@FindBy (xpath = "//button[@aria-label='close modal']") private WebElement close;
	@FindBy (xpath = "//a[@id='productTitle0']") private WebElement productName;
	@FindBy (xpath = "(//span[@class='insitu-modal__product-description'])[1]") private WebElement productColour;
	@FindBy (xpath = "(//span[@class='insitu-modal__product-description'])[2]") private WebElement productSize;
	@FindBy (xpath = "(//span[@class='insitu-modal__product-description'])[3]") private WebElement productQty;
	@FindBy (xpath = "//a[text()='sign in']") private WebElement signIn ;
	@FindBy (xpath = " //a[text()='join now']") private WebElement joinNow;
	@FindBy (xpath = "//button[text()='keep shopping']") private WebElement keepShoppingButton;
	@FindBy (xpath = "//button[text()='checkout']") private WebElement checkOutButton;
	@FindBy (xpath = "//span[@class='insitu-modal__item-count']") private WebElement cartQty;
	@FindBy (xpath = "//div[@class='insitu-modal__subtotal']") private WebElement subTotatPrice;

	public AddedToYourBagPopupPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCloseButton () {
		close.click();
	}
	public String getProductName() {
		String name=productName.getText();
		return name;
	}
	public String getProductSize() {
		String size=productSize.getText();
		return size;
	}
	public int getProductQty() {
		String s=productQty.getText();
		int i=Integer.parseInt(s);
		return i;
	}
	public void clickOnSignIn () {
		signIn.click();
	}
	public void clickOnJoinNow () {
		joinNow.click();
	}
	public void clickOnKeepShoppingButton() {
		keepShoppingButton.click();
	}
	public void clickOnCheckOutButton() {
		checkOutButton.click();
	}
	public double getTotalCartQty() {
		String s=cartQty.getText().substring(0,1);
		double d=Double.parseDouble(s);
		return d;
	}
	public double getSubTotalPrice () {
		String s=subTotatPrice.getText().substring(10);
		double d=Double.parseDouble(s);
		return d;
	}
	
}
