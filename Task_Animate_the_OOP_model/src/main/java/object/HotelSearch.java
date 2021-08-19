package object;

import javax.xml.crypto.Data;
import java.util.List;

public class HotelSearch {
    private Location location;
    private Data arriveDate;
    private Data departureDate;
    private List<Room> rooms;


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location1) {
        location = location1;
    }

    public Data getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Data arriveDate) {
        this.arriveDate = arriveDate;
    }

    public Data getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Data departureDate) {
        this.departureDate = departureDate;
    }

    public List<Room> getRooms() {
        return rooms;
    }

   public int countGuest() {
        int countGuest = 0;
        for (Room room : rooms) {
            countGuest += room.getGuests().size();
        }
        return countGuest;
    }
}
