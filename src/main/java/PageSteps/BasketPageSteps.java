package PageSteps;

import PageObjects.BasketPageObjects;
import com.codeborne.selenide.Condition;

public class BasketPageSteps extends BasketPageObjects {
    public static void clickBasket () {
        basketButton.waitUntil(Condition.visible, 2000);
        basketButton.click();
    }

    public static String getBasketCount () {
        basketCount.waitUntil(Condition.visible, 2000);
        return basketCount.getText();
    }

    public static String getEmptyBasket () {
        emptyBasket.waitUntil(Condition.visible, 2000);
        return emptyBasket.getText();
    }

    public static void clickDeleteIcon () {
        deleteItem.waitUntil(Condition.visible, 2000);
        deleteItem.click();
    }

    public static String getQuantityValue () {
        itemQuantity.waitUntil(Condition.visible, 2000);
        return itemQuantity.getText();
    }

    public static String getItemName () {
        itemName.waitUntil(Condition.visible, 2000);
        return itemName.getText();
    }

    public static void clickCheckBox () {
        checkBox.waitUntil(Condition.visible, 2000);
        checkBox.click();
    }

    public static String getPrice () {
        priceCheck.waitUntil(Condition.visible, 2000);
        return priceCheck.getText();
    }

}
