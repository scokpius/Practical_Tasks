import object.Hotel;
import org.junit.Before;
import org.junit.Test;
import steps.ResultsTofSearchingSteps;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class ChangeSearchQueryTest extends BaseTest{
    private ResultsTofSearchingSteps resultsTofSearchingSteps = new ResultsTofSearchingSteps();
    private List<Hotel> hotelsResultFirst;
    private List<Hotel> hotelsResultSecond;
    @Before
    public void createSearchQuery(){
        hotelsResultFirst = resultsTofSearchingSteps.resultsOfSearchingWithHomePage(InputParametersForTests.hotelSearchMinsk);
    }

    /**
     * Test Case ES-3: Change search query in ResultsPage
     * https://docs.google.com/document/d/1MSDmG5ouMj-DQEnc1fwAYcTxup2pyyXMOPYOfRAeWnQ/edit?usp=sharing
     */
    @Test
    public void changeSearchQueryInResultsPage(){
        hotelsResultSecond = resultsTofSearchingSteps.resultsOfSearchingWithResultsSearchPage(
                InputParametersForTests.hotelSearchLondon);
        assertTrue(ComponentsFoTest.compareTwoLists(hotelsResultFirst, hotelsResultSecond));
    }

}
