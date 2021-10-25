package steps;

import page.HotelInformationPage;

public class ViewHotelInformationStep {


    private HotelInformationPage hotelInformationPage = new HotelInformationPage();


    public String getHotelNameFromHotelInformationPage(){
        hotelInformationPage.waitForUpdateHotelInformationPage();
        return hotelInformationPage.getFieldNameHotel().getText();
    }

    public String getHotelLocationFromHotelInformationPage(){
        hotelInformationPage.waitForUpdateHotelInformationPage();
        hotelInformationPage.clickLocationTab();
        return hotelInformationPage.getFieldLocation().getText();
    }

    public void goToRoomInformationPages(String roomName) {
        hotelInformationPage.waitForUpdateHotelInformationPage();
        hotelInformationPage.clickRoomTab();
        hotelInformationPage.selectRoom(roomName);
        hotelInformationPage.goToRoomInformationPage();
    }

}
