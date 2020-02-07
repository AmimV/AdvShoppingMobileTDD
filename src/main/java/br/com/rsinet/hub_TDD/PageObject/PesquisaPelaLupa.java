package br.com.rsinet.hub_TDD.PageObject;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_TDD.Excel.MassaDeDadosPesqLupa;
import br.com.rsinet.hub_TDD.Utils.Rolagem;

public class PesquisaPelaLupa {
	private WebDriver driver;
	private WebDriverWait wait;
	private MassaDeDadosPesqLupa celula;
	private Rolagem util;

	public PesquisaPelaLupa(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		wait = new WebDriverWait(this.driver, 20);
		celula = new MassaDeDadosPesqLupa();
		util = new Rolagem(driver);
	}

	public void pesqProduto() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement escrevelupa = driver.findElement(By.id("com.Advantage.aShopping:id/editTextSearch"));
		WebElement lupa = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewSearch"));

		escrevelupa.click();
		escrevelupa.sendKeys(celula.PesquisaProduto());
		lupa.click();
	}
	public void escolhaTablet() throws Exception {
		util.procuraTexto(celula.ClicaProduto01());
	}
	public void confirmaTablet() {
		WebElement addToCart = driver.findElement(By.id("com.Advantage.aShopping:id/buttonProductAddToCart"));
		wait.until(ExpectedConditions.elementToBeClickable(addToCart));
		boolean carrinho = driver.getPageSource().contains("ADD TO CART");
		assertTrue(carrinho);
	}
	public void pesqProdutoInexistente() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement escrevelupa = driver.findElement(By.id("com.Advantage.aShopping:id/editTextSearch"));
		WebElement lupa = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewSearch"));

		escrevelupa.click();
		escrevelupa.sendKeys(celula.ProdutoInvalido());
		lupa.click();
	}
	public void confirmarNenhumProduto() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean nenhumProduto = driver.getPageSource().contains("No results");
		assertTrue(nenhumProduto);
	}
}
