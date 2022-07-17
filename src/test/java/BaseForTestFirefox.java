import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;


public class BaseForTestFirefox {

    public void setUpForFireFox() {
        WebDriverManager.firefoxdriver();
        Configuration.browser = "firefox";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1280x720";
        Configuration.headless = false;
        Configuration.reportsFolder = "src/test/downloadedImages";
    }

    @Before
    public  void  initFirefox() {
        setUpForFireFox();
    }

    @After
    public  void tearDown() {
        Selenide.closeWebDriver();
    }
}
