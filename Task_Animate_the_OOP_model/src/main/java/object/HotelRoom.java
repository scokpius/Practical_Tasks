package object;

import lombok.*;

import java.math.BigDecimal;


@Data
@Builder
public class HotelRoom {
    private String hotelRoomName;
    private Price price;
    private String numberOfPeopleSleep;
    private String areaRoom;
    private String photoRoom;

    public BigDecimal calculateCostForNumberDays(int days) {
        return getPrice().getSum().multiply(BigDecimal.valueOf(days));
    }


}
