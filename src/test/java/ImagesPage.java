import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;

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


    //private final ElementsCollection dotMenu = $$x("//a[@class=\"CqeZic\"]");
    //private final SelenideElement finalDotMenu = dotMenu.get(1); // достаем нужный элемент

    //public void openMenu() { finalDotMenu.click(); }
    //private final ElementsCollection send = $$x("//a[@jsname='YOuPgf']");
    //private final SelenideElement finalSend = send.get(1);
    //public void openSend() { finalSend.click(); }
    //private final SelenideElement linkCopyElement = $x("//a[@jsname='RYUcpc']");
    //public String link = linkCopyElement.getAttribute("href");

    //public void download () throws FileNotFoundException {
   //     linkCopyElement.download();

   // }


}
////a[@class='c1AlVc']