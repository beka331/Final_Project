package WebDrivers;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserRunner implements BrowserData {
    public static void runner (String browserName, String url) throws Exception {
        if (browserName == "chrome") {
            WebDriverManager.chromedriver().browserVersion(chromeversion);
            Configuration.browser = "Chrome";
            Configuration.startMaximized = true;
            Selenide.open(url);
        } else if (browserName == "edge") {
            WebDriverManager.edgedriver().browserVersion(edgeversion);
            Configuration.browser = "Edge";
            Configuration.startMaximized = true;
            Selenide.open(url);
        } else {
            throw new Exception("Please, enter real browser name");
        }
    }
}
