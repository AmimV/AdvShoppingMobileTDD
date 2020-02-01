package br.com.rsinet.hub_TDD.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import br.com.rsinet.hub_TDD.Excel.MassaDeDadosNovaConta;
import br.com.rsinet.hub_TDD.Utils.Rolagem;

public class Criar_Conta {
	private WebDriver driver;
	private WebDriverWait wait;
	private MassaDeDadosNovaConta celula;
	private Rolagem util;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private WebElement menu;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/linearLayoutLogin")
	private WebElement login;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewDontHaveAnAccount")
	private WebElement NovaConta;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement userName;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement email;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement Confirmasenha;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement senha;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText")
	private WebElement PrimeiroNome;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText")
	private WebElement UltimoNome;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement Fone;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement Estado;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout")
	private WebElement Pais;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[9]")
	private WebElement Brasil;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement Endereco;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText")
	private WebElement Cidade;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText")
	private WebElement Cep;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")
	private WebElement AparecerPais;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
	private WebElement Register;

	@FindBy(how = How.ID, using = "android:id/button2")
	private WebElement deslogar;

	public Criar_Conta(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		wait = new WebDriverWait(this.driver, 20);
		celula = new MassaDeDadosNovaConta();
		util = new Rolagem(driver);
	}

	public void Menu() throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(menu));
		menu.click();
	}

	public void Login() throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
	}

	public void NovaConta() throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(NovaConta));
		NovaConta.click();
	}

	public void Usuario() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(userName));
		userName.click();
		userName.sendKeys(celula.Usuario());
		util.proximo();
	}

	public void Email() throws Exception {
		email.sendKeys(celula.Email());
		util.proximo();
	}

	public void Senha() throws Exception {
		senha.sendKeys(celula.Senha());
		util.proximo();
	}

	public void ConfirmarSenha() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(Confirmasenha));
		Confirmasenha.sendKeys(celula.ConfirmarSenha());
	}

	public void PrimeiroNome() throws Exception {
		util.proximo();
		PrimeiroNome.sendKeys(celula.PrimeiroNome());
	}

	public void UltimoNome() throws Exception {
		UltimoNome.click();
		UltimoNome.sendKeys(celula.UltimoNome());
		util.proximo();
	}

	public void fone() throws Exception {
		Fone.sendKeys(celula.Telefone());
		util.proximoNoFone();
	}

	public void Estado() throws Exception {
		Estado.click();
		Estado.sendKeys(celula.Estado());
	}

	public void Pais() throws Exception {
		Pais.click();
		wait.until(ExpectedConditions.visibilityOf(AparecerPais));
		util.RolarPais();
		Brasil.click();
	}

	public void Endereco() throws Exception {
		util.proximo();
		Endereco.sendKeys(celula.Endereco());
		util.proximo();
	}

	public void Cidade() throws Exception {
		Cidade.click();
		Cidade.sendKeys(celula.Cidade());
	}

	public void Cep() throws Exception {
		Cep.click();
		Cep.sendKeys(celula.Cep());
		util.proximo();
	}

	public void Register() throws InterruptedException {
		util.RolarRegister();
		Register.click();
	}

	public void Deslogar() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(deslogar));
		deslogar.click();
	}
}
