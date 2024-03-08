package projeto.cucumber.video.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith (Cucumber.class)
@CucumberOptions (
		features = "src/test/resources/features",
		glue = "projeto.cucumber.video.steps",
		tags = "@regressivos",
		dryRun = false,
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty", "html:target/cucumber-reports.html"}
		
		)


public class Executa {
	

}
