package PageSteps;

import PageObjects.CategoryPageObjects;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.close;

public class CategoryPageSteps extends CategoryPageObjects {
    public static void clickTelevision () {
        television.waitUntil(Condition.visible, 2000);
        television.click();
    }

    public static void clickNeededTelevision (){
        neededTelevision.waitUntil(Condition.visible, 2000);
        neededTelevision.click();
    }

    public static String getProductPrice() {
        return productPrice.getText();
    }

    public static String getProductQuantity() {
        return productQuantity.getValue();
    }

    public static String getNeededTelevision () {
        return neededTelevision.getText();
    }

    public static String getNeededTelevisionPrice() {
        return neededTelevisionPrice.getText();
    }

    public static void clickCheckBoxFilter () {
        checkBoxFilter.waitUntil(Condition.visible, 2000);
        checkBoxFilter.click();
    }

    public static void clickAddToBasket (){
        addToBasket.waitUntil(Condition.visible, 2000);
        addToBasket.click();
    }

    public static String getTitle () {
        checkTitle.waitUntil(Condition.visible, 2000);
        return checkTitle.getText();
    }

    public static void setMinPrice (String minPrice) {
        setMinPrice.waitUntil(Condition.visible, 2000);
        setMinPrice.clear();
        setMinPrice.sendKeys(minPrice);
    }

    public static void setMaxPrice (String maxPrice) {
        setMaxPrice.waitUntil(Condition.visible, 2000);
        setMinPrice.clear();
        setMaxPrice.sendKeys(maxPrice);
    }

    public static String getProductStatus () {
        productNotFound.waitUntil(Condition.visible, 2000);
        return productNotFound.getText();
    }

    public static void addToBasket () {
        clickTelevision();
        clickNeededTelevision();
        clickAddToBasket();
        Selenide.sleep(1000);
    }

    public static void checkIframePopup() {
        if(helpMessengerPopup.isDisplayed()) {
            System.out.println("OKKOKOK");
        }
    }




}
