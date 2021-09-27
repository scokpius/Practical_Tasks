package steps;

import object.HotelRoom;
import page.HotelInformationPage;
import page.RoomInformationPage;

public class ViewRoomInformationSteps {
    private HotelInformationPage hotelInformationPage = new HotelInformationPage();
    private RoomInformationPage roomInformationPage = new RoomInformationPage();

    /**
     * This method searches for the selected room from the list of available rooms
     * in the selected hotel and goes to the page to view information about it.
     * @param roomName name of rooms for choose one
     * @return returns information about the selected room
     */
    public HotelRoom viewRoomInformation(String roomName){

        for (int i = 0; i < hotelInformationPage.getListNameRooms().size(); i++) {
            if (roomName.equals(hotelInformationPage.getListNameRooms().get(i).getText())){
                hotelInformationPage.selectRoom(i);
                break;
            }
        }
        roomInformationPage.waitForUpdateRoomInformationPage();

        return HotelRoom.builder()
                .hotelRoomName(roomInformationPage.getFielderNameRoom().getText())
                .photoRoom(roomInformationPage.getImgPhoto().getAttribute("src"))
                .areaRoom(roomInformationPage.getSpanArea().getText())
                .numberOfPeopleSleep(roomInformationPage.getSpanSleepers().getText())
                .build();
    }

}
