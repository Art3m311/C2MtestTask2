import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;

public class BaseForTestChrome {

    public  void setUpForChrome() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1280x720";
        Configuration.headless = false;
        Configuration.reportsFolder = "src/test/downloadedImages";
    }

    @Before
    public  void  initChrome() {
        setUpForChrome();
    }


    @After
    public  void tearDown() {
        Selenide.closeWebDriver();
    }

}
