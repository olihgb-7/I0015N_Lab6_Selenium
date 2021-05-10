import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FillOutFormGridTest {

    FillOutFormGrid fillOutFormGrid;
    {
        try {
            fillOutFormGrid = new FillOutFormGrid();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("Fill out form")
    void fillFormTest() throws InterruptedException {
        fillOutFormGrid.fillOutForm();
        assertEquals("Free Timesheet Online Trial", fillOutFormGrid.driver.getTitle(), "Title should be: Free Timesheet Online Trial");
        assertEquals(Constants.FIRST_NAME, fillOutFormGrid.driver.findElement(By.id("first-name")).getAttribute("value"), "Should be " + Constants.FIRST_NAME);
        assertEquals(Constants.LAST_NAME, fillOutFormGrid.driver.findElement(By.id("last-name")).getAttribute("value"), "Should be " + Constants.LAST_NAME);
        assertEquals(Constants.EMAIL, fillOutFormGrid.driver.findElement(By.id("email")).getAttribute("value"), "Should be " + Constants.EMAIL);
        assertEquals(Constants.COMPANY, fillOutFormGrid.driver.findElement(By.id("company")).getAttribute("value"), "Should be " + Constants.COMPANY);
        fillOutFormGrid.driver.close();
        fillOutFormGrid.driver.quit();
    }
}
