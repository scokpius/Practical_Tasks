import object.Guests;
import object.HotelSearch;

import java.time.LocalDate;

class InputParametersForTest {
    final static HotelSearch hotelSearchParis =
            HotelSearch.builder()
                    .location("Paris")
                    .arriveDate(LocalDate.of(2021, 11, 19))
                    .departureDate(LocalDate.of(2021, 11, 24))
                    .guests(Guests.builder()
                            .rooms("1")
                            .adults("4")
                            .children("0")
                            .build())
                    .build();

    final static HotelSearch hotelSearchMilan =
            HotelSearch.builder()
                    .location("Milan")
                    .arriveDate(LocalDate.of(2021, 11, 19))
                    .departureDate(LocalDate.of(2021, 11, 24))
                    .guests(Guests.builder()
                            .rooms("1")
                            .adults("2")
                            .children("2")
                            .build())
                    .build();

    final static HotelSearch hotelSearchLondon =
            HotelSearch.builder()
                    .location("London")
                    .arriveDate(LocalDate.of(2021, 11, 25))
                    .departureDate(LocalDate.of(2021, 11, 30))
                    .guests(Guests.builder()
                            .rooms("1")
                            .adults("2")
                            .children("0")
                            .build())
                    .build();

    final static HotelSearch hotelSearchMinsk = HotelSearch.builder()
            .location("Minsk")
            .arriveDate(LocalDate.of(2021, 11, 27))
            .departureDate(LocalDate.of(2021, 12, 4))
            .guests(Guests.builder()
                    .rooms("1")
                    .adults("2")
                    .children("2")
                    .build())
            .build();
}
