package object;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private List<Guest> guests;

    public Room() {
        this.guests = new ArrayList<>(10);
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests.addAll(guests);
    }

    public List<Guest> addGuest(Guest guest) {
        this.guests.add(guest);
        return this.guests;
    }


}
