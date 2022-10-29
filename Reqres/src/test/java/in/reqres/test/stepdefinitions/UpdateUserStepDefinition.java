package in.reqres.test.stepdefinitions;

import in.requrest.test.models.UserInfo;
import in.requrest.test.tasks.Update;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UpdateUserStepDefinition {

    @When("I send the new information for user with {int}")
    public void iSendTheNewInformationForUserWithId(Integer id, UserInfo data) {
        theActorInTheSpotlight().attemptsTo(Update.user(id, data));
    }
}
