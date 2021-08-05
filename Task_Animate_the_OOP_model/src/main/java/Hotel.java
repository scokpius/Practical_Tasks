import java.util.Arrays;

public class Hotel {
    private String hotelName;
    private HotelRoom[] listRooms;
    private String[] photoHotel;
    private Location location;

    public String[] getPhotoHotel() {
        return photoHotel;
    }

    public void setPhotoHotel(String[] photoHotel) {
        this.photoHotel = Arrays.copyOf(photoHotel, photoHotel.length);
    }

    public HotelRoom[] getListRooms() {
        return listRooms;
    }

    public void setListRooms(HotelRoom[] rooms) {
        for (int i = 0; i < listRooms.length; i++) {
            listRooms[i] = rooms[i];
        }
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }


}
