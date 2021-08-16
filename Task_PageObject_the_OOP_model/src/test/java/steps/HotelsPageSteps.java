package steps;

import page.HotelsPage;

public class HotelsPageSteps {
    HotelsPage hotelsPage = new HotelsPage();

    public void enterTheSite(String url){
        hotelsPage.goToHotelPage(url);

    }

    public void chooseInputLocation (String location){
        hotelsPage.getFormFindHotel().getInputLocation().setValue(location);
    }


    public void chooseCheckInDateCheckOutDate (String monthInDate, String dayInDate, String yerInDate,
                                               String monthOutDate, String dayOutDate, String yerOutDate){
        hotelsPage.getFormFindHotel().getSearchOptions().chooseCheckInDate(monthInDate, dayInDate, yerInDate);
        hotelsPage.getFormFindHotel().getSearchOptions().chooseCheckOutDate(monthOutDate,dayOutDate, yerOutDate);
    }

    public void chooseGuests (String numberRooms, String numberAdult, String numberChildren) {
        hotelsPage.getFormFindHotel().getSearchOptions().chooseGuests(numberRooms, numberAdult, numberChildren);
    }

    public void clickButtonFind(){
        hotelsPage.getFormFindHotel().getSearchOptions().clickButton();
    }
}