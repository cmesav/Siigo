package co.com.falabella.qa.tasks;

import co.com.falabella.qa.interactions.Remember;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.logging.Level;
import java.util.logging.Logger;

import static co.com.falabella.qa.userinterfaces.ProductPage.*;

public class ModifyProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Logger logger = Logger.getLogger(ModifyProduct.class.getName());

        actor.attemptsTo(
                Click.on(INCREMENT_CUANTITY),
                Click.on(ASSURANCE_OPTION),
                Remember.productData("assurance"),
                Click.on(ADD_WARRANTY),
                Click.on(GO_TO_BAG)
        );

        logger.log(Level.INFO, () -> "The user add amount and assurance successfully");
    }

    public static ModifyProduct bag() {
        return Tasks.instrumented(ModifyProduct.class);
    }
}
