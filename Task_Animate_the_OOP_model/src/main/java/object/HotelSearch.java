package object;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class HotelSearch {
    private String location;
    private LocalDate arriveDate;
    private LocalDate departureDate;
    private Guests guests;
//    private List<Guests> guests;
//    private String rooms;
//    private String adults;
//    private String children;


    public String printLocalDate (LocalDate localDate){
        return localDate.getMonthValue() + "/" + localDate.getDayOfMonth() + "/" + localDate.getYear();
    }

//    public int countGuest() {
//        int countGuest = 0;
//        for (Guests guest : guests) {
//            countGuest += guest.getGuests().size();
//        }
//        return countGuest;
//    }
//
//    public void countNumberOfRooms() {
//        int countRooms = 0;
//        if (countGuest() > 0) {
//            if (countGuest() % 4 > 0) {
//                countRooms = countGuest() / 4 + 1;
//            } else {
//                countRooms = countGuest() / 4;
//            }
//        }
//        this.rooms = String.valueOf(countRooms);
//    }
//
//    public void countNumberOfAdultsChildren() {
//        int countAdults = 0;
//        int countChildren = 0;
//        for (int i = 0; i < this.getGuests().size(); i++) {
//            if (guests.get(i).getGuests().get(i).isAdultGuest(guests.get(i).getGuests().get(i).getAge())) {
//                countAdults++;
//            } else {
//                countChildren++;
//            }
//        }
//        this.adults = String.valueOf(countAdults);
//        this.children = String.valueOf(countChildren);
//    }

}
