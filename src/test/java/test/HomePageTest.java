package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.HomePage;
import pom.SearchProductResultPage;
import pom.SignInOrJoinPage;
import pom.SignUpPage;

public class HomePageTest extends BaseTest{
	@BeforeMethod
	public void openChrome() {
		driver=Browser.chrome();
	}
	
	@Test
	public void verifyUserIsAbleToSignIn()  {
		SignUpPage signUpPage =new SignUpPage(driver);
		signUpPage.clickOnClosePopupButton(driver);
		HomePage homePage=new HomePage(driver);
		homePage.clickOnSignUpButtonLink();
		SignInOrJoinPage signInOrJoinPage=new SignInOrJoinPage(driver);
		
		signInOrJoinPage.enterEmailField("moreya750@gmail.com");
		signInOrJoinPage.clickOnContinewButton();
		}
	
	@Test
	public void verifyUserIsAbleSerchProduct() throws InterruptedException {
		SignUpPage signUpPage =new SignUpPage(driver);
		signUpPage.clickOnClosePopupButton(driver);
		HomePage homePage=new HomePage(driver);
		homePage.enterSearchField("shoes");
		homePage.clickOnSearchButton();
		SearchProductResultPage searchProductResultPage =new SearchProductResultPage(driver);
		int a=searchProductResultPage.getSizeOfProducts(driver);
		Assert.assertNotEquals(a, 0);
	}
	@Test
	public void verifyUserIsAbleToApplyFilterForSearchProduct() throws InterruptedException {
		HomePageTest homePageTest=new HomePageTest();
		homePageTest.verifyUserIsAbleSerchProduct();
		
		SearchProductResultPage serResultPage=new SearchProductResultPage(driver);
		serResultPage.clickOnFilterButton(driver);
		serResultPage.selectDepartments(2, driver);
		serResultPage.selectColour(1, driver);
		
	}
	
	
	
	

}
