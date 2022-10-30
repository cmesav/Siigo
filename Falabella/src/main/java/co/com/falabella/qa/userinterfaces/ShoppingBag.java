package co.com.falabella.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingBag {

    private ShoppingBag() {
    }

    public static final Target PRODUCT_NAME = Target.the("Add extended warranty")
            .locatedBy("//*[@class='fb-product__title']");

    public static final Target PURCHASE_VALUE = Target.the("Add extended warranty")
            .locatedBy("//*[@class='fb-order-status__sub-totals__value notranslate undefined']");

}
