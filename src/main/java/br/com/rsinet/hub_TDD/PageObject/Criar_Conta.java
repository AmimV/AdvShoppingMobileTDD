package br.com.rsinet.hub_TDD.PageObject;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import br.com.rsinet.hub_TDD.Excel.MassaDeDadosNovaConta;
import br.com.rsinet.hub_TDD.Utils.Rolagem;
import io.appium.java_client.FindsByAndroidUIAutomator;
import junit.framework.Assert;

public class Criar_Conta {
	private WebDriver driver;
	private WebDriverWait wait;
	private MassaDeDadosNovaConta celula;
	private Rolagem util;

	public Criar_Conta(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		wait = new WebDriverWait(this.driver, 20);
		celula = new MassaDeDadosNovaConta();
		util = new Rolagem(driver);
	}

	public void Menu() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement menu = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu"));
		wait.until(ExpectedConditions.elementToBeClickable(menu));
		menu.click();
	}

	public void Login() throws Exception {
		WebElement login = driver.findElement(By.id("com.Advantage.aShopping:id/linearLayoutLogin"));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
	}

	public void NovaConta() throws Exception {
		WebElement NovaConta = driver.findElement(By.id("com.Advantage.aShopping:id/textViewDontHaveAnAccount"));
		wait.until(ExpectedConditions.elementToBeClickable(NovaConta));
		NovaConta.click();
	}

	public void Usuario() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement userName = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText"));
		userName.click();
		userName.sendKeys(celula.Usuario());

	}

	public void Email() throws Exception {
		WebElement email = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"));
		email.click();
		email.sendKeys(celula.Email());
	}

	public void Senha() throws Exception {
		WebElement senha = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText"));
		senha.click();
		senha.sendKeys(celula.Senha());
	}

	public void ConfirmarSenha() throws Exception {
		WebElement confirmarSenha = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"));
		confirmarSenha.click();
		confirmarSenha.sendKeys(celula.ConfirmarSenha());
	}

	public void PrimeiroNome() throws Exception {
		WebElement PrimeiroNome = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText"));
		PrimeiroNome.click();
		PrimeiroNome.sendKeys(celula.PrimeiroNome());
	}

	public void UltimoNome() throws Exception {
		WebElement ultimoNome = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText"));
		ultimoNome.click();
		ultimoNome.sendKeys(celula.UltimoNome());
	}

	public void descerPage() {

		((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "REGISTER" + "\").instance(0))");
	}

	public void fone() throws Exception {
		WebElement foneNumero = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));
		foneNumero.click();
		foneNumero.sendKeys(celula.Telefone());
	}

	public void Estado() throws Exception {
		WebElement Estado = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"));
		Estado.click();
		Estado.sendKeys(celula.Estado());
	}

	public void pais() throws Exception {
		WebElement Pais = driver.findElement(By.id("com.Advantage.aShopping:id/textViewCountries"));
		Pais.click();
		((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ celula.Pais() + "\").instance(0))")
				.click();

	}

	public void Endereco() throws Exception {
		WebElement endereco = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));
		endereco.click();
		endereco.sendKeys(celula.Endereco());
	}

	public void Cidade() throws Exception {
		WebElement cidade = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText"));
		cidade.click();
		cidade.sendKeys(celula.Cidade());
	}

	public void Cep() throws Exception {
		WebElement cep = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText"));
		cep.click();
		cep.sendKeys(celula.Cep());
	}

	public void Register() throws InterruptedException {
		WebElement register = driver.findElement(By.id("com.Advantage.aShopping:id/buttonRegister"));
		register.click();
	}

	public void confirmaCadastro() throws Exception {
		WebElement usuarioLogado = driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser"));
		Assert.assertEquals(usuarioLogado.getText(), celula.Usuario());
	}

	public void confirmarSenhaErrada() throws Exception {
		WebElement confirmarSenha = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"));
		confirmarSenha.click();
		confirmarSenha.sendKeys("teste");
	}
	public void ConfirmarErro() {

		boolean kir = driver.getPageSource().contains("Passwords do not match");
		Assert.assertTrue(kir);

	}
}
