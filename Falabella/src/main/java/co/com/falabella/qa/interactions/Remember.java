package co.com.falabella.qa.interactions;

import co.com.falabella.qa.models.Product;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;

import java.util.logging.Level;
import java.util.logging.Logger;

import static co.com.falabella.qa.userinterfaces.ProductPage.*;

public class Remember implements Interaction {

    private final String type;

    public Remember(String type) {
        this.type = type;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Logger logger = Logger.getLogger(Remember.class.getName());

        if (type.equals("product")) {
            actor.remember("product",
                    new Product(
                            Text.of(PRODUCT_NAME).answeredBy(actor),
                            Text.of(FINAL_PRICE).answeredBy(actor).substring(2, 9)
                                    .replace(".", "")
                    )
            );
            logger.log(Level.INFO, () -> "The user remember product info successfully");
        } else {
            actor.remember("assurance", Text.of(ADD_WARRANTY).answeredBy(actor).substring(30, 36)
                    .replace(".", ""));
            actor.remember("amount", Text.of(PRODUCT_CUANTITY).answeredBy(actor));

            logger.log(Level.INFO, () -> "The user remember amount and assurance value");
        }
    }

    public static Remember productData(String type) {
        return Tasks.instrumented(Remember.class, type);
    }
}
