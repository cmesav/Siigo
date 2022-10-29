package ini.requrest.test.tasks;

import ini.requrest.test.models.UserInfo;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Patch;
import net.thucydides.core.annotations.Step;

import java.util.logging.Level;
import java.util.logging.Logger;

import static ini.requrest.test.utils.Constants.PATH_USER;

public class Update implements Task {

    private final int id;
    private final UserInfo data;

    public Update(int id, UserInfo data) {
        this.id = id;
        this.data = data;
    }

    @Step("{0} update an user")
    @Override
    public <T extends Actor> void performAs(T actor) {
        Logger logger = Logger.getLogger(Update.class.getName());


        actor.attemptsTo(Patch.to(PATH_USER).with(
                requestSpecification -> requestSpecification.pathParam("id",id)
                        .header("Content-Type", "application/json")
                        .body(data).relaxedHTTPSValidation())
        );

        logger.log(Level.INFO, () -> "Response Body for Update User:\n " +
                SerenityRest.lastResponse().prettyPrint());
    }

    public static Update user(int id, UserInfo data){
        return Tasks.instrumented(Update.class, id, data);
    }
}
