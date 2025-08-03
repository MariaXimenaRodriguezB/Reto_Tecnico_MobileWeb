package co.com.choucair.automation.android.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/mobilecalculator.feature",
        glue = "co.com.choucair.automation.android.stepdefinitions.mobile",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RunnerMobile {
}
