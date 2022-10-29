package co.com.falabella.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.falabella.qa.userinterfaces.ShoppingBag.PURCHASE_VALUE;

public class ThePurchaseValue implements Question<Integer> {


    @Override
    public Integer answeredBy(Actor actor) {
        return Integer.parseInt(Text.of(PURCHASE_VALUE).answeredBy(actor).replace("$ ","").replace(".",""));
    }

    public static ThePurchaseValue is(){
        return new ThePurchaseValue();
    }
}
