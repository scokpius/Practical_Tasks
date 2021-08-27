package steps;

import object.Hotel;
import object.HotelRoom;
import page.HotelInformationPage;
import page.ResultsSearchPage;

import java.util.ArrayList;
import java.util.List;

public class ViewHotelInformationStep {

    ResultsSearchPage resultsSearchPage = new ResultsSearchPage();
    HotelInformationPage hotelInformationPage = new HotelInformationPage();
    Hotel hotel;
    List<HotelRoom> listHotelRoom = new ArrayList<>();
    List<String> listPhotoRoom = new ArrayList<>();

    public Hotel viewHotelInformation(List<Hotel> listHotel){
        for (int i = 0; i < resultsSearchPage.getListNameHotel().size(); i++) {
            if (listHotel.get(i).getHotelName().equals(resultsSearchPage.getListNameHotel().get(i).getText())){
                resultsSearchPage.getListLinkHotel().get(i).click();
                break;
            }
        }
        hotelInformationPage.waitForUpdateHotelInformationPage();
        listHotelRoom = new ArrayList<>(hotelInformationPage.getListNameRooms().size());
        for (int i = 0; i < listHotelRoom.size(); i++) {
            listHotelRoom.get(i).setHotelRoomName(hotelInformationPage.getListNameRooms().get(i).getText());
        }
        listPhotoRoom = new ArrayList<>(hotelInformationPage.getImgListPhotos().size());
        for (int i = 0; i < listHotelRoom.size(); i++) {
            listPhotoRoom.set(i, hotelInformationPage.getImgListPhotos().get(i).getAttribute("scr"));
        }
        hotel = new Hotel(hotelInformationPage.getFieldNameHotel().getText(),listHotelRoom, listPhotoRoom,
                hotelInformationPage.getInputLocation().getText());
        return hotel;
    }
}
