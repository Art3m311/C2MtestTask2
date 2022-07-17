import com.codeborne.selenide.Selenide;
import org.junit.Test;
import java.io.IOException;
import java.net.URISyntaxException;
import static com.codeborne.selenide.Selenide.sleep;

public class TestFirefox extends BaseForTestFirefox {
    PhotoToGit photoToGit = new PhotoToGit();

    @Test
    public void testFireFox() throws IOException, URISyntaxException {
        PhotoToGit.getPhoto();
        Selenide.screenshot("pictureFireFox" + Long.toString(System.currentTimeMillis()));
        sleep(2000);
    }

}
