package co.com.falabella.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GooglePage {

    private GooglePage() {
    }

    public static final Target SEARCH_BAR = Target.the("Search on google")
            .located(By.name("q"));

    public static final Target SELECT_RESULT = Target.the("Access to first result")
            .locatedBy("(//*[@class='LC20lb MBeuO DKV0Md'])[1]");
}
