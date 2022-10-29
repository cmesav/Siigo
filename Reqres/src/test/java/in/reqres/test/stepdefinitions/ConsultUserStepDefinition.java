package in.reqres.test.stepdefinitions;

import in.requrest.test.exceptions.SchemaError;
import in.requrest.test.exceptions.StatusCodeError;
import in.requrest.test.questions.TheResponseCode;
import in.requrest.test.tasks.Consult;
import in.requrest.test.utils.Return;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;

import java.io.File;

import static in.requrest.test.utils.Constants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.*;

public class ConsultUserStepDefinition {

    @When("I Consult the user id {int}")
    public void iConsultTheUserId(Integer id) {
        theActorInTheSpotlight().attemptsTo(
                Consult.theUserWith(id)
        );
    }

    @Then("I see the response code {int}")
    public void iSeeTheResponseCode(Integer responseCode) {
        theActorInTheSpotlight().should(
                seeThat(TheResponseCode.is(), equalTo(responseCode))
                        .orComplainWith(StatusCodeError.class, STATUS_ERROR)
        );
    }

    @Then("the correct schema for the method {string}")
    public void theCorrectSchemaForTheAnswer(String verb) {
        theActorInTheSpotlight().should(
                seeThatResponse(response -> response.body(JsonSchemaValidator
                        .matchesJsonSchema(new File(Return.path(verb)))))
                        .orComplainWith(SchemaError.class, ERROR_SCHEMA)
        );
    }

}
