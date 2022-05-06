package bancolombia.cannon.simulator.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
features = "src/test/resources/features/simulator.feature",
        tags = "@story",
        glue = "bancolombia.cannon.simulator.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class SimultaroRunner {

}
