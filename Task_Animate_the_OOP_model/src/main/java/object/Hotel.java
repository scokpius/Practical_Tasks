package object;

import java.util.List;


public class Hotel {
    private final String hotelName;
    private List<HotelRoom> listRooms;
    private final List<String> photoHotel;
    private final Location location;

    public Hotel(String hotelName, List<HotelRoom> listRooms, List<String> photoHotel, Location location) {
        this.hotelName = hotelName;
        this.listRooms = listRooms;
        this.photoHotel = photoHotel;
        this.location = location;
    }

    public List<String> getPhotoHotel() {
        return photoHotel;
    }

    public List<HotelRoom> getListRooms() {
        return listRooms;
    }

    public void setListRooms(List<HotelRoom> rooms) {
        this.listRooms = rooms;
    }

    public String getHotelName() {
        return hotelName;
    }
    public String setHotelName(String text) {
        return hotelName;
    }
}
