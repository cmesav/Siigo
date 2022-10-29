package co.com.falabella.qa.tasks;

import co.com.falabella.qa.interactions.Remember;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import java.util.logging.Level;
import java.util.logging.Logger;

import static co.com.falabella.qa.userinterfaces.FalabellaHome.*;
import static co.com.falabella.qa.userinterfaces.ProductPage.*;

public class AddTo implements Task {

    private final String product;

    public AddTo(String product) {
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Logger logger = Logger.getLogger(AddTo.class.getName());
        actor.attemptsTo(
                Click.on(DENY_POPUP),
                Enter.theValue(product).into(SEARCH_BAR).thenHit(Keys.ENTER),
                Scroll.to(PRODUCT),
                Click.on(PRODUCT),
                Remember.productData("product"),
                Click.on(ADD_PRODUCT)
        );
        logger.log(Level.INFO, () -> "The user add product successfully");

    }

    public static AddTo car (String product) {
        return Tasks.instrumented(AddTo.class, product);
    }
}
