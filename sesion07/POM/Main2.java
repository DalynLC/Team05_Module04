import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    index indexPag;
    select selectOpt;
    data dataPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void aAAA() {
        driver.get("https://www.blazedemo.com/index.php");
        driver.manage().window().maximize();

        indexPag = new index(driver);
        indexPag.selectToPort();

        selectOpt = indexPag.selectTicket();

        dataPage = selectOpt.openDataPage();

        dataPage.sendData("Osmar","Barraza","Anytown","State","11111","1111111111111111","2018","John Smith");
        dataPage.selectCard();
        dataPage.purchaseTicket();
    }
}