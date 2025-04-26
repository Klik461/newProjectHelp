package pages;

import base.BasePage;
import base.TestInit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage extends BasePage {
    private final String searchInputXpath = "//input[@name='search_query']";
    private final String suggestionsXpath = "//div[@class='ytSuggestionComponentSuggestion ytSuggestionComponentSuggestionHover'][2]";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage() {
        TestInit.openUrl("https://www.youtube.com/");
    }

    public void enterSearchQuery(String query) {
        WebElement searchInput = visibilityOfElementByXpath(searchInputXpath);
        searchInput.click();
        searchInput.clear();
        searchInput.sendKeys(query);
        searchInput.sendKeys(Keys.SPACE); // стимулюємо появу автопідказок
    }

    public void clickSecondSuggestion() {
        visibilityOfElementByXpath(suggestionsXpath).click();
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
