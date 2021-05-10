import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoogleSearchTest {
    @Test
    @DisplayName("Google Search result")
    void googleSearchResult() throws InterruptedException {
        GoogleSearch googleSearch = new GoogleSearch();
        assertEquals("Software Testing", googleSearch.search(), "Search result should be: Software testing");
    }
}