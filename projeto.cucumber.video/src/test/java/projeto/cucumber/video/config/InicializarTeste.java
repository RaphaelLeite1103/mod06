package projeto.cucumber.video.config;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import projeto.cucumber.video.drivers.DriversConexao;

public class InicializarTeste extends DriversConexao {

	static String ambiente = "https://buscacepinter.correios.com.br/app/endereco/index.php?t";
	
	public static void configurarAmbiente () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(ambiente);  
		driver.manage().window().maximize();
		
	}
	
	public static void encerrarTeste() {
		driver.quit();
		
	}
}
