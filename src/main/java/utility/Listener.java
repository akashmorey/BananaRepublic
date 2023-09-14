package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends BaseTest implements ITestListener {
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test is started:" +result.getName());
	}
	

	public void onTestFailure(ITestResult result) 
	{	
	try
	{
		Screenshot.clickScreenshot(driver, result.getName());
	}
	catch (IOException e) 
	{
		
		e.printStackTrace();
	}
	}
	
	public void onTestSucess(ITestResult result)
	{
	}

}
