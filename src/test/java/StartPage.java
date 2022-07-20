import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Открытие стартовой страницы Google.com
 */
public class StartPage {

    private final SelenideElement inputForm = $x("//input[@name='q']");
    public StartPage(String url) {
        Selenide.open(url);
    }

    /**
     * Ввод в форму поиска google информации и выполнение поиска
     */
    public void search(String searchInfo) {
        inputForm.setValue(searchInfo);
        inputForm.sendKeys(Keys.ENTER);
    }
}
