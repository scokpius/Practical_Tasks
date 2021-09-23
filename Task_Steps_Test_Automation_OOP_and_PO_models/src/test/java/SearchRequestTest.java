
import object.HotelSearch;
import object.Location;
import org.junit.Test;
import steps.ResultsTofSearchingSteps;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class SearchRequestTest extends BaseTest{
    private ResultsTofSearchingSteps resultsTofSearchingSteps = new ResultsTofSearchingSteps();
    private HotelSearch hotelSearchParis;

    @Test
    public void createSearchQueryAtHomePage(){
        hotelSearchParis = HotelSearch.builder()
                .location(Location.builder().townName("Paris").build())
                .arriveDate(LocalDate.of(2021, 9, 27))
                .departureDate(LocalDate.of(2021, 10, 4))
                .rooms("1")
                .adults("4")
                .children("0")
                .build();
        assertTrue(resultsTofSearchingSteps.resultsOfSearchingWithHomePage(hotelSearchParis).size()>0);
    }

    @Test
    public void checkTheDropdownMenuForInputInformation(){
        hotelSearchParis = HotelSearch.builder()
                .location(Location.builder().townName("Par").build())
                .build();
        assertTrue(resultsTofSearchingSteps.resultOfSearching(hotelSearchParis)==true);

    }

}
