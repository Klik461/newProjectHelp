package pages;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;
import java.util.NoSuchElementException;

public class ResultsPage extends BasePage {
    private By videos = By.cssSelector("ytd-video-renderer a#thumbnail");

    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    public void clickFourthVideo() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(videos));
        List<WebElement> videoList = driver.findElements(videos);
        if (videoList.size() >= 4) {
            videoList.get(3).click();  // 0-based
        } else {
            throw new NoSuchElementException("Not enough videos in results.");
        }
    }
}