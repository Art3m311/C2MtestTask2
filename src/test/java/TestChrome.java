import com.codeborne.selenide.Selenide;
import java.util.Random;
import org.junit.Test;


import java.io.IOException;
import java.net.URISyntaxException;



import static com.codeborne.selenide.Selenide.sleep;

public class TestChrome extends BaseForTestChrome {
    PhotoToGit photoToGit = new PhotoToGit();

    @Test
    public void testChrome() throws IOException, URISyntaxException {
        PhotoToGit.getPhoto();
        Selenide.screenshot("pictureChrome" + Long.toString(System.currentTimeMillis()));
        sleep(2000);


    }

}
///Users/artemzhurkin/Documents/GitHub/C2MTask2