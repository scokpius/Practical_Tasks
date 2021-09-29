package object;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Hotel {
    private String hotelName;
    private List<HotelRoom> listRooms;
    private List<String> photoHotel;
    private String location;
    private String hotelLink;
    private int classHotel;

}
