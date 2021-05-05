import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FillOutFormTest {

    FillOutForm fillOutForm = new FillOutForm();

    @Test
    @DisplayName("Fill out form")
    void fillFormTest() throws InterruptedException {
        fillOutForm.fillOutForm();
        assertEquals("Free Timesheet Online Trial", fillOutForm.driver.getTitle(), "Title should be: Free Timesheet Online Trial");
        assertEquals(Constants.FIRST_NAME, fillOutForm.driver.findElement(By.id("first-name")).getAttribute("value"), "Should be " + Constants.FIRST_NAME);
        assertEquals(Constants.LAST_NAME, fillOutForm.driver.findElement(By.id("last-name")).getAttribute("value"), "Should be " + Constants.LAST_NAME);
        assertEquals(Constants.EMAIL, fillOutForm.driver.findElement(By.id("email")).getAttribute("value"), "Should be " + Constants.EMAIL);
        assertEquals(Constants.COMPANY, fillOutForm.driver.findElement(By.id("company")).getAttribute("value"), "Should be " + Constants.COMPANY);
        fillOutForm.driver.close();
        fillOutForm.driver.quit();
    }
}