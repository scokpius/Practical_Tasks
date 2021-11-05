package steps;

import object.HotelRoom;
import object.Price;
import page.RoomInformationPage;

import java.math.BigDecimal;

public class ViewRoomInformationSteps {
    RoomInformationPage roomInformationPage = new RoomInformationPage();

    public HotelRoom getInformationRoomFromRoomInformationPage(){
        return HotelRoom.builder()
                .hotelRoomName(roomInformationPage.getFielderNameRoom().getText())
                .photoRoom(roomInformationPage.getImgPhoto().getAttribute("src"))
                .areaRoom(roomInformationPage.getSpanArea().getText())
                .numberOfPeopleSleep(roomInformationPage.getSpanSleepers().getText())
                .price(Price.builder()
                        .code(roomInformationPage.getSpanPricePerNight().getText())
                        .sum(BigDecimal.valueOf(Double.parseDouble(roomInformationPage.getSpanPricePerNight().getText()
                                .replace("$", ""))))
                        .build())
                .build();
    }
    public BigDecimal getTotalPrice(){
        return BigDecimal.valueOf(Double.parseDouble(roomInformationPage.getSpanPrice().getText().replace("$", "")
                .replace(",", "")));
    }
}
