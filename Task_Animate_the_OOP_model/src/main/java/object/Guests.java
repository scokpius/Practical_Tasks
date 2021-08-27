package object;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Setter
@Getter
public class Guests {

    private List<Guest> guests;
    public Guests() {
        this.guests = new ArrayList<>(10);
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public List<Guest> addGuest(Guest guest) {
        this.guests.add(guest);
        return this.guests;
    }
}
