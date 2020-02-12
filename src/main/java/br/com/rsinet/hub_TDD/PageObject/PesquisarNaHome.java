package br.com.rsinet.hub_TDD.PageObject;

import static org.testng.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import br.com.rsinet.hub_TDD.Excel.MassaDeDadosPesqHome;
import br.com.rsinet.hub_TDD.Utils.Rolagem;

public class PesquisarNaHome {
	private WebDriver driver;
	private WebDriverWait wait;
	private MassaDeDadosPesqHome celula;
	private Rolagem util;

	public PesquisarNaHome(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		wait = new WebDriverWait(this.driver, 20);
		celula = new MassaDeDadosPesqHome();
		util = new Rolagem(driver);
	}

	public void categoria() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		util.procuraTexto(celula.Categoria());

	}
	public void escolhaHeadphone() throws Exception {
		WebElement foneDeOuvido = driver.findElement(By.id("com.Advantage.aShopping:id/RelativeLayoutProductControl"));
		wait.until(ExpectedConditions.elementToBeClickable(foneDeOuvido));
		util.procuraTexto(celula.Logitech());
	}
	public void confirmaTablet() {
		WebElement addToCart = driver.findElement(By.id("com.Advantage.aShopping:id/buttonProductAddToCart"));
		wait.until(ExpectedConditions.elementToBeClickable(addToCart));
		boolean carrinho = driver.getPageSource().contains("ADD TO CART");
		assertTrue(carrinho);
	}
	public void filtro() throws InterruptedException {
		WebElement produtos = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewProduct"));
		WebElement filtro = driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\"Headphones\"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView"));
		wait.until(ExpectedConditions.elementToBeClickable(produtos));
		filtro.click();
	}
	public void compatibilidade() throws InterruptedException {
		WebElement compativel = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout"));
		wait.until(ExpectedConditions.elementToBeClickable(compativel));
		compativel.click();
		WebElement todosDispositivos = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[3]/android.widget.LinearLayout"));
		todosDispositivos.click();
		compativel.click();
	}
	public void conector() throws InterruptedException {
		WebElement conector = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[3]/android.widget.LinearLayout"));
		wait.until(ExpectedConditions.elementToBeClickable(conector));
		conector.click();
		WebElement bluetooth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[4]/android.widget.LinearLayout"));
		bluetooth.click();
		conector.click();
	}
	public void aplicar() {
		WebElement aplicar = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[3]"));
		aplicar.click();
	}
	public void confirmaTest() {
		WebElement oi = driver.findElement(By.id("com.Advantage.aShopping:id/textViewNoProductsToShow"));
		boolean nenhumResults = wait.until(ExpectedConditions.textToBePresentInElement(oi, "No results"));
		assertTrue(nenhumResults);
	}
	
}
