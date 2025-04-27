package pages;
import baseСlasses.BasePage;
import org.openqa.selenium.WebDriver;

public class ResultsPage extends BasePage {

    public ResultsPage(WebDriver driver) {
        super(driver);
    }
    private final String VIDEO_LIST = "//ytd-video-renderer/div[@id='dismissible']";

    public void clickOnVideoByIndex(int index) {
        // цей двіж треба обробить іф-ом
        // бо якщо це не відео а посилання на інший сайт то тест відпрацьоватиме не вірно
        // тому потрібно його переривати з відповідним ексепшеном,
        // типу на 4-му місці не відео а посилання на інший ресур


//        if ()
//
//        try {
//            clickOnElementByIndex(VIDEO_LIST, index);
//        } catch (Exception e) {
//            throw new RuntimeException("Помилка при кліку на відео за індексом " + index, e);
//        }
//    }


}