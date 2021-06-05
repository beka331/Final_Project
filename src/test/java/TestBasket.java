import PageSteps.BasketPageSteps;
import PageSteps.CategoryPageSteps;
import WebDrivers.BrowserData;
import WebDrivers.BrowserRunner;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.cert.Extension;

import static com.codeborne.selenide.Selenide.$;

public class TestBasket extends BasketPageSteps {

    @Test
    @Description("checkIfBasketisEmpty")
    @Severity(SeverityLevel.NORMAL)
    public void checkBasketIfEmpty () throws Exception {
        BrowserRunner.runner(chromeBrowser, defaultUrl);
        clickBasket();
        Assert.assertEquals(getEmptyBasket(), "სულ (0 ნივთი): 0 ლარი");

    }

    @Test
    @Description("checkIfBascetIconIsNull")
    @Severity(SeverityLevel.MINOR)
    public void checkBasketIconCount () throws Exception {
        BrowserRunner.runner(chromeBrowser, defaultUrl);
        clickBasket();
        Assert.assertEquals(getBasketCount(), "0");
    }

    @Test
    @Description("checkAddedItemBasketCount. iFrame Problem. Website is opening some chat which is not locatable")
    @Severity(SeverityLevel.MINOR)
    public void checkAddedItemBasketCount () throws Exception {
     BrowserRunner.runner(chromeBrowser, defaultUrl);
        CategoryPageSteps.addToBasket();
        Assert.assertEquals(getBasketCount(), "1");
    }
    @Test
    @Description("checkProductAndBasketData. iFrame Problem. Website is opening some chat which is not locatable")
    @Severity(SeverityLevel.CRITICAL)
    public void checkProductAndBasketData () throws Exception {
        BrowserRunner.runner(chromeBrowser, defaultUrl);
        CategoryPageSteps.clickTelevision();
        String productName = CategoryPageSteps.getNeededTelevision();
        String productPrice = CategoryPageSteps.getNeededTelevisionPrice();
        CategoryPageSteps.clickNeededTelevision();
        CategoryPageSteps.clickAddToBasket();
        clickBasket();
        Assert.assertEquals(productName, getItemName());
        Assert.assertEquals(productPrice, getPrice());
    }

}
