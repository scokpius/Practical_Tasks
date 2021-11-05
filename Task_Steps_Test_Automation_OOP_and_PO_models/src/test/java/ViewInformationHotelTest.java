import io.qameta.allure.Link;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.ResultsToSearchingSteps;
import steps.ViewHotelInformationStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ViewInformationHotelTest extends BaseTest {
    private ResultsToSearchingSteps resultsSteps = new ResultsToSearchingSteps();
    private ViewHotelInformationStep viewHotelSteps = new ViewHotelInformationStep();

    @BeforeEach
    void createSearchQuery() {
        resultsSteps.fillInputFieldWithSearchParametersOnHomePage(InputParametersForTest.hotelSearchLondon);
        resultsSteps.goToResultsPagesFromHomePage();
    }

    @AfterEach

    void closeAll() {
        closeBrowser();
    }

    @Test
    @DisplayName(value = "Test Case ES-5: Check the name of the selected hotel")
    @Link(value = "Test Case ES-5: Check the name of the selected hotel",
            url = "https://docs.google.com/document/d/1MSDmG5ouMj-DQEnc1fwAYcTxup2pyyXMOPYOfRAeWnQ/edit#heading=h.rwgoxfsv9237")
    void checkTheNameOfTheSelectedHotel() {
        String hotelName = "Park Plaza County Hall London";
        resultsSteps.goToHotelInformationPages(hotelName);
        String actualHotelName = viewHotelSteps.getHotelNameFromHotelInformationPage();
        assertEquals(actualHotelName, hotelName);
    }

    @Test
    @DisplayName(value = "Test Case ES-6: Check location hotel")
    @Link (value = "Test Case ES-6: Check location hotel",
            url = "https://docs.google.com/document/d/1MSDmG5ouMj-DQEnc1fwAYcTxup2pyyXMOPYOfRAeWnQ/edit#heading=h.43mfe0kcs35e")
    void CheckLocationHotel() {
        String hotelName = "Park Plaza County Hall London";
        resultsSteps.goToHotelInformationPages(hotelName);
        String actualLocation = viewHotelSteps.getHotelLocationFromHotelInformationPage();
        assertEquals(actualLocation, InputParametersForTest.hotelSearchLondon.getLocation());
    }
}
