package object;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class HotelRoom {
    private String hotelRoomName;
    private Price price;
    private String numberOfPeopleSleep;
    private String areaRoom;
    private String photoRoom;
}
