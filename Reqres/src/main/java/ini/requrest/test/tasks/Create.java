package ini.requrest.test.tasks;

import ini.requrest.test.models.UserInfo;
import net.serenitybdd.rest.Ensure;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.thucydides.core.annotations.Step;

import java.util.logging.Level;
import java.util.logging.Logger;

import static ini.requrest.test.utils.Constants.PATH_CREATE;

public class Create implements Task {

    private final UserInfo data;

    public Create(UserInfo data) {
        this.data = data;
    }

    @Step("{0} create a new user")
    @Override
    public <T extends Actor> void performAs(T actor) {
        Logger logger = Logger.getLogger(Create.class.getName());

        actor.remember("userInfo",data);
        actor.attemptsTo(Post.to(PATH_CREATE).with(
                requestSpecification -> requestSpecification
                        .header("Content-Type", "application/json")
                        .body(data).relaxedHTTPSValidation()
        ));

        logger.log(Level.INFO, () -> "Response Body Create User:\n " +
                SerenityRest.lastResponse().prettyPrint());

    }

    public static Create newUserWith(UserInfo data) {
        return Tasks.instrumented(Create.class, data);
    }

}


