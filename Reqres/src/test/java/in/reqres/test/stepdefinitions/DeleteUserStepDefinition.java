package in.reqres.test.stepdefinitions;

import in.requrest.test.tasks.DeleteUser;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DeleteUserStepDefinition {

    @When("I send the request to erase the user with id {int}")
    public void iSendTheRequestToEraseTheUser(Integer id) {
        theActorInTheSpotlight().attemptsTo(DeleteUser.with(id));
    }
}
