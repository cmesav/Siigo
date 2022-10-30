package co.com.falabella.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {

    private ProductPage() {
    }

    public static final Target PRODUCT_NAME = Target.the("Product name")
            .locatedBy("//*[contains(@data-name,'Crysis')]");
    public static final Target FINAL_PRICE = Target.the("Final price of product")
            .locatedBy("//span[contains(text(),'Precio final')]");
    public static final Target ADD_PRODUCT = Target.the("Add to bag")
            .located(By.id("buttonForCustomers"));

    public static final Target INCREMENT_CUANTITY = Target.the("Button to increment cuantity")
            .located(By.id("testId-stepper-increment-btn"));

    public static final Target PRODUCT_CUANTITY = Target.the("product cuantity")
            .locatedBy("//*[contains(@class,'product-count-value')]");

    public static final Target ASSURANCE_OPTION = Target.the("arrow down")
            .locatedBy("//*[contains(@class,'arrow_down')]");

    public static final Target ADD_WARRANTY = Target.the("Add extended warranty")
            .locatedBy("//*[@class='jsx-4235874631 label   ']");

    public static final Target GO_TO_BAG = Target.the("go to the shopping bag")
            .located(By.id("linkButton"));

}
