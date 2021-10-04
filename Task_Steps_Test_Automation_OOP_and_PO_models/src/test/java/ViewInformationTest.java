import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.ResultsToSearchingSteps;
import steps.ViewHotelInformationStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ViewInformationTest extends BaseTest {
    private ResultsToSearchingSteps resultsSearchPage = new ResultsToSearchingSteps();
    private ViewHotelInformationStep viewHotelInformationPage = new ViewHotelInformationStep();

    @BeforeEach
    void createSearchQuery() {
        resultsSearchPage.fillInputFieldWithSearchParametersOnHomePage(InputParametersForTests.hotelSearchLondon);
        resultsSearchPage.goToResultsPagesFromHomePage();
    }

    /**
     * Test Case ES-5: Check the name of the selected hotel
     * https://docs.google.com/document/d/1MSDmG5ouMj-DQEnc1fwAYcTxup2pyyXMOPYOfRAeWnQ/edit?usp=sharing
     */
    @Test
    @DisplayName(value = "Test Case ES-5: Check the name of the selected hotel")
    void checkTheNameOfTheSelectedHotel() {
        String hotelName = "Park Plaza County Hall London";
        resultsSearchPage.goToHotelInformationPages(hotelName);
        String actualHotelName = viewHotelInformationPage.getHotelNameFromHotelInformationPage();
        assertEquals(actualHotelName, hotelName);
    }

    /**
     * Test Case ES-6: Check location hotel
     * https://docs.google.com/document/d/1MSDmG5ouMj-DQEnc1fwAYcTxup2pyyXMOPYOfRAeWnQ/edit?usp=sharing
     */
    @Test
    @DisplayName(value = "Test Case ES-6: Check location hotel")
    void CheckLocationHotel() {
        String hotelName = "Park Plaza County Hall London";
        resultsSearchPage.goToHotelInformationPages(hotelName);
        String actualLocation = viewHotelInformationPage.getHotelLocationFromHotelInformationPage();
        assertEquals(actualLocation, InputParametersForTests.hotelSearchLondon.getLocation());
    }
}
