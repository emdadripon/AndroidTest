package Sample;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class swipeTest extends Base{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		TouchAction touch = new TouchAction(driver);
         
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	driver.findElementByXPath("//*[@content-desc='9']").click();
		
		touch.press(driver.findElementByXPath("//*[@content-desc='9']")).waitAction().moveTo(driver.findElementByXPath("//*[@content-desc='3']")).perform();
	
	
	}

}
