package br.comr.rsinet.hub_TDD.Test;

import org.testng.annotations.Test;
import br.com.rsinet.hub_TDD.Utils.Hooks;
import br.com.rsinet.hub_TDD.Utils.Report;


public class Adv_CriaConta extends Hooks {

	@Test
	public void CriaContaComSuceso() throws Exception {
		extent = Report.setReport("CadastrarUsuario_report");
		test = Report.createTest("CadastrandoUmUsuarioComFalha");

		cc.Menu();
		cc.Login();
		cc.NovaConta();
		cc.Usuario();
		cc.Email();
		cc.Senha();
		cc.ConfirmarSenha();
		cc.PrimeiroNome();
		cc.UltimoNome();
		cc.fone();
		cc.Pais();
		cc.Estado();
		cc.Endereco();
		cc.Cidade();
		cc.Cep();
		cc.Register();
		cc.Menu();

	}
	
	@Test
	public void FalhaCriaConta() throws Exception {
		test = Report.createTest("CadastrandoUmUsuarioComFalha");
		
		cc.Login();
		cc.Deslogar();
		cc.Menu();
		cc.Login();
		
	}
}
