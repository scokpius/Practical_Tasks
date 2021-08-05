import java.util.Arrays;
import java.util.List;

public class Hotel {
    private String hotelName;
    private List<HotelRoom>[] listRooms;
    private List<String>[] photoHotel;
    private Location location;

    public List<String>[] getPhotoHotel() {
        return photoHotel;
    }

    public void setPhotoHotel(List<String>[] photoHotel) {
        this.photoHotel = Arrays.copyOf(photoHotel, photoHotel.length);
    }

    public List<HotelRoom>[] getListRooms() {
        return listRooms;
    }

    public void setListRooms(HotelRoom[] rooms) {
        for (int i = 0; i < listRooms.length; i++) {
            listRooms[i].add(rooms[i]);
        }
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
}
