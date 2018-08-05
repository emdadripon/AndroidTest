package Sample;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	 public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {

		    AndroidDriver<AndroidElement> driver;
		 
	        File file = new File("src");
	        File fs = new File(file,"ApiDemos-debug.apk" );

	        DesiredCapabilities cap = new DesiredCapabilities();
	        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Test");
	        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());

	        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        return driver;   
	 
	 }
}
