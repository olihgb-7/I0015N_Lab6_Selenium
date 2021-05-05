import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    public String search() throws InterruptedException {

        String searchTitle, searchResult;

        System.setProperty(Constants.CHROME_DRIVER_KEY, Constants.CHROME_DRIVER_LOCATION);
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");                                        // Navigate to www.google.com
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='zV9nZe']/div")).click();         // Accept the Google terms
        Thread.sleep(1000);
        driver.findElement(By.name("q")).sendKeys("Software Testing");   // Find the search bar and type in "Software testing"
        Thread.sleep(1000);
        driver.findElement(By.xpath("//body/div/div[2]")).click();                  // Click out of the search bar
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();         // Click on the search button
        Thread.sleep(1000);

        searchTitle = driver.getTitle();
        searchResult = searchTitle.substring(0, searchTitle.indexOf(" -"));

        driver.close();
        driver.quit();
        return searchResult;
    }

}
