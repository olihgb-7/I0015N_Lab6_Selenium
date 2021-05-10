import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuyBookGridTest {


    BuyBookGrid buyBook;

    {
        try {
            buyBook = new BuyBookGrid();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("Buy book")
    void buyBookTest() throws InterruptedException {
        buyBook.buyBook();
        assertEquals("Kassa | Adlibris", buyBook.driver.getTitle(), "Should be: Kassa | Adlibris");
        assertEquals("Praktisk mjukvarutestning", buyBook.driver.findElement(By.className("cart-item-product__title__main-part")).getText(), "Should be: Praktisk mjukvarutestning");
        buyBook.driver.close();
        buyBook.driver.quit();
    }
}
