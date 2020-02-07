package br.comr.rsinet.hub_TDD.Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import br.com.rsinet.hub_TDD.Utils.Hooks;
import br.com.rsinet.hub_TDD.Utils.Report;

public class Adv_PesquisarNaLupa extends Hooks {
	private ExtentReports extent;
	private ExtentTest test;
	
//	@BeforeTest
//	public void report() {
//		extent = Report.setReport("PesquisarNaHome_Report");
//	}

	@Test
	public void pesquisaProdutoPelaLupa() throws Exception {
		test = Report.createTest("Pesquisar na lupa com sucesso");
		getPesqLupa().pesqProduto();
		getPesqLupa().escolhaTablet();
		getPesqLupa().confirmaTablet();
	}
	@Test
	public void pesquisaProdutoInexistenteLupa() throws Exception {
		test = Report.createTest("Pesquisar na lupa produto inexistente");
		getPesqLupa().pesqProdutoInexistente();
		getPesqLupa().confirmarNenhumProduto();
	}
}
