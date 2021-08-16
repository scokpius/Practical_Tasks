package steps;

import page.HotelInformationPage;

public class HotelInformationSteps {
    public HotelInformationPage hotelInformationPage = new HotelInformationPage();


    public void getHotelName() {
        hotelInformationPage.getNameHotel();
    }

    public void getLocation() {
        hotelInformationPage.getLocation();
    }

    public void getIsPhotos() {
        hotelInformationPage.getIsPhotos();
    }

    public void chooseInDateAddOutDay(String monthInDate, String dayInDate, String yerInDate,
                                      String monthOutDate, String dayOutDate, String yerOutDate) {
        hotelInformationPage.getCheckIn(monthInDate, dayInDate, yerInDate);
        hotelInformationPage.getCheckOut(monthOutDate, dayOutDate, yerOutDate);
    }

    public void chooseGuests(String numberRooms, String numberAdult, String numberChildren) {
        hotelInformationPage.getGuests(numberRooms, numberAdult, numberChildren);

    }

    public void clickCheckRates() {
        hotelInformationPage.clickButtonRates();
    }

}