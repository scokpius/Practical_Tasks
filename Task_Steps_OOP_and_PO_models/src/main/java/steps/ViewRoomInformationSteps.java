package steps;

import object.Hotel;
import object.HotelRoom;
import page.HotelInformationPage;
import page.RoomInformationPage;

public class ViewRoomInformationSteps {
    HotelInformationPage hotelInformationPage = new HotelInformationPage();
    RoomInformationPage roomInformationPage = new RoomInformationPage();
    HotelRoom hotelRoom;


    public HotelRoom viewRoomInformation(Hotel hotel){
        hotelInformationPage.waitForUpdateHotelInformationPage();
        for (int i = 0; i < hotelInformationPage.getListNameRooms().size(); i++) {
            if (hotel.getListRooms().get(i).getHotelRoomName().equals(hotelInformationPage.getListNameRooms().get(i).getText())){
                hotelInformationPage.selectRoom(i);
                break;
            }
        }
        roomInformationPage.waitForUpdateRoomInformationPage();
        return hotelRoom;
    }

}
