package br.comr.rsinet.hub_TDD.Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import br.com.rsinet.hub_TDD.Utils.Hooks;
import br.com.rsinet.hub_TDD.Utils.Report;

public class Adv_PesquisarNaHome extends Hooks {
	private ExtentReports extent;
	private ExtentTest test;

	@Test
	public void pesquisaTabletComSucesso() throws Exception {
		test = Report.createTest("Pesquisar na home page com sucesso");
		getPesqHome().categoria();
		getPesqHome().escolhaHeadphone();
		getPesqHome().confirmaTablet();
	}

	@Test
	public void FiltrarNaoExiste() throws Exception {
		test = Report.createTest("Pesquisar na home, filtrar pelo preco e retorna nenhum produto");
		getPesqHome().categoria();
		getPesqHome().filtro();
		getPesqHome().compatibilidade();
		getPesqHome().conector();
		getPesqHome().aplicar();
		getPesqHome().confirmaTest();

	}

}
