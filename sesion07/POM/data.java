import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class data {

    protected WebDriver driver;

    private By name= By.id("inputName");
    private By address= By.id("address");
    private By city = By.id("city");
    private By state= By.id("state");
    private By zipCode= By.id("zipCode");
    private By cardType = By.id("cardType");
    private By cardNumber= By.id("creditCardNumber");
    private By cardYear= By.id("creditCardYear");
    private By cardName = By.id("nameOnCard");
    private By btnSend = By.cssSelector(".btn-primary");

    public data(WebDriver driver) {
        this.driver = driver;
    }

    public void sendText(By x, String text){
        driver.findElement(x).clear();
        driver.findElement(x).sendKeys(text);
    }

    public void sendData(String name, String address, String city, String state, String Zip, String cardNumb, String cardYear, String cardName){
        fillName(name);
        fillAddress(address);
        fillCity(city);
        fillState(state);
        fillZip(Zip);
        fillCardName(cardName);
        fillCardNumber(cardNumb);
        fillCardYear(cardYear);
    }

    public void fillName(String text){
        sendText(name,text);
    }

    public void fillAddress(String text){
        sendText(address,text);
    }

    public void fillCity(String text){
        sendText(city,text);
    }

    public void fillState(String text){
        sendText(state,text);
    }

    public void fillZip(String text){
        sendText(zipCode,text);
    }

    public void fillCardNumber(String text){
        sendText(cardNumber,text);
    }

    public void fillCardYear(String text){
        sendText(cardYear,text);
    }

    public void fillCardName(String text){
        sendText(cardName,text);
    }

    public void selectCard(){
        WebElement dropdown = driver.findElement(cardType);
        dropdown.findElement(By.xpath("//option[. = 'American Express']")).click();
    }

    public void purchaseTicket(){
        WebElement send = driver.findElement(btnSend);
        send.click();
    }



}
