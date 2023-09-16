package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
public static ExtentReports createReports() {
		
		ExtentSparkReporter htmlReports = new ExtentSparkReporter("BananaRepublic Test Result.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReports);
		extent.setSystemInfo("BananaRepublic", "Regression Test");
		extent.setSystemInfo("Tested By", "Akash");
		return extent;
	}
}
