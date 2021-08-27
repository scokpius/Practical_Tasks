package steps;

import object.HotelSearch;
import page.HomePage;
import page.HotelsPage;
import page.ResultsSearchPage;

import static constant.URL.HOTWIRE;

public class GoToResultsSearchPageSteps {
    static HomePage homePage = new HomePage();
    HotelsPage hotelsPage = new HotelsPage();
    ResultsSearchPage resultsSearchPage = new ResultsSearchPage();


    public ResultsSearchPage goToResultsSearchPageWithHomePage(HotelSearch hotelSearch) {
        homePage.enterTheSite(HOTWIRE);
        homePage.chooseHotelsTabClick(hotelSearch.getLocation().getTownName());
        homePage.getFunctionMenu().getFormFindHome().getInputLocation().setValue(hotelSearch.getLocation().getTownName()).pressEnter();
        homePage.waitForPageLoaded();
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().chooseCheckInDate(hotelSearch.getArriveDate());
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().chooseCheckOutDate(hotelSearch.getDepartureDate());
        homePage.waitForPageLoaded();
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().chooseGuests(hotelSearch.getRooms(),
                hotelSearch.getRooms(), hotelSearch.getChildren());
        homePage.waitForPageLoaded();
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().clickButtonFindOfHotel();
        return new ResultsSearchPage();
    }

    public ResultsSearchPage goToResultsSearchPageWithResultsSearchPage (HotelSearch hotelSearch) {
        homePage.enterTheSite(HOTWIRE);
        homePage.goToHotelPage();
        hotelsPage.getFormFindHotel().getInputLocation().setValue(hotelSearch.getLocation().getTownName()).pressEnter();
        hotelsPage.waitForUpdateHotelPage();
        hotelsPage.getFormFindHotel().getSearchOptions().chooseCheckInDate(hotelSearch.getArriveDate());
        hotelsPage.getFormFindHotel().getSearchOptions().chooseCheckOutDate(hotelSearch.getDepartureDate());
        hotelsPage.waitForUpdateHotelPage();
        hotelsPage.getFormFindHotel().getSearchOptions().chooseGuests(hotelSearch.getRooms(),
                hotelSearch.getRooms(), hotelSearch.getChildren());
        hotelsPage.getFormFindHotel().getSearchOptions().clickButtonFindOfHotel();
        resultsSearchPage.waitForPageLoaded();
        resultsSearchPage.clickStandardRateHotels();
        return new ResultsSearchPage();
    }
}
