package steps;

import object.Hotel;
import object.HotelSearch;
import object.Price;
import page.HomePage;
import page.HotelsPage;
import page.ResultsSearchPage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static constant.URL.HOTWIRE;

public class ResultsToSearchingSteps {
    private static HomePage homePage = new HomePage();
    private HotelsPage hotelsPage = new HotelsPage();
    private ResultsSearchPage resultsSearchPage = new ResultsSearchPage();


    /**
     * The method fills in the hotel search parameters on the home page
     * @param hotelSearch input parameters
     */
    public void fillInputFieldWithSearchParametersOnHomePage(HotelSearch hotelSearch) {
        homePage.enterTheSite(HOTWIRE);
        homePage.chooseHotelsTabClick(hotelSearch.getLocation());
        homePage.getFunctionMenu().getFormFindHome().getInputLocation().setValue(hotelSearch.getLocation());
        homePage.getFunctionMenu().getFormFindHome().getDropdownLocation(hotelSearch.getLocation()).click();
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().chooseCheckInDate(hotelSearch.getArriveDate());
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().chooseCheckOutDate(hotelSearch.getDepartureDate());
        homePage.waitForPageLoaded();
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().chooseGuests(hotelSearch.getGuests().getRooms(),
                hotelSearch.getGuests().getAdults(), hotelSearch.getGuests().getChildren());
        homePage.waitForPageLoaded();
    }

    /**
     * The method navigates to the search results page
     */
    public void goToResultsPagesFromHomePage() {
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().clickButtonFindOfHotel();
        resultsSearchPage.waitForPageLoaded();
        resultsSearchPage.closeBlueToptill();
        resultsSearchPage.clickStandardRateHotels();
        resultsSearchPage.waitForPageLoaded();
    }

    /**
     * The method creates a list of hotels based on search results
     *
     * @return List<Hotel>
     */
    public List<Hotel> getHotelsListFromResultsPage() {
        List<Hotel> listHotels = new ArrayList<>();
        for (int i = 1; i < resultsSearchPage.getListCardHotel().size(); i++) {
            listHotels.add(Hotel.builder()
                    .hotelName(resultsSearchPage.getNameHotel(i).getText())
                    .classHotel(resultsSearchPage.getClassHotel(i).size())
                    .pricePerNight(Price.builder()
                            .code(resultsSearchPage.getCodePricePerNight(i).getText())
                            .sum(BigDecimal.valueOf(Double.parseDouble(
                                    resultsSearchPage.getSumPricePerNight(i).getText().replace("$", "")
                                            .replace(",", ""))))
                            .build())
                    .build());
        }
        return listHotels;
    }

    /**
     * The method compares the values in the input fields of search parameters
     * on the page of results and input parameters.
     *
     * @param hotelSearch input parameters
     * @return returns true if values match or false if the values do not match
     */
    public boolean isParametersOnResultsPageEqualsEnteredData(HotelSearch hotelSearch) {
        return resultsSearchPage.getTextFromLocationField().contains(hotelSearch.getLocation()) &&
                resultsSearchPage.getTextFromCheckInField().contains(hotelSearch.printLocalDate(hotelSearch.getArriveDate())) &&
                resultsSearchPage.getTextFromCheckOutField().contains(hotelSearch.printLocalDate(hotelSearch.getDepartureDate())) &&
                resultsSearchPage.getTextFromGuestsField().equals(hotelSearch.getGuests().toString());
    }

    /**
     * The method checks for the presence of the entered value of
     * the input field in the drop-down menu.
     *
     * @param location input parameters destination
     * @return returns true if values match or false if the values do not match
     */
    public boolean isCheckEnteredValueInDropdownMenu(String location) {
        homePage.enterTheSite(HOTWIRE);
        homePage.chooseHotelsTabClick(location);
        homePage.getFunctionMenu().getFormFindHome().cleanInputLocation();
        homePage.getFunctionMenu().getFormFindHome().getInputLocation().setValue(location);
        homePage.getFunctionMenu().getFormFindHome().waitDropdownElement();
        for (int i = 0; i < homePage.getFunctionMenu().getFormFindHome().getDropdownLocationText().size(); i++) {
            String text = homePage.getFunctionMenu().getFormFindHome().getDropdownLocationText().get(i).getText();
            if (!(text.toLowerCase().contains(location.toLowerCase()))) {
                return false;
            }
        }
        return true;
    }

    /**
     * The method fills in the hotel search parameters on the hotel page
     * @param hotelSearch input parameters
     */
    public void enterSearchParametersOnHotelPage(HotelSearch hotelSearch) {
        homePage.enterTheSite(HOTWIRE);
        homePage.goToHotelPage();
        hotelsPage.getFormFindHotel().clickButtonLocation();
        hotelsPage.getFormFindHotel().getInputLocation().setValue(hotelSearch.getLocation());
        hotelsPage.getFormFindHotel().getElementDropdownLocationClick();
        hotelsPage.waitForUpdateHotelPage();
        hotelsPage.getFormFindHotel().getSearchOptions().chooseCheckInDate(hotelSearch.getArriveDate());
        hotelsPage.getFormFindHotel().getSearchOptions().chooseCheckOutDate(hotelSearch.getDepartureDate());
        hotelsPage.waitForUpdateHotelPage();
        hotelsPage.getFormFindHotel().getSearchOptions().chooseGuests(hotelSearch.getGuests().getRooms(),
                hotelSearch.getGuests().getRooms(), hotelSearch.getGuests().getChildren());
    }

    /**
     * The method navigates to the search results page
     */
    public void goToResultsPagesFromHotelPage() {
        hotelsPage.getFormFindHotel().getSearchOptions().clickButtonFindOfHotel();
        resultsSearchPage.waitForPageLoaded();
        resultsSearchPage.closeBlueToptill();
        resultsSearchPage.clickStandardRateHotels();
    }

    /**
     * The method navigates to the search results page
     */
    public void selectSortByFilter() {
        resultsSearchPage.getFilterSortByButton().click();
        resultsSearchPage.getFilterSortByDropdown().get(1).click();
        resultsSearchPage.waitForPageLoaded();
    }

    /**
     * The method selects the hotel class from the drop-down menu
     */
    public void selectionHotelClassFilter(String classHotel) {
        resultsSearchPage.getFilterHotelClassButton().pressEnter();
        for (int i = 0; i < resultsSearchPage.getFilterHotelClassDropdown().size(); i++) {
            if (resultsSearchPage.getFilterHotelClassDropdownText().get(i).getText().equals(classHotel)) {
                resultsSearchPage.getFilterHotelClassDropdown().get(i).click();
                break;
            }
        }
        resultsSearchPage.waitForPageLoaded();
    }

    /**
     * The method fills in the hotel search parameters on the results page
     * @param location input parameters
     */
    public void enterSearchParametersOnResultsPage(String location) {
        resultsSearchPage.waitForPageLoaded();
        resultsSearchPage.getInputLocation().click();
        resultsSearchPage.cleanInputLocation();
        resultsSearchPage.getInputLocation().setValue(location);
        resultsSearchPage.getDropdownLocationClick(location).click();
        resultsSearchPage.getSearchOptions().clickButtonFindOfHotel();
        resultsSearchPage.waitForPageLoaded();
        resultsSearchPage.clickStandardRateHotels();
    }
    /**
     * The method navigates to the search hotel information page
     */
    public void goToHotelInformationPages(String hotelName) {
        resultsSearchPage.selectHotel(hotelName);
        resultsSearchPage.goToHotelInformationPage();
    }

}
