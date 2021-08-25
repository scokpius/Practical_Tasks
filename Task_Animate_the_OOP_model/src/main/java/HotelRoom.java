import java.math.BigDecimal;
import java.util.List;

public class HotelRoom {
    private final String hotelRoomName;
    private final Price price;
    private final int numberOfPeopleSleep;
    private final int areaRoom;
    private final List<String> photoRoom;


    public HotelRoom(String roomName, Price priceIn, int numberOfPeopleSleep, int areaRoom, List<String> photo) {
        this.hotelRoomName = roomName;
        this.price = priceIn;
        this.numberOfPeopleSleep = numberOfPeopleSleep;
        this.areaRoom = areaRoom;
        this.photoRoom = photo;
    }

    public Price getPrice() {
        return price;
    }
//
//    public String getHotelRoomName() {
//        return hotelRoomName;
//    }
//
//    public int getNumberOfPeopleSleep() {
//        return numberOfPeopleSleep;
//    }
//
//    public int getAreaRoom() {
//        return areaRoom;
//    }
//
//
//    public List<String> getPhotoRoom() {
//        return photoRoom;
//    }

    public BigDecimal calculateCostForNumberDays(int days) {
        return getPrice().getSum().multiply(BigDecimal.valueOf(days));
    }
}
