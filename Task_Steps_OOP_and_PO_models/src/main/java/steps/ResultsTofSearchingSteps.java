package steps;

import object.Hotel;
import object.HotelSearch;
import page.HomePage;
import page.HotelsPage;
import page.ResultsSearchPage;

import java.util.List;
import java.util.stream.Collectors;

import static constant.URL.HOTWIRE;

public class ResultsTofSearchingSteps {
    static HomePage homePage = new HomePage();
    HotelsPage hotelsPage = new HotelsPage();
    ResultsSearchPage resultsSearchPage = new ResultsSearchPage();

    public List<Hotel> resultsOfSearchingWithHomePage(HotelSearch hotelSearch) {
        homePage.enterTheSite(HOTWIRE);
        homePage.chooseHotelsTabClick(hotelSearch.getLocation().getTownName());
        homePage.getFunctionMenu().getFormFindHome().getInputLocation().setValue(hotelSearch.getLocation().getTownName());
        homePage.getFunctionMenu().getFormFindHome().getDropdownLocationClick(hotelSearch.getLocation().getTownName()).click();
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().chooseCheckInDate(hotelSearch.getArriveDate());
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().chooseCheckOutDate(hotelSearch.getDepartureDate());
        homePage.waitForPageLoaded();
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().chooseGuests(hotelSearch.getRooms(),
                hotelSearch.getAdults(), hotelSearch.getChildren());
        homePage.waitForPageLoaded();
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().clickButtonFindOfHotel();
        resultsSearchPage.waitForPageLoaded();
        resultsSearchPage.clickStandardRateHotels();
        return resultsSearchPage.getListNameHotel()
                .stream()
                .map(selenideElement -> Hotel.builder().hotelName(selenideElement.getText()).build())
                .collect(Collectors.toList());
    }

    public List<Hotel> resultsOfSearchingWithResultsSearchPage (HotelSearch hotelSearch) {
        homePage.enterTheSite(HOTWIRE);
        homePage.goToHotelPage();
        hotelsPage.getFormFindHotel().clickButtonLocation();
        hotelsPage.getFormFindHotel().getInputLocation().setValue(hotelSearch.getLocation().getTownName());
        hotelsPage.getFormFindHotel().getDropdownLocationClick(hotelSearch.getLocation().getTownName()).click();
        hotelsPage.waitForUpdateHotelPage();
        hotelsPage.getFormFindHotel().getSearchOptions().chooseCheckInDate(hotelSearch.getArriveDate());
        hotelsPage.getFormFindHotel().getSearchOptions().chooseCheckOutDate(hotelSearch.getDepartureDate());
        hotelsPage.waitForUpdateHotelPage();
        hotelsPage.getFormFindHotel().getSearchOptions().chooseGuests(hotelSearch.getRooms(),
                hotelSearch.getRooms(), hotelSearch.getChildren());
        hotelsPage.getFormFindHotel().getSearchOptions().clickButtonFindOfHotel();
        resultsSearchPage.waitForPageLoaded();
        resultsSearchPage.clickStandardRateHotels();
        return resultsSearchPage.getListNameHotel()
                .stream()
                .map(selenideElement -> Hotel.builder().hotelName(selenideElement.getText())
                                                       .hotelLink(selenideElement.getAttribute("href")).build())
                .collect(Collectors.toList());
    }

    public List<Hotel> changeOfSearchingOnHotelsPage(HotelSearch hotelSearch) {
        resultsSearchPage.waitForPageLoaded();
        resultsSearchPage.getInputLocation().setValue(hotelSearch.getLocation().getTownName());
        resultsSearchPage.getDropdownLocationClick(hotelSearch.getLocation().getTownName()).click();
        resultsSearchPage.getSearchOptions().chooseCheckInDate(hotelSearch.getArriveDate());
        resultsSearchPage.getSearchOptions().chooseCheckOutDate(hotelSearch.getDepartureDate());
        resultsSearchPage.getSearchOptions().chooseGuests(hotelSearch.getRooms(),
                hotelSearch.getRooms(), hotelSearch.getChildren());
        resultsSearchPage.getSearchOptions().clickButtonFindOfHotel();
        resultsSearchPage.clickStandardRateHotels();
        resultsSearchPage.waitForPageLoaded();
        return resultsSearchPage.getListNameHotel()
                .stream()
                .map(selenideElement -> Hotel.builder().hotelName(selenideElement.getText())
                                                       .hotelLink(selenideElement.getAttribute("href")).build())
                .collect(Collectors.toList());
    }

    public boolean resultOfSearching(HotelSearch hotelSearch) {
        boolean verify = true;
        homePage.enterTheSite(HOTWIRE);
        homePage.chooseHotelsTabClick(hotelSearch.getLocation().getTownName());
        homePage.getFunctionMenu().getFormFindHome().getInputLocation().setValue(hotelSearch.getLocation().getTownName());
        for (int i = 0; i < homePage.getFunctionMenu().getFormFindHome().getDropdownLocationText().size(); i++) {
           if (!homePage.getFunctionMenu().getFormFindHome().getDropdownLocation().get(i).getText().equals(hotelSearch.getLocation().getTownName())) {
               verify = false;
            }
        }
        return verify;
    }
}
