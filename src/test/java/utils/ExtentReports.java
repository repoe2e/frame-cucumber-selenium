package utils;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReports {
		
	private static com.aventstack.extentreports.ExtentReports extent;
	private static ExtentTest test; // gerenciar testes
	private static ExtentSparkReporter sparkReporter; // gerar relatórios no formato HTML

	public static void setupReport() {
	    
	    // Inicializa o ExtentSparkReporter com o caminho para o arquivo HTML
	    sparkReporter = new ExtentSparkReporter("./relatorios/relatorio.html");
	    
	    // Adicionar logo ao cabeçalho do relatório
	    String logoPath = "<img src='./imgs/e2e.svg' height='60' width='60'/>";
	    sparkReporter.config().setReportName(logoPath + " Relatório de Execução de Testes");

	    // Configurar o título do relatório
	    sparkReporter.config().setDocumentTitle("Relátorio de Teste");   
	    
	    // Definir o tema do relatório para DARK ou STANDARD
	    sparkReporter.config().setTheme(Theme.DARK);
	    
	    // Inicializa a instância do ExtentReports
	    extent = new com.aventstack.extentreports.ExtentReports();
	    
	    // Anexa a configuração Spark ao ExtentReport
	    extent.attachReporter(sparkReporter);

	    extent.setSystemInfo("Sistema operacional", "Windows");
	    extent.setSystemInfo("Ambiente de Testes", "Selenium com Junit");
	}

	
	// Método iniciar um teste
	public static void startTest(String nomeDoTeste) {
		test = extent.createTest(nomeDoTeste);
	}
	
	// Método para finalizar e salvar o relatório
	public static void tearDownReport() {
		// slva o relatório e encerra a execução
		extent.flush();
	}
	
	// Método para registrar falhas no relatório
	public static void logFail(String mensagem) {
		test.fail(mensagem);
	}
	
	// Método para registar informações
	public static void logInf(String mensagem) {
		test.info(mensagem);
	}

}


