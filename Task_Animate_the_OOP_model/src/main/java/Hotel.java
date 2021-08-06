import java.util.Arrays;
import java.util.List;

public class Hotel {
    private String hotelName;
    private List<HotelRoom> listRooms;
    private List<String> photoHotel;
    private Location location;

    public List<String> getPhotoHotel() {
        return photoHotel;
    }

    public void setPhotoHotel(List<String> photoHotel) {
        this.photoHotel.addAll(photoHotel);
    }

    public List<HotelRoom> getListRooms() {
        return listRooms;
    }

    public void setListRooms(List<HotelRoom> rooms) {
        listRooms.addAll(rooms);
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
}
