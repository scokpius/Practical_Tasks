package steps;

import page.HotelInformationPage;

public class ViewHotelInformationStep {


    HotelInformationPage hotelInformationPage = new HotelInformationPage();
//    List<HotelRoom> listHotelRoom = new ArrayList<>();
//    List<String> listPhotoRoom = new ArrayList<>();

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
