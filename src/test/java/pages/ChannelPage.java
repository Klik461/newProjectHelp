package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ChannelPage extends BasePage {
    private final String subscribeButtonXpath = "//button[@aria-label='Подписаться']";
    private final String signInTextXpath = "//yt-button-shape[@class='style-scope ytd-popup-container']";

    public ChannelPage(WebDriver driver) {
        super(driver);
    }

    public void clickSubscribe() {
        visibilityOfElementByXpath(subscribeButtonXpath).click();
    }

    public boolean isSignInVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signInTextXpath))).isDisplayed();
        } catch (TimeoutException e) {
            return false;
        }
    }
}