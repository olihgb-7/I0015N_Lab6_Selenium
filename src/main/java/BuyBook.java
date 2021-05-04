import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyBook {

    WebDriver driver;

    BuyBook() {
        System.setProperty(Constants.CHROME_DRIVER_KEY, Constants.CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();
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
        driver.findElement(By.linkText("Till kassan")).click();
    }
}
