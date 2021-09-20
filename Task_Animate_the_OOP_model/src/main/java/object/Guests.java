package object;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class Guests {

    private List<Guest> guests;
    public Guests() {
        this.guests = new ArrayList<>(10);
    }

    public List<Guest> addGuest(Guest guest) {
        this.guests.add(guest);
        return this.guests;
    }
}
