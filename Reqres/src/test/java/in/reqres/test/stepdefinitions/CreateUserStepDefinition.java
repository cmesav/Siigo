package in.reqres.test.stepdefinitions;

import ini.requrest.test.models.UserInfo;
import ini.requrest.test.tasks.Create;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;

import static ini.requrest.test.utils.Generate.theInfo;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class CreateUserStepDefinition {

    @When("I send the register information")
    public void iSendTheRegisterInformation() {
        theActorInTheSpotlight().attemptsTo(
                Create.newUserWith(theInfo())
        );
    }
    @Then("I see my info in the response")
    public void iSeeMyInfoInTheResponse() {
        UserInfo data = theActorInTheSpotlight().recall("userInfo");
        theActorInTheSpotlight().should(
                ResponseConsequence.seeThatResponse("all response data is Ok",
                        response -> response.body("name", equalTo(data.getName()))
                                .body("job", equalTo(data.getJob())))
        );

    }
}
