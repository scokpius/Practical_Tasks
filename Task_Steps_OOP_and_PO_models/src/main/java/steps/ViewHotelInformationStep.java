package steps;

import io.qameta.allure.Step;
import object.HotelRoom;
import object.Price;
import page.HotelInformationPage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ViewHotelInformationStep {


    private HotelInformationPage hotelInformationPage = new HotelInformationPage();

    @Step("The method checks for the presence of the entered value of the input field in the drop-down menu.")
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

    public List<HotelRoom> getHotelRoomListFromHotelInformationPage() {
        List<HotelRoom> listHotelRoom = new ArrayList<>();

        for (int i = 1; i < hotelInformationPage.getListCardHotelRoom().size(); i++) {
            listHotelRoom.add(HotelRoom.builder()
                    .hotelRoomName(hotelInformationPage.getNameHotelRoom(i).getText())
                    .areaRoom(hotelInformationPage.getAreaHotelRoom(i).getText())
                    .numberOfPeopleSleep(hotelInformationPage.getNumberOfPeopleSleepHotelRoom(i).getText())
                    .price(Price.builder()
                            .sum(BigDecimal.valueOf(Double.parseDouble(
                                    hotelInformationPage.getPricePerNightHotelRoom(i).getText().replace("$", "")
                                            .replace(",", ""))))
                            .build())
                    .build());
        }
        return listHotelRoom;
    }

}
