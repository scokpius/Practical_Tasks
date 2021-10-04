import object.Hotel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.ResultsToSearchingSteps;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilterTest extends BaseTest {

    private ResultsToSearchingSteps resultsSteps = new ResultsToSearchingSteps();

    @BeforeEach
    public void createSearchQuery() {
        resultsSteps.fillInputFieldWithSearchParametersOnHomePage(InputParametersForTests.hotelSearchParis);
        resultsSteps.goToResultsPagesFromHomePage();
    }

    /**
     * Test Case ES-10: Sorted hotels by price
     * https://docs.google.com/document/d/1MSDmG5ouMj-DQEnc1fwAYcTxup2pyyXMOPYOfRAeWnQ/edit?usp=sharing
     */
    @Test
    @DisplayName(value = "Test Case ES-10: Sorted hotels by price")
    void sortedHotelsByPrice() {
        resultsSteps.selectSortByFilter();
        List<Hotel> actualList = resultsSteps.getHotelsListFromResultsPage();

        assertTrue(ComponentsForTest.isCheckSortingOfListByCost(actualList));
    }

    /**
     * Test Case ES-9: Sorted hotels by hotel class
     * https://docs.google.com/document/d/1MSDmG5ouMj-DQEnc1fwAYcTxup2pyyXMOPYOfRAeWnQ/edit?usp=sharing
     */
    @Test
    @DisplayName(value = "Test Case ES-9: Sorted hotels by hotel class ")
    void sortedHotelsByHotelClass() {
        String classHotel = "4-stars";
        resultsSteps.selectionHotelClassFilter(classHotel);
        List<Hotel> actualList = resultsSteps.getHotelsListFromResultsPage();

        assertTrue(ComponentsForTest.isCheckSortingOfListByClass(actualList) &&
                ComponentsForTest.isCheckClassHotel(actualList, classHotel));
    }
}
