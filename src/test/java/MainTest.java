import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;
import java.io.IOException;
import java.net.URISyntaxException;
import static com.codeborne.selenide.Selenide.sleep;

public class MainTest extends TestBase {
    @Test
    public void testPhoto() throws IOException, URISyntaxException {
        PhotoToGit.getPhoto();
        Selenide.screenshot("picture" + System.currentTimeMillis());
        sleep(2000);
    }
}