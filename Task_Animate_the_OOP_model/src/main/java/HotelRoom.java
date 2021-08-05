import java.util.Arrays;

public class HotelRoom {
    private String hotelRoomName;
    private Price price;
    private int numberOfPeopleSleep;
    private int areaRoom;
    private String[] photoRoom;

    public HotelRoom(String roomName, Price priceIn, int numberOfPeopleSleep, int areaRoom, String[] photoRoom) {
        this.hotelRoomName = roomName;
        this.price = priceIn;
        this.numberOfPeopleSleep = numberOfPeopleSleep;
        this.areaRoom = areaRoom;
        this.photoRoom = Arrays.copyOf(photoRoom, photoRoom.length);
    }

    public String getHotelRoomName() {
        return hotelRoomName;
    }

    public void setHotelRoomName(String hotelRoomName) {
        this.hotelRoomName = hotelRoomName;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price priceIn) {
        this.price = priceIn;
    }

    public int getNumberOfPeopleSleep() {
        return numberOfPeopleSleep;
    }

    public void setNumberOfPeopleSleep(int numberOfPeopleSleep) {
        this.numberOfPeopleSleep = numberOfPeopleSleep;
    }

    public int getAreaRoom() {
        return areaRoom;
    }

    public void setAreaRoom(int areaRoom) {
        this.areaRoom = areaRoom;
    }


    public String[] getPhotoRoom() {
        return photoRoom;
    }

    public void setPhotoRoom(String[] photoRoom) {
        this.photoRoom = Arrays.copyOf(photoRoom, photoRoom.length);
    }

    public double calculateCostForNumberDays(int days) {
        return getPrice().getSum() * days;
    }
}
