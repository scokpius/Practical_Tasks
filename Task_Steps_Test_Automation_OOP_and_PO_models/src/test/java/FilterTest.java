import io.qameta.allure.Link;
import object.Hotel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.ResultsToSearchingSteps;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FilterTest extends BaseTest {

    private ResultsToSearchingSteps resultsSteps = new ResultsToSearchingSteps();

    @BeforeEach
    void createSearchQuery() {
        resultsSteps.fillInputFieldWithSearchParametersOnHomePage(InputParametersForTests.hotelSearchParis);
        resultsSteps.goToResultsPagesFromHomePage();
    }

    @Test
    @DisplayName(value = "Test Case ES-10: Sorted hotels by price")
    @Link(value = "Test Case ES-10: Sorted hotels by price",
            url = "https://docs.google.com/document/d/1MSDmG5ouMj-DQEnc1fwAYcTxup2pyyXMOPYOfRAeWnQ/edit#heading=h.eh21vpkmpxeu")
    void sortedHotelsByPrice() {
        resultsSteps.selectSortByFilter();
        List<Hotel> actualList = resultsSteps.getHotelsListFromResultsPage();
        assertTrue(ComponentsForTest.isCheckSortingOfListByCost(actualList));
    }

    @Test
    @DisplayName(value = "Test Case ES-9: Sorted hotels by hotel class ")
    @Link (value = "Test Case ES-9: Sorted hotels by hotel class",
            url = "https://docs.google.com/document/d/1MSDmG5ouMj-DQEnc1fwAYcTxup2pyyXMOPYOfRAeWnQ/edit#heading=h.xnx5omqanyid")
    void sortedHotelsByHotelClass() {
        String classHotel = "4-stars";
        resultsSteps.selectionHotelClassFilter(classHotel);
        List<Hotel> actualList = resultsSteps.getHotelsListFromResultsPage();
        assertTrue(ComponentsForTest.isCheckSortingOfListByClass(actualList) &&
                ComponentsForTest.isCheckFirstItemFromListForHotelClass(actualList, classHotel));
    }
}
