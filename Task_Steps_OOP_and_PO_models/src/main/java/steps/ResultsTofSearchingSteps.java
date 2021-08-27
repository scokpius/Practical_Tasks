package steps;

import object.Hotel;
import object.HotelSearch;
import page.HomePage;
import page.HotelsPage;
import page.ResultsSearchPage;

import java.util.ArrayList;
import java.util.List;

import static constant.URL.HOTWIRE;

public class ResultsTofSearchingSteps {
    static HomePage homePage = new HomePage();
    HotelsPage hotelsPage = new HotelsPage();
    ResultsSearchPage resultsSearchPage = new ResultsSearchPage();
    List<Hotel> hotelsList = new ArrayList<>(10);

    public List<Hotel> resultsOfSearchingWithHomePage(HotelSearch hotelSearch) {
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
        resultsSearchPage.waitForPageLoaded();
        resultsSearchPage.clickStandardRateHotels();
        for (int i = 0; i < resultsSearchPage.getListNameHotel().size(); i++) {
            hotelsList.get(i).setHotelName(resultsSearchPage.getListNameHotel().get(i).getText());
        }
        return hotelsList;
    }

    public List<Hotel> resultsOfSearchingWithResultsSearchPage (HotelSearch hotelSearch) {
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
        for (int i = 0; i < resultsSearchPage.getListNameHotel().size(); i++) {
            hotelsList.get(i).setHotelName(resultsSearchPage.getListNameHotel().get(i).getText());
        }
        return hotelsList;
    }

    public List<Hotel> changeOfSearchingOnHotelsPage(HotelSearch hotelSearch) {
        resultsSearchPage.waitForPageLoaded();
        resultsSearchPage.getInputLocation().setValue(hotelSearch.getLocation().getTownName()).pressEnter();
        resultsSearchPage.getSearchOptions().chooseCheckInDate(hotelSearch.getArriveDate());
        resultsSearchPage.getSearchOptions().chooseCheckOutDate(hotelSearch.getDepartureDate());
        resultsSearchPage.getSearchOptions().chooseGuests(hotelSearch.getRooms(),
                hotelSearch.getRooms(), hotelSearch.getChildren());
        resultsSearchPage.getSearchOptions().clickButtonFindOfHotel();
        resultsSearchPage.clickStandardRateHotels();
        resultsSearchPage.waitForPageLoaded();
        for (int i = 0; i < resultsSearchPage.getListNameHotel().size(); i++) {
            hotelsList.get(i).setHotelName(resultsSearchPage.getListNameHotel().get(i).getText());
        }
        return hotelsList;
    }

}
