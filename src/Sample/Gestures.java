package Sample;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gestures extends Base{
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	    // Tap 
	
		TouchAction t = new TouchAction(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
		t.tap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    t.press(driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"))).waitAction().release().perform();
	   System.out.println(driver.findElementById("android:id/alertTitle").getText());
	
	}

	



}
