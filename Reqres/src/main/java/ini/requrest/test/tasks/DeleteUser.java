package ini.requrest.test.tasks;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.thucydides.core.annotations.Step;

import java.util.logging.Level;
import java.util.logging.Logger;

import static ini.requrest.test.utils.Constants.PATH_USER;

public class DeleteUser implements Task {

    private final int id;

    public DeleteUser(int id) {
        this.id = id;
    }

    @Step("{0} delete one user register")
    @Override
    public <T extends Actor> void performAs(T actor) {
        Logger logger = Logger.getLogger(DeleteUser.class.getName());


        actor.attemptsTo(Delete.from(PATH_USER).with(
                requestSpecification -> requestSpecification.pathParam("id",id)
                        .relaxedHTTPSValidation()
        ));

        logger.log(Level.INFO, () -> "Response Body for Delete User:\n " +
                SerenityRest.lastResponse().prettyPrint());
    }

    public static DeleteUser with(int id){
        return Tasks.instrumented(DeleteUser.class, id);
    }
}
