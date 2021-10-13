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

    public String printLocalDate (LocalDate localDate){
        return localDate.getMonthValue() + "/" + localDate.getDayOfMonth() + "/" + localDate.getYear();
    }
}
