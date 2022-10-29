package ini.requrest.test.tasks;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.thucydides.core.annotations.Step;

import java.util.logging.Level;
import java.util.logging.Logger;

import static ini.requrest.test.utils.Constants.*;

public class Consult implements Task {

    private final int id;

    public Consult(int id) {
        this.id = id;
    }

    @Step("{0} obtains the information for the user")
    @Override
    public <T extends Actor> void performAs(T actor) {
        Logger logger = Logger.getLogger(Consult.class.getName());

        actor.attemptsTo(Get.resource(PATH_USER).with(
                requestSpecification -> requestSpecification
                        .pathParam("id", id)
                        .relaxedHTTPSValidation()
        ));

        logger.log(Level.INFO, () -> "Response Body Get User with id:\n " + id +
                SerenityRest.lastResponse().prettyPrint());

    }

    public static Consult theUserWith(Integer id) {
        return Tasks.instrumented(Consult.class,id);
    }
}
