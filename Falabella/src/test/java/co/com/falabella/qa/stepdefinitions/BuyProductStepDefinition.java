package co.com.falabella.qa.stepdefinitions;

import co.com.falabella.qa.exceptions.ProductError;
import co.com.falabella.qa.models.Product;
import co.com.falabella.qa.questions.TheProductName;
import co.com.falabella.qa.questions.ThePurchaseValue;
import co.com.falabella.qa.tasks.AddTo;
import co.com.falabella.qa.tasks.GoTo;
import co.com.falabella.qa.tasks.ModifyProduct;
import co.com.falabella.qa.utils.Calculate;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.falabella.qa.utils.Constans.PRODUCT_NAME_ERROR;
import static co.com.falabella.qa.utils.Constans.URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class BuyProductStepDefinition {

    @Given("Search {string} website")
    public void searchWebsite(String site) {
        theActorInTheSpotlight().wasAbleTo(
                Open.url(URL),
                GoTo.web(site)
        );

    }

    @When("I choose one product of {string} with extended warranty")
    public void iChooseOneProductOfWithExtendedWarranty(String product) {
        theActorInTheSpotlight().attemptsTo(
                AddTo.car(product),
                ModifyProduct.bag()
        );
    }

    @Then("I see the product name in the shopping bag")
    public void iSeeTheProductNameInTheShoppingBag() {
        Product productInfo = theActorInTheSpotlight().recall("product");

        theActorInTheSpotlight().should(
                seeThat(TheProductName.is(), equalTo(productInfo.getProductName()))
                        .orComplainWith(ProductError.class,PRODUCT_NAME_ERROR)
        );
    }

    @And("the total purchase value")
    public void theTotalPurchaseValue() {
        theActorInTheSpotlight().should(
                seeThat(ThePurchaseValue.is(),equalTo(Calculate.theValue(theActorInTheSpotlight())))
        );


    }
}
