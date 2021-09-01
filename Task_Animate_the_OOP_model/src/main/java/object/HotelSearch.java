package object;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class HotelSearch {
    private Location location;
    private LocalDate arriveDate;
    private LocalDate departureDate;
    private List<Guests> guests;
    private String rooms;
    private String adults;
    private String children;

    public int countGuest() {
        int countGuest = 0;
        for (Guests guest : guests) {
            countGuest += guest.getGuests().size();
        }
        return countGuest;
    }

    public void countNumberOfRooms() {
        int countRooms = 0;
        if (countGuest() > 0) {
            if (countGuest() % 4 > 0) {
                countRooms = countGuest() / 4 + 1;
            } else {
                countRooms = countGuest() / 4;
            }
        }
        this.rooms = String.valueOf(countRooms);
    }

    public void countNumberOfAdultsChildren() {
        int countAdults = 0;
        int countChildren = 0;
        for (int i = 0; i < this.getGuests().size(); i++) {
            if (guests.get(i).getGuests().get(i).isAdultGuest(guests.get(i).getGuests().get(i).getAge(guests.get(i).getGuests().get(i).getDateOFBirth()))) {
                countAdults++;
            } else {
                countChildren++;
            }
        }
        this.adults = String.valueOf(countAdults);
        this.children = String.valueOf(countChildren);
    }
}
