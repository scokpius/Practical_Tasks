import io.qameta.allure.Link;
import object.Hotel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.ResultsToSearchingSteps;
import steps.ViewHotelInformationStep;
import steps.ViewRoomInformationSteps;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ViewInformationTest extends BaseTest {
    private ResultsToSearchingSteps resultsSteps = new ResultsToSearchingSteps();
    private ViewHotelInformationStep viewHotelSteps = new ViewHotelInformationStep();
    private ViewRoomInformationSteps viewRoomSteps = new ViewRoomInformationSteps();

    @BeforeEach
    void createSearchQuery() {
        resultsSteps.fillInputFieldWithSearchParametersOnHomePage(InputParametersForTests.hotelSearchLondon);
        resultsSteps.goToResultsPagesFromHomePage();
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
        assertEquals(actualLocation, InputParametersForTests.hotelSearchLondon.getLocation());
    }

    @Test
    @DisplayName(value = "Test Case ES-7: Check the room rate for one night")
    @Link (value = "Test Case ES-7: Check the room rate for one night",
            url = "https://docs.google.com/document/d/1MSDmG5ouMj-DQEnc1fwAYcTxup2pyyXMOPYOfRAeWnQ/edit#heading=h.h4doq3u42cry")
    void checkTheRoomRateForOneNight() {
        String hotelName = "Park Plaza County Hall London";
        String roomName = "Penthouse, 1 Bedroom (Suite)";
        List<Hotel> actualList = resultsSteps.getHotelsListFromResultsPage();
        System.out.println(actualList);
        resultsSteps.goToHotelInformationPages(hotelName);
        viewHotelSteps.goToRoomInformationPages(roomName);
        System.out.println(viewRoomSteps.getInformationRoomFromRoomInformationPage());
        String actualPrice = viewHotelSteps.getHotelLocationFromHotelInformationPage();
        assertEquals(actualPrice, InputParametersForTests.hotelSearchLondon.getLocation());
    }

    @Test
    @DisplayName(value = "Test Case ES-8: Check the total room rate")
    @Link (value = "Test Case ES-8: Check the total room rate",
            url = "https://docs.google.com/document/d/1MSDmG5ouMj-DQEnc1fwAYcTxup2pyyXMOPYOfRAeWnQ/edit#heading=h.pe2a7r9hg9af")
    void checkTheTotalRoomRate() {
        String hotelName = "Park Plaza County Hall London";
        String roomName = "Penthouse, 1 Bedroom (Suite)";
        resultsSteps.goToHotelInformationPages(hotelName);
        viewHotelSteps.goToRoomInformationPages(roomName);
        String actualPrice = viewHotelSteps.getHotelLocationFromHotelInformationPage();
        assertEquals(actualPrice, InputParametersForTests.hotelSearchLondon.getLocation());
    }
}
