package Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import POJO.BaseTest;
import Utility.Screenshot;

public class TestListeners extends BaseTest implements ITestListener {
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + "test has started");
	}
	public void onTestFailure(ITestResult result) {
		try {
			Screenshot.takescreenshot(result.getName(), driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + "test success");
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName() + "test skipped");
	}

}
