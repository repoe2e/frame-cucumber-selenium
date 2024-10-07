package stepsDefinitions;

import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import metodos.Metodos;
import runner.BaseTest;

public class LoginTest {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	@Before
	public void setUp() {
		BaseTest.iniciarTeste();
	}

	@After
	public void tearDown() {
		BaseTest.finalizarTeste();
	}

	@Dado("o cliente insere o nome de usuário {string}")
	public void oClienteInsereONomeDeUsuário(String usuario) {
		metodo.escrever(el.usuario, usuario);
		metodo.tirarPrint("login/logincomsucesso", "preenchendousuario");
	}

	@Dado("o cliente insere a senha {string}")
	public void oClienteInsereASenha(String senha) {
		metodo.escrever(el.senha, senha);
		metodo.tirarPrint("login/logincomsucesso", "preenchendosenha");
	}

	@Quando("o cliente clica no botão login")
	public void oClienteClicaNoBotãoLogin() {
		metodo.clicar(el.btnLogin);
	}

	@Entao("sistema direciona cliente para a página logado")
	public void sistemaDirecionaClienteParaAPáginaLogado() {
		metodo.validarUrl("https://desafio.ui.e2etreinamentos.com.br/home.html");
		metodo.tirarPrint("login/logincomsucesso", "usuariologado");
	}

	@Dado("que o cliente insere o nome de {string}")
	public void queOClienteInsereONomeDe(String clienteErro) {

	}

	@Então("o sistema valida a <mensagem> de inconsistência")
	public void oSistemaValidaAMensagemDeInconsistência() {
		
	}

}
