package co.com.falabella.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.logging.Level;
import java.util.logging.Logger;

import static co.com.falabella.qa.userinterfaces.GooglePage.SEARCH_BAR;
import static co.com.falabella.qa.userinterfaces.GooglePage.SELECT_RESULT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class GoTo implements Task {

    private final String searchWord;

    public GoTo(String searchWord) {
        this.searchWord = searchWord;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Logger logger = Logger.getLogger(GoTo.class.getName());

        actor.attemptsTo(
                Enter.theValue(searchWord).into(SEARCH_BAR).thenHit(Keys.ENTER),
                WaitUntil.the(SELECT_RESULT, isClickable()),
                Click.on(SELECT_RESULT)
        );
        logger.log(Level.INFO, () -> "The user search the ecommerce");
    }

    public static GoTo web(String searchWord) {
        return Tasks.instrumented(GoTo.class, searchWord);
    }
}
