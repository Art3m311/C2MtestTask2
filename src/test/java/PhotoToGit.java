import java.io.IOException;
import java.net.URISyntaxException;

import static com.codeborne.selenide.Selenide.sleep;

public class PhotoToGit {

    public  final static String BASE_URL = "https://www.google.com/";
    public  final static String NAME_INPUT = "Артем Журкин";
    public String urlImg;
    public static void getPhoto() throws IOException, URISyntaxException {
        StartPage startPage = new StartPage(BASE_URL); //заходим в google.com
        SearchResultPage searchResult = new SearchResultPage();
        ImagesPage imagesPage = new ImagesPage();

        startPage.search(NAME_INPUT);// ввести Имя Фамилию
        searchResult.openTab(); // открыть табу "Картинки"
        sleep(1000);
        imagesPage.openImage(); // Открыть искомое изображение
        imagesPage.getURL(); // достать url картинки
        imagesPage.openNewTab();



        //imagesPage.openMenu();
        //imagesPage.openSend();
        //imagesPage.download();
        //urlImg =  imagesPage.targetImage.getAttribute("src");

        int a = 0;
    }
}
