package pages;
import baseСlasses.BasePage;
import org.openqa.selenium.WebDriver;


public class VideoPage extends BasePage {

    public VideoPage(WebDriver driver) {
        super(driver);
    }

    private final String AUTHOR_AVATAR = "//div[@id='owner']//yt-img-shadow[@id='avatar']";

    public void clickOnAuthorAvatar() {
        clickOnVisibilityOfElementLocatedByXpath(AUTHOR_AVATAR);
    }

}
