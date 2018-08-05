package Sample;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gestures extends Base{
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	    // Tap 
		System.out.println("");
		TouchAction t = new TouchAction(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   t.tap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
	}

	



}
