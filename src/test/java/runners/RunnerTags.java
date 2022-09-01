package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/choucair_reg_usuario.feature",
        tags = "@stories",
        glue= "stepdefinitions",
     snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}