package pages;
import base.BasePage;
import org.openqa.selenium.WebDriver;


public class VideoPage extends BasePage {
    private final String authorAvatarXpath = "//ytd-video-owner-renderer//a[contains(@href, '/@')]";

    public VideoPage(WebDriver driver) {
        super(driver);
    }

    public void clickAuthorAvatar() {
        visibilityOfElementByXpath(authorAvatarXpath).click();
    }
}
