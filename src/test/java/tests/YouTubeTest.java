package tests;

import base.TestInit;
import org.testng.annotations.Test;
import pages.ChannelPage;
import pages.HomePage;
import pages.ResultsPage;
import pages.VideoPage;
import utills.RandomValue;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class YouTubeTest extends TestInit {

    @Test
    public void testFullScenario() {
        HomePage homePage = new HomePage(driver);
        ResultsPage resultsPage = new ResultsPage(driver);
        VideoPage videoPage = new VideoPage(driver);
        ChannelPage channelPage = new ChannelPage(driver);

        homePage.openHomePage();
        assertEquals(homePage.getTitle(), "YouTube");

        String randomDigits = RandomValue.generateRandomDigits();
        homePage.enterSearchQuery(randomDigits);
        driver.manage().window().maximize();
        homePage.clickSecondSuggestion();

        resultsPage.clickFourthVideo();
        videoPage.clickAuthorAvatar();
        channelPage.clickSubscribe();

        assertTrue(channelPage.isSignInVisible(), "Не відображено текст 'Войти'.");
    }
    }

