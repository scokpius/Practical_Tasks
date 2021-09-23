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
    List<HotelRoom> listHotelRoom = new ArrayList<>();
    List<String> listPhotoHotel= new ArrayList<>();

    /**
     * This method searches for the selected hotel from the list of available hotels
     * and goes to the page to view information about it.
     * @param listHotel list of hotels to choose one
     * @return returns information about the selected hotel
     */
    public Hotel viewHotelInformation(List<Hotel> listHotel, String hotelName){
        for (int i = 0; i < listHotel.size(); i++) {
            if (hotelName.equals(listHotel.get(i).getHotelName())){
                resultsSearchPage.getListLinkHotel().get(i).click();
                break;
            }
        }
        hotelInformationPage.waitForUpdateHotelInformationPage();
        listHotelRoom = new ArrayList<>(hotelInformationPage.getListNameRooms().size());
        for (int i = 0; i < listHotelRoom.size(); i++) {
            listHotelRoom.get(i).setHotelRoomName(hotelInformationPage.getListNameRooms().get(i).getText());
        }
        listPhotoHotel = new ArrayList<>(hotelInformationPage.getImgListPhotos().size());
        for (int i = 0; i < listHotelRoom.size(); i++) {
            listPhotoHotel.set(i, hotelInformationPage.getImgListPhotos().get(i).getAttribute("scr"));
        }
        return Hotel.builder()
                .hotelName(hotelInformationPage.getFieldNameHotel().getText())
                .listRooms(listHotelRoom)
                .photoHotel(listPhotoHotel)
                .build();
    }
}
