package pages;

import baseСlasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ChannelPage extends BasePage {
    private final String SUBSCRIBE_BUTTON = "//div[contains(@class, 'header-view-model')]//div[contains(@class, 'button-text-content')]";
    private final String SIGN_IN_BUTTON = "//yt-button-shape[@class='style-scope ytd-popup-container']";

    public ChannelPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSubscribe() {
        clickOnVisibilityOfElementLocatedByXpath(SUBSCRIBE_BUTTON);
    }

    public boolean isSignInVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SIGN_IN_BUTTON))).isDisplayed();
        } catch (TimeoutException e) {
            return false;
        }
    }
}