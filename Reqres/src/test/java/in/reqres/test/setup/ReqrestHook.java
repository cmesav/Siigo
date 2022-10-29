package in.reqres.test.setup;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ReqrestHook {
    @Before
    public void setUpTheStage() {

        String baseUrl = "https://reqres.in/api/";
        setTheStage(new OnlineCast());
        theActorCalled("Qa Analist").whoCan(CallAnApi.at(baseUrl));
    }

    @After
    public void closeStage() {
        OnStage.drawTheCurtain();
    }

}
