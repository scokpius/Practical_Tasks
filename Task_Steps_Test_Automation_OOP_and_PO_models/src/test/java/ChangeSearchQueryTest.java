import io.qameta.allure.Link;
import object.Hotel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.ResultsToSearchingSteps;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


class ChangeSearchQueryTest extends BaseTest {
    private ResultsToSearchingSteps resultsSteps = new ResultsToSearchingSteps();
    private List<Hotel> hotelsResultFirst;

    @BeforeEach
    void createSearchQuery() {
        resultsSteps.fillInputFieldWithSearchParametersOnHomePage(InputParametersForTests.hotelSearchParis);
        hotelsResultFirst = resultsSteps.getHotelsListFromResultsPage();
    }

    /**
     * Test Case ES-3: Change search query in ResultsPage
     * https://docs.google.com/document/d/1MSDmG5ouMj-DQEnc1fwAYcTxup2pyyXMOPYOfRAeWnQ/edit?usp=sharing
     */
    @Test
    @DisplayName(value = "Test Case ES-3: Change search query in ResultsPage")
    @Link(value = "",
            url = "")
    void changeSearchQueryInResultsPage() {
        String location = "London";
        resultsSteps.enterSearchParametersOnResultsPage(location);
        List<Hotel> hotelsResultSecond = resultsSteps.getHotelsListFromResultsPage();
        assertTrue(ComponentsForTest.isCompareListWithModifiedParametersWithOriginalList(hotelsResultFirst, hotelsResultSecond));
    }

}
