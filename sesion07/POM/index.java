import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class index {

    protected WebDriver driver;

    private By fromPort= By.name("fromPort");
    private By toPort= By.name("toPort");
    private By btnSend = By.cssSelector(".btn-primary");

    public index(WebDriver driver) {
        this.driver = driver;
        if(!driver.getCurrentUrl().equals("https://www.blazedemo.com/index.php")) {
            throw new IllegalStateException("You are not in the index");
        }
    }

    public void selectToPort(){
        WebElement dropdown = driver.findElement(toPort);
        dropdown.findElement(By.xpath("//option[. = 'New York']")).click();
    }

    public select selectTicket(){
        WebElement send = driver.findElement(btnSend);
        send.click();

        return new select(driver);
    }



}
