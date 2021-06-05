package PageObjects;

import WebDrivers.BrowserData;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;

public class BasketPageObjects implements BrowserData {
    public static SelenideElement
            basketButton = $(By.className("bag")),
            basketCount = $(By.className("bag")),
            emptyBasket = $(By.className("total")),
            deleteItem = $(By.className("delete")),
            itemQuantity = $(By.name("quantity")),
            itemName = $(By.className("title")),
            checkBox = $(By.className("item-check")),
            priceCheck = $(By.className("info")).$(By.className("price"));
}
