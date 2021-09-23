package steps;

import object.Hotel;
import object.HotelRoom;
import page.HotelInformationPage;
import page.RoomInformationPage;

public class ViewRoomInformationSteps {
    HotelInformationPage hotelInformationPage = new HotelInformationPage();
    RoomInformationPage roomInformationPage = new RoomInformationPage();

    /**
     * This method searches for the selected room from the list of available rooms
     * in the selected hotel and goes to the page to view information about it.
     * @param hotel information about hotel
     * @return returns information about the selected room
     */
    public HotelRoom viewRoomInformation(Hotel hotel, String roomName){

        for (int i = 0; i < hotel.getListRooms().size(); i++) {
            if (roomName.equals(hotel.getListRooms().get(i).getHotelRoomName())){
                hotelInformationPage.selectRoom(i);
                break;
            }
        }
        roomInformationPage.waitForUpdateRoomInformationPage();
        return HotelRoom.builder()
                .hotelRoomName(roomInformationPage.getFielderNameRoom().getText())
                .areaRoom(roomInformationPage.getSpanArea().getText())
                .build();
    }

}
