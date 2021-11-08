import io.qameta.allure.Link;
import object.HotelRoom;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.ResultsToSearchingSteps;
import steps.ViewHotelInformationStep;
import steps.ViewRoomInformationSteps;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ViewInformationRoomTest extends BaseTest {
    private final ResultsToSearchingSteps resultsSteps = new ResultsToSearchingSteps();
    private final ViewHotelInformationStep viewHotelSteps = new ViewHotelInformationStep();
    private final ViewRoomInformationSteps viewRoomSteps = new ViewRoomInformationSteps();

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
    @DisplayName(value = "Test Case ES-7: Check the room rate for one night")
    @Link (value = "Test Case ES-7: Check the room rate for one night",
            url = "https://docs.google.com/document/d/1MSDmG5ouMj-DQEnc1fwAYcTxup2pyyXMOPYOfRAeWnQ/edit#heading=h.h4doq3u42cry")
    void checkTheRoomRateForOneNight() {
        String hotelName = "Park Plaza County Hall London";
        String roomName = "Studio, 1 Double Bed (Room)";
        resultsSteps.goToHotelInformationPages(hotelName);
        List<HotelRoom> listHotelRoom = viewHotelSteps.getHotelRoomListFromHotelInformationPage();
        BigDecimal expected = ComponentsForTest.getSumPricePerNightHotelRoomFromLisHotelRoom(listHotelRoom,roomName);
        viewHotelSteps.goToRoomInformationPages(roomName);
        BigDecimal actualPrice = viewRoomSteps.getInformationRoomFromRoomInformationPage().getPrice().getSum();
        assertEquals(actualPrice, expected);
    }

    @Test
    @DisplayName(value = "Test Case ES-8: Check the total room rate")
    @Link (value = "Test Case ES-8: Check the total room rate",
            url = "https://docs.google.com/document/d/1MSDmG5ouMj-DQEnc1fwAYcTxup2pyyXMOPYOfRAeWnQ/edit#heading=h.pe2a7r9hg9af")
    void checkTheTotalRoomRate() {
        String hotelName = "Park Plaza County Hall London";
        String roomName = "Studio, 1 Double Bed (Room)";
        resultsSteps.goToHotelInformationPages(hotelName);
        viewHotelSteps.goToRoomInformationPages(roomName);
        List<HotelRoom> listHotelRoom = viewHotelSteps.getHotelRoomListFromHotelInformationPage();
        BigDecimal expected = ComponentsForTest.getSumPricePerNightHotelRoomFromLisHotelRoom(listHotelRoom,roomName);
        viewHotelSteps.goToRoomInformationPages(roomName);
        BigDecimal actualPrice = viewRoomSteps.getTotalPrice();
        assert expected != null;
        assertEquals(actualPrice, expected.multiply(BigDecimal.valueOf(5.0)));
    }
}