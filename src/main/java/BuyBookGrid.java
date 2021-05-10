import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BuyBookGrid {

    WebDriver driver;

    BuyBookGrid() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new RemoteWebDriver(new URL("http://35.173.48.206:4444"), chromeOptions);
    }

    public void buyBook() throws InterruptedException {
        driver.get("https://adlibris.com/se");
        driver.findElement(By.id("q")).sendKeys("praktisk mjukvarutestning\n");
        driver.findElement(By.className("search-result__product__name")).click();
        driver.findElement(By.cssSelector(".product__add-to-cart:nth-child(1)")).click();

        // Wait for the element to load
        while (driver.findElements(By.cssSelector(".page-header__toggler__text:nth-child(3)")).size() <= 0) {
            Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector(".page-header__toggler__text:nth-child(3)")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Till kassan")).click();
    }
}
