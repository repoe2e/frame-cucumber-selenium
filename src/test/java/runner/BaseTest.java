package runner;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;
import io.cucumber.java.BeforeAll;

public class BaseTest extends Drivers {

	
	@BeforeAll
	public static void iniciarTeste() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://desafio.ui.e2etreinamentos.com.br/");

	}

	public static void finalizarTeste() {
		driver.quit();

	}
}
