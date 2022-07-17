import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.$$x;

/**
 * Открытие вкладки "Картинки"
 */
public class SearchResultPage {

    private final ElementsCollection tabs = $$x("//div[@class='hdtb-mitem']//a");

    public void openTab() {
        tabs.first().click();
    }
}