import io.qameta.allure.Epic;
import io.qameta.allure.Link;
import object.Hotel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.ResultsToSearchingSteps;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Epic("Search Request")
class SearchRequestTest extends BaseTest {
    private ResultsToSearchingSteps resultsSteps = new ResultsToSearchingSteps();

    @Test
    @DisplayName(value = "Test Case ES-1: Creating a search query at HomePage")
    @Link (value = "Test Case ES-1: Creating a search query at HomePage",
            url = "https://docs.google.com/document/d/1MSDmG5ouMj-DQEnc1fwAYcTxup2pyyXMOPYOfRAeWnQ/edit#heading=h.5op9kdm6oa2n")
    void createSearchQueryAtHomePage() {
        resultsSteps.fillInputFieldWithSearchParametersOnHomePage(InputParametersForTest.hotelSearchParis);
        resultsSteps.goToResultsPagesFromHomePage();
        List<Hotel> actualList = resultsSteps.getHotelsListFromResultsPage();
        boolean actualParameters = resultsSteps.isParametersOnResultsPageEqualsEnteredData(
                InputParametersForTest.hotelSearchParis);
        assertTrue(actualList.size() > 0 && actualParameters);
    }

    @Test
    @DisplayName(value = "Test Case ES-11: Check the dropdown menu for input information")
    @Link (value = "Test Case ES-11: Check the dropdown menu for input information",
            url = "https://docs.google.com/document/d/1MSDmG5ouMj-DQEnc1fwAYcTxup2pyyXMOPYOfRAeWnQ/edit#heading=h.o65gw0e7831i")
    void checkTheDropdownMenuForInputInformation() {
        String location = "Par";
        assertTrue(resultsSteps.isCheckEnteredValueInDropdownMenu(location));
    }

    @Test
    @DisplayName(value = "Test Case ES-2: Creating a search query at HotelsPage")
    @Link (value = "Test Case ES-2: Creating a search query at HotelsPage",
            url = "https://docs.google.com/document/d/1MSDmG5ouMj-DQEnc1fwAYcTxup2pyyXMOPYOfRAeWnQ/edit#heading=h.iphgwosm2ehj")
    void creatingSearchQueryAtHotelsPage(){
        resultsSteps.enterSearchParametersOnHotelPage(InputParametersForTest.hotelSearchMinsk);
        resultsSteps.goToResultsPagesFromHotelPage();
        List<Hotel> actualList = resultsSteps.getHotelsListFromResultsPage();
        boolean actualParameters = resultsSteps.isParametersOnResultsPageEqualsEnteredData(
                InputParametersForTest.hotelSearchMinsk);
        assertTrue(actualList.size() > 0);
    }


}
