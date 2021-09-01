package object;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Hotel {
    private String hotelName;
    private List<HotelRoom> listRooms;
    private List<String> photoHotel;
    private String location;

    public Hotel(String hotelName, List<HotelRoom> listRooms, List<String> photoHotel, String location) {
        this.hotelName = hotelName;
        this.listRooms = listRooms;
        this.photoHotel = photoHotel;
        this.location = location;
    }
}
