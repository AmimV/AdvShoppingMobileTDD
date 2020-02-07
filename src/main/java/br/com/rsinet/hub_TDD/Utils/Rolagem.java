package br.com.rsinet.hub_TDD.Utils;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Rolagem {
	private TouchAction touch;
	private WebDriver driver;

	public Rolagem(WebDriver driver) {
		this.driver = driver;
		this.touch = new TouchAction((PerformsTouchActions) this.driver);
	}

	public void proximo() {

		touch.tap(PointOption.point(648, 1321)).perform();
	}

	public void proximoNoFone() {

		touch.tap(PointOption.point(617, 1080)).perform();
	}

	public void RolarPais() throws InterruptedException {

		touch.press(PointOption.point(325, 1274)).moveTo(PointOption.point(316, 201)).release().perform();
		touch.press(PointOption.point(283, 894)).moveTo(PointOption.point(279, 170)).release().perform();
	}

	public void RolarRegister() {
		touch.press(PointOption.point(306, 1283)).moveTo(PointOption.point(283, 575)).release().perform();
	}

	public void procuraTexto(String celula) {
		((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ celula + "\").instance(0))")
				.click();
	}

}
