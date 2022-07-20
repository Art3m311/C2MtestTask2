import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.Properties;


public class TestBase {
    public void setUp() throws IOException {
        Properties prop = new Properties();
        prop.load(TestBase.class.getClassLoader().getResourceAsStream("browserType.properties"));
        String browser = prop.getProperty("browserType");
        System.out.println(browser);

        if (browser.equals("chrome") || browser.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            Configuration.browser = "chrome";
            Configuration.driverManagerEnabled = true;
            Configuration.browserSize = "1280x720";
            Configuration.headless = false;
            Configuration.reportsFolder = "src/test/downloadedImages";

        } else if (browser.equals("firefox") || browser.equals("Firefox")) {
            WebDriverManager.firefoxdriver();
            Configuration.browser = "firefox";
            Configuration.driverManagerEnabled = true;
            Configuration.browserSize = "1280x720";
            Configuration.headless = false;
            Configuration.reportsFolder = "src/test/downloadedImages";
        } else {
            System.out.println("Browser is not defined");
        }

    }

    @BeforeTest
    public void initializeBrowser() throws IOException {
        setUp();
    }

    @AfterTest
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}

