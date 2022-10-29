package co.com.falabella.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.falabella.qa.userinterfaces.ShoppingBag.PRODUCT_NAME;

public class TheProductName implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PRODUCT_NAME).answeredBy(actor);
    }

    public static TheProductName is() {
        return new TheProductName();
    }
}
