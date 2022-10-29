package co.com.falabella.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;
import org.openqa.selenium.By;

public class FalabellaHome {

    private FalabellaHome() {
    }

    public static final Target DENY_POPUP = Target.the("Button to deny popup")
            .located(ByShadow.cssSelector(".airship-btn-deny",".airship-html-prompt-shadow"));

    public static final Target SEARCH_BAR = Target.the("Search area")
            .located(By.id("testId-SearchBar-Input"));

    public static final Target PRODUCT = Target.the("Product")
            .locatedBy("//*[contains(text(),'Crysis')]");
}
