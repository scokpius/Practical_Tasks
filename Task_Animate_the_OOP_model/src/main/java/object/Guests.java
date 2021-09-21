package object;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Guests {

    private List<Guest> guests;

    public List<Guest> addGuest(Guest guest) {
        this.guests.add(guest);
        return this.guests;
    }
}
