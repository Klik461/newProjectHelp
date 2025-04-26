package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestInit {
    protected static WebDriver driver;

    private static final String YouTubeUrl = "https://www.youtube.com/";

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown () {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void openUrl(String url){
        driver.get(YouTubeUrl);
    }

}
