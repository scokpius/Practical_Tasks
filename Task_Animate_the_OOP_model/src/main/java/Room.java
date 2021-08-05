import java.util.ArrayList;
import java.util.Arrays;
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
        for (int i = 0; i < guests.size(); i++) {
            if (guests.get(i) == null) {
                guests.add(guest);
            }
        }
        return this.guests;
    }
}
