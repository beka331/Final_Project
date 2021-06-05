import PageSteps.CategoryPageSteps;
import WebDrivers.BrowserData;
import WebDrivers.BrowserRunner;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCategory extends CategoryPageSteps{

    @Test
    @Description ("checkProductInfo")
    @Severity(SeverityLevel.CRITICAL)
    public void checkProductInfo() throws Exception {
        BrowserRunner.runner(chromeBrowser, defaultUrl);
        clickTelevision();
        String productName = getNeededTelevision();
        String productPrice = getNeededTelevisionPrice();
        clickNeededTelevision();
        Assert.assertEquals(productName, getTitle());
        Assert.assertEquals(productPrice, getProductPrice());
        Assert.assertEquals("1", getProductQuantity());
    }

    @Test
    @Description ("checkBoxClick")
    @Severity(SeverityLevel.MINOR)
    public void checkBoxClick() throws Exception {
        BrowserRunner.runner(chromeBrowser, defaultUrl);
        clickTelevision();
        Selenide.sleep(10000);
        checkIframePopup();
        clickCheckBoxFilter();
    }

    @Test
    @Description ("priceFilter - iFrame Problem. Website is opening some chat which is not locatable")
    @Severity(SeverityLevel.NORMAL)
    public void priceFilter() throws Exception {
        BrowserRunner.runner(chromeBrowser, defaultUrl);
        clickTelevision();
        Selenide.sleep(1000);
        setMinPrice("1");
        setMaxPrice("10");
        Assert.assertEquals(getProductStatus(), "პროდუქტები ვერ მოიძებნა");
    }
}
