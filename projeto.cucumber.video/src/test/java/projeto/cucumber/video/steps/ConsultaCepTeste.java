package projeto.cucumber.video.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projeto.cucumber.video.config.InicializarTeste;
import projeto.cucumber.video.pages.HomePage;

public class ConsultaCepTeste {
	
	HomePage home = new HomePage();
	
	@Before
	public void iniciarTeste () {
		InicializarTeste.configurarAmbiente();
	}
	
	@After
	public void finalizarTeste () {
		InicializarTeste.encerrarTeste();
	}

	@When("enviar os dados para busca")
	public void enviarOsDadosParaBusca() {
		home.buscarCepEndereco("04285-000");

	}
	@Then("validar os dados retornando")
	public void validarOsDadosRetornando() {
		home.validarDadosRetornados("Rua Elba - até 601/602", "Vila Moinho Velho", "São Paulo/SP", "04285-000");

	}



}
