import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoogleSearchGridTest {

    @Test
    @DisplayName("Google Search result")
    void googleSearchResult() throws InterruptedException {
        GoogleSearchGrid googleSearchGrid = new GoogleSearchGrid();
        try {
            assertEquals("Software Testing", googleSearchGrid.search(), "Search result should be: Software testing");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
