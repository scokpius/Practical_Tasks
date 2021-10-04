import object.Hotel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.ResultsToSearchingSteps;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


class SearchRequestTest extends BaseTest {
    private ResultsToSearchingSteps resultsSteps = new ResultsToSearchingSteps();

    /**
     * Test Case ES-1: Creating a search query at HomePage
     * https://docs.google.com/document/d/1MSDmG5ouMj-DQEnc1fwAYcTxup2pyyXMOPYOfRAeWnQ/edit?usp=sharing
     */
    @Test
    @DisplayName(value = "Test Case ES-1: Creating a search query at HomePage")
    void createSearchQueryAtHomePage() {
        resultsSteps.fillInputFieldWithSearchParametersOnHomePage(InputParametersForTests.hotelSearchParis);
        resultsSteps.goToResultsPagesFromHomePage();
        List<Hotel> actualList = resultsSteps.getHotelsListFromResultsPage();
        boolean actualParameters = resultsSteps.isParametersOnResultsPageEqualsEnteredData(
                InputParametersForTests.hotelSearchParis);
        assertTrue(actualList.size() > 0 && actualParameters);
    }

    /**
     * Test Case ES-11: Check the dropdown menu for input information
     * https://docs.google.com/document/d/1MSDmG5ouMj-DQEnc1fwAYcTxup2pyyXMOPYOfRAeWnQ/edit?usp=sharing
     */
    @Test
    @DisplayName(value = "Test Case ES-11: Check the dropdown menu for input information")
    void checkTheDropdownMenuForInputInformation() {
        String location = "Par";
        assertTrue(resultsSteps.isCheckEnteredValueInDropdownMenu(location));
    }

    /**
     * Test Case ES-2: Creating a search query at HotelsPage
     * https://docs.google.com/document/d/1MSDmG5ouMj-DQEnc1fwAYcTxup2pyyXMOPYOfRAeWnQ/edit?usp=sharing
     */
    @Test
    @DisplayName(value = "Test Case ES-2: Creating a search query at HotelsPage")
    void creatingSearchQueryAtHotelsPage(){
        resultsSteps.enterSearchParametersOnHotelPage(InputParametersForTests.hotelSearchMinsk);
        resultsSteps.goToResultsPagesFromHotelPage();
        List<Hotel> actualList = resultsSteps.getHotelsListFromResultsPage();
        boolean actualParameters = resultsSteps.isParametersOnResultsPageEqualsEnteredData(
                InputParametersForTests.hotelSearchParis);
        assertTrue(actualList.size()>0 && actualParameters);
    }


}
