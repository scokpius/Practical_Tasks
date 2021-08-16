package steps;

import page.HotelInformationPage;
import page.ResultsSearchPage;

public class ResultsSearchSteps {
    ResultsSearchPage resultsSearchPage = new ResultsSearchPage();

    public void viewHotelSearchResult(){
        resultsSearchPage.clickStandardRateHotels();
        resultsSearchPage.getList();
    }

    public HotelInformationPage chooseHotel (int number){
         return  resultsSearchPage.chooseHotelInformation(number);
    }
}
