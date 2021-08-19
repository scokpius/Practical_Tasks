package steps;

import object.Hotel;
import object.HotelSearch;
import object.Room;
import page.HomePage;
import page.ResultsSearchPage;

import javax.xml.crypto.Data;
import java.util.List;

import static constant.URL.HOTWIRE;


public class SearchStep {

    HomePage homePage = new HomePage();
    ResultsSearchPage resultsSearchPage = new ResultsSearchPage();
    List<Hotel> hotelList;


    public List<Hotel> findHotels(HotelSearch hotelSearch) {
        homePage.enterTheSite(HOTWIRE);
        homePage.getFunctionMenu().functionMenuNavigation("Hotels");
        homePage.getFunctionMenu().getFormFindHome().getInputLocation().setValue(hotelSearch.getLocation().getTownName()).pressEnter() ;
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().clickButton();
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().chooseCheckInDate(getDate(hotelSearch.getArriveDate()).get(0),getDate(hotelSearch.getArriveDate()).get(1),getDate(hotelSearch.getArriveDate()).get(2));
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().chooseCheckOutDate(getDate(hotelSearch.getDepartureDate()).get(0),getDate(hotelSearch.getDepartureDate()).get(1),getDate(hotelSearch.getDepartureDate()).get(2));
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().chooseGuests(countRooms(hotelSearch.getRooms()), countAdults(hotelSearch.getRooms()), countChildren(hotelSearch.getRooms()));
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().clickButton();
        resultsSearchPage.clickStandardRateHotels();
        for (int i = 0; i < resultsSearchPage.getList().size(); i++) {
            hotelList.get(i).setHotelName(resultsSearchPage.getList().get(i).getText());
        }
        return hotelList;
    }




    public List<String> getDate(Data date) {
        List<String> dates = null;
        // заложить логику
        return dates;
    }


    public String countRooms(List<Room> rooms) {
        // заложить логику
        return "1";
    }

    public String countAdults(List<Room> rooms) {
        // заложить логику
        return "2";
    }
    public String countChildren(List<Room> rooms) {
        // заложить логику
        return "2";
    }






}



//    public void chooseCheckInDateCheckOutDate (String monthInDate, String dayInDate, String yerInDate,
//                                               String monthOutDate, String dayOutDate, String yerOutDate){
//        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().chooseCheckInDate(monthInDate, dayInDate, yerInDate);
//        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().chooseCheckOutDate(monthOutDate,dayOutDate, yerOutDate);
//    }
//
//    public void chooseGuests (String numberRooms, String numberAdult, String numberChildren) {
//        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().chooseGuests(numberRooms, numberAdult, numberChildren);
//    }
//
//    public void clickButtonFind(){
//       homePage.getFunctionMenu().getFormFindHome().getSearchOptions().clickButton();
//    }