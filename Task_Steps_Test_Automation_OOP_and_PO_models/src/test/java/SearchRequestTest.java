
import org.junit.Test;
import steps.ResultsTofSearchingSteps;

import static org.junit.Assert.assertTrue;

public class SearchRequestTest extends BaseTest{
    private ResultsTofSearchingSteps resultsTofSearchingSteps = new ResultsTofSearchingSteps();

    /**
     * Test Case ES-1: Creating a search query at HomePage
     * https://docs.google.com/document/d/1MSDmG5ouMj-DQEnc1fwAYcTxup2pyyXMOPYOfRAeWnQ/edit?usp=sharing
     */
    @Test
    public void createSearchQueryAtHomePage(){
        assertTrue(resultsTofSearchingSteps.resultsOfSearchingWithHomePage(
                InputParametersForTests.hotelSearchParis).size()>0);
    }

    /**
     * Test Case ES-11: Check the dropdown menu for input information
     * https://docs.google.com/document/d/1MSDmG5ouMj-DQEnc1fwAYcTxup2pyyXMOPYOfRAeWnQ/edit?usp=sharing
     */
    @Test
    public void checkTheDropdownMenuForInputInformation(){
        assertTrue(resultsTofSearchingSteps.resultOfSearching(InputParametersForTests.hotelSearchPar)==true);

    }

    /**
     * Test Case ES-2: Creating a search query at HotelsPage
     * https://docs.google.com/document/d/1MSDmG5ouMj-DQEnc1fwAYcTxup2pyyXMOPYOfRAeWnQ/edit?usp=sharing
     */
    @Test
    public void creatingSearchQueryAtHotelsPage(){
        assertTrue(resultsTofSearchingSteps.resultsOfSearchingWithResultsSearchPage(
                InputParametersForTests.hotelSearchParis).size()>0);
    }

}
