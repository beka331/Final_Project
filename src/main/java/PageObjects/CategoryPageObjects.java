package PageObjects;

import WebDrivers.BrowserData;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selectors.*;

public class CategoryPageObjects implements BrowserData {

    public static SelenideElement
            television = $("[class=categories] > ul > li", 1),
    neededTelevision = $(".link > span", 0),
    neededTelevisionPrice = $(".price", 0),
    productPrice = $(".price"),
    productQuantity = $("[name=quantity]"),
    closeLiveChat = $("close-icon"),
    checkBoxFilter = $("label:nth-child(1)", 0),
    addToBasket = $(By.className("add_to_bag")),
    checkTitle = $(".detail > [itemprop=name]"),
    setMinPrice = $("[name=min_price]"),
    setMaxPrice = $("[name=max_price]"),
    productNotFound = $(".products"),
            helpMessengerPopup = $(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]"));

}
