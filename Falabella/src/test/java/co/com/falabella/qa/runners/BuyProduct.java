package co.com.falabella.qa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/buy_product.feature",
        glue = {"co.com.falabella.qa.stepdefinitions", "co.com.falabella.qa.setup"},
        snippets = CucumberOptions.SnippetType.CAMELCASE, tags = "")
public class BuyProduct {
}
