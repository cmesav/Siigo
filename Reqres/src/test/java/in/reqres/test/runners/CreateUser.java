package in.reqres.test.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/create_user.feature",
        glue = {"in.reqres.test.stepdefinitions","in.reqres.test.setup"},
        snippets = CucumberOptions.SnippetType.CAMELCASE, tags = "")
public class CreateUser {
}
