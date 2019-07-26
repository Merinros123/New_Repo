/*package com.mobile.listener;

import java.util.List;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import com.mobile.test.ZmaTest
import io.appium.java_client.MobileElement;

*//**
 * 
 * @author monsoor.choudhury
 *
 *//*


*//**
  This listner is used to check for Mobile App Crash during the execution. Also to verify the Server Error encountered
 *//*

public class TestListeners extends ZmaTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		String activity = driver.currentActivity();
		if (!activity.equals(".MainActivity")){
			System.out.println("App Crashed");
			Reporter.log("<font color='red'>App Crashed</font>"+"<br>");
			driver.closeApp();
			driver.quit();
		}

		System.out.println(errorText);
			if(!errorText.contains("Server Error")){
				System.out.println(errorText);
				Reporter.log(errorText);
				System.out.println("Server Error!");
				driver.close();
			}

		List<MobileElement> ele=(List<MobileElement>) driver.findElements(By.className("android.widget.TextView"));
		for(int i=0;i<ele.size();i++){
			if(ele.get(i).getText().contains("Server Error"))
			{
				Reporter.log("<font color='red'> Server Error!</font>"+"<br>");
				Assert.fail("Server Error!");
			}
			else{
				System.out.println("No error encountered");
			}
		}
	}

	@Override
	public void onTestSuccess(ITestResult result) {

	}

	@Override
	public void onTestFailure(ITestResult result) {


	}

	@Override
	public void onTestSkipped(ITestResult result) {


	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}
}
*/