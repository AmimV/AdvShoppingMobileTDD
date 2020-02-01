package br.com.rsinet.hub_TDD.Utils;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import br.com.rsinet.hub_TDD.PageFactory.Criar_Conta;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Hooks extends Report {
	
	private DesiredCapabilities caps;
	private AndroidDriver<MobileElement> driver;
	protected Criar_Conta cc;

	
	@BeforeTest
	public void InicializaApp() throws MalformedURLException {
		
		Report.setReport("Aguarde");
		caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Galaxy J6+");
		caps.setCapability("udid", "7c98e43b");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9");
		caps.setCapability("appPackage", "com.Advantage.aShopping");
		caps.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, caps);
		
		cc = new Criar_Conta(driver);
	}
	@AfterMethod
	public void fim(ITestResult result) throws IOException {
		Report.statusReported(test, result, driver);
		Report.quitExtent(extent);
	}
	

}
