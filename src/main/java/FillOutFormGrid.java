import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class FillOutFormGrid  {

    WebDriver driver;

    FillOutFormGrid() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new RemoteWebDriver(new URL("http://35.173.48.206:4444"), chromeOptions);
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
