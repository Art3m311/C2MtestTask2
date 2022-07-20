import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

/**
 * Открытие третей картинки
 */
public class ImagesPage {

    private final ElementsCollection images = $$x("//div[@jsname='r5xl4']//img");
    private final SelenideElement targetImage = images.get(2); //Выбор 3-й картинки из коллекции
    private final ElementsCollection img = $$x("//img[@jsname='HiaYvf']");
    private final SelenideElement fullPic = img.get(1);
    public static String link;

    public void openImage() {
        targetImage.click();
    }

    public void getURL() {
        link = fullPic.getAttribute("src");
    }

    public void openNewTab() {
        Selenide.open(link);
    }
}
