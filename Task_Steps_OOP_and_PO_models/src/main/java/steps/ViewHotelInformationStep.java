package steps;

import object.Hotel;
import object.HotelRoom;
import page.HotelInformationPage;
import page.ResultsSearchPage;

import java.util.ArrayList;
import java.util.List;

public class ViewHotelInformationStep {

    private ResultsSearchPage resultsSearchPage = new ResultsSearchPage();
    private HotelInformationPage hotelInformationPage = new HotelInformationPage();
    private List<HotelRoom> listHotelRoom = new ArrayList<>();;
    private List<String> listPhotoHotel;

    /**
     * This method searches for the selected hotel from the list of available hotels
     * and goes to the page to view information about it.
     * @param hotelName name of hotels for choose one
     * @return returns information about the selected hotel
     */
    public Hotel viewHotelInformation(String hotelName){
        for (int i = 0; i < resultsSearchPage.getListLinkHotel().size(); i++) {
            if (hotelName.equals(resultsSearchPage.getListLinkHotel().get(i).getText())){
                resultsSearchPage.getListLinkHotel().get(i).click();
                break;
            }
        }
        hotelInformationPage.waitForUpdateHotelInformationPage();
        hotelInformationPage.getButtonRooms().click();
        for (int i = 0; i < hotelInformationPage.getListNameRooms().size(); i++) {
            listHotelRoom.add(i,
                    HotelRoom.builder()
                    .hotelRoomName(hotelInformationPage.getListNameRooms().get(i).getText())
                    .build());

        }
        listPhotoHotel = new ArrayList<>();
        for (int i = 0; i < hotelInformationPage.getImgListPhotos().size(); i++) {
            System.out.println(hotelInformationPage.getImgListPhotos().get(i).getAttribute("scr"));
            listPhotoHotel.add(i, hotelInformationPage.getImgListPhotos().get(i).getAttribute("scr"));
        }
        return Hotel.builder()
                .hotelName(hotelInformationPage.getFieldNameHotel().getText())
                .listRooms(listHotelRoom)
                .photoHotel(listPhotoHotel)
                .build();
    }
}
