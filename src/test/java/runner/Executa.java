package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features", // caminho dos gherkis
		glue = "stepsDefinitions", // caminho da class java que implementa os gherkins
		tags = "@loginPortugues", // indica qual ou quais testes serão executados
		dryRun = true, // true estou plenejando false estou executando
		monochrome = false, // remove os caracteres especiais do terminal
		snippets = SnippetType.CAMELCASE, // configura os métodos no padrão java sem _
		plugin = {"pretty", // deixa o nosso console bonito no padrão cucumber
				"html:target/cucumber-reports.html", // gera um relatório html
				"json:target/cucumber-reports.json",// gera um relatório json
			    } 	
		)


public class Executa {

	

}
