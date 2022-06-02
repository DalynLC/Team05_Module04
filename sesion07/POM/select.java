import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class select {

    protected WebDriver driver;

    private By selectedOption= By.cssSelector("tr:nth-child(1) .btn");

    public select(WebDriver driver) {
        this.driver = driver;

    }

    public data openDataPage(){
        WebElement send = driver.findElement(selectedOption);
        send.click();

        return new data(driver);
    }


}
