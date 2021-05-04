import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FillOutForm {

    WebDriver driver;

    FillOutForm() {
        System.setProperty(Constants.CHROME_DRIVER_KEY, Constants.CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();
    }

    public void fillOutForm() throws InterruptedException {
        driver.get("https://www.actitime.com/");
        driver.findElement(By.linkText("Try Free")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("first-name")).sendKeys(Constants.FIRST_NAME);
        driver.findElement(By.id("last-name")).sendKeys(Constants.LAST_NAME);
        driver.findElement(By.id("email")).sendKeys(Constants.EMAIL);
        driver.findElement(By.id("company")).sendKeys(Constants.COMPANY);
        Thread.sleep(5000);
    }
}
