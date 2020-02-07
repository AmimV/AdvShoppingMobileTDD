package br.com.rsinet.hub_TDD.Utils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import br.com.rsinet.hub_TDD.PageObject.Criar_Conta;
import br.com.rsinet.hub_TDD.PageObject.PesquisaPelaLupa;
import br.com.rsinet.hub_TDD.PageObject.PesquisarNaHome;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Hooks extends Report {

	private DesiredCapabilities caps;
	private AndroidDriver<MobileElement> driver;
	private Criar_Conta cc;
	private PesquisarNaHome pesqHome;
	private PesquisaPelaLupa pesqLupa;
	
	@BeforeTest
	public void report() {
		extent = Report.setReport("Todos_Report");
	}

	@BeforeMethod
	public void InicializaApp() throws MalformedURLException {

		caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Galaxy J6+");
		caps.setCapability("udid", "emulator-5554");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9");
		caps.setCapability("appPackage", "com.Advantage.aShopping");
		caps.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");
		caps.setCapability("unicodeKeyboard", true);
		caps.setCapability("resetKeyboard", true);

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, caps);

		cc = new Criar_Conta(driver);
		pesqHome = new PesquisarNaHome(driver);
		pesqLupa = new PesquisaPelaLupa(driver);
	}

	public Criar_Conta getCc() {
		return cc;
	}

	public PesquisarNaHome getPesqHome() {
		return pesqHome;
	}

	public PesquisaPelaLupa getPesqLupa() {
		return pesqLupa;
	}

//	@AfterTest
//	public void reset() {
//		driver.resetApp();
//	}

	@AfterMethod
	public void fim(ITestResult result) throws IOException, InterruptedException {
		Report.statusReported(test, result, driver);
		Report.quitExtent(extent);
		driver.quit();
	}

}
