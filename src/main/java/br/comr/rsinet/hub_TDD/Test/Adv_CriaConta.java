package br.comr.rsinet.hub_TDD.Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import br.com.rsinet.hub_TDD.Utils.Hooks;
import br.com.rsinet.hub_TDD.Utils.Report;


public class Adv_CriaConta extends Hooks {
	private ExtentReports extent;
	private ExtentTest test;
	
	@Test
	public void criaContaComSuceso() throws Exception {
		test = Report.createTest("CadastrandoComSucesso");
		
		getCc().Menu();
		getCc().Login();
		getCc().NovaConta();
		getCc().Usuario(6);
		getCc().getUser();
		getCc().Email();
		getCc().senha();
		getCc().ConfirmarSenha();
		getCc().PrimeiroNome();
		getCc().UltimoNome();
		getCc().descerPage();
		getCc().fone();
		getCc().pais();
		getCc().Estado();
		getCc().Endereco();
		getCc().Cidade();
		getCc().Cep();
		getCc().Register();
		getCc().Menu();
		getCc().confirmaCadastro();

	}
	
	@Test
	public void falhaCriaConta() throws Exception {
		test = Report.createTest("CadastrandoUmUsuarioComFalha");

		
		getCc().Menu();
		getCc().Login();
		getCc().NovaConta();
		getCc().Usuario(6);
		getCc().getUser();
		getCc().Email();
		getCc().senha();
		getCc().ConfirmarSenha();
		getCc().PrimeiroNome();
		getCc().UltimoNome();
		getCc().descerPage();
		getCc().fone();
		getCc().pais();
		getCc().Estado();
		getCc().Endereco();
		getCc().Cidade();
		getCc().Cep();
		getCc().Termos();
		getCc().Register();
		getCc().ConfirmarErro();
		
	}
}
