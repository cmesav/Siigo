package co.com.falabella.qa.utils;

import co.com.falabella.qa.models.Product;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Calculate {

    private Calculate() {
    }

    public static Integer theValue(Actor actor) {
        Product productInfo = theActorInTheSpotlight().recall("product");

        return (Integer.parseInt(productInfo.getPrice())
                + Integer.parseInt(actor.recall("assurance")))
                * Integer.parseInt(actor.recall("amount")
        );
    }
}
