import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.Data;
import java.util.List;

@Getter
@Setter
public class HotelSearch {
    private Location location;
    private Data arriveDate;
    private Data departureDate;
    private List<Guests> guests;


//    public Location getLocation() {
//        return location;
//    }
//
//    public void setLocation(Location location1) {
//        location = location1;
//    }
//
//    public Data getArriveDate() {
//        return arriveDate;
//    }
//
//    public void setArriveDate(Data arriveDate) {
//        this.arriveDate = arriveDate;
//    }
//
//    public Data getDepartureDate() {
//        return departureDate;
//    }
//
//    public void setDepartureDate(Data departureDate) {
//        this.departureDate = departureDate;
//    }
//
//    public List<Guests> getGuests() {
//        return rooms;
//    }

   public int countGuest() {
        int countGuest = 0;
        for (Guests room : guests) {
            countGuest += room.getGuests().size();
        }
        return countGuest;
    }
}
