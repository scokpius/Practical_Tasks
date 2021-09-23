import object.HotelSearch;
import object.Location;

import java.time.LocalDate;

class InputParametersForTests {
    final static HotelSearch hotelSearchParis =
            HotelSearch.builder()
            .location(Location.builder().townName("Paris").build())
            .arriveDate(LocalDate.of(2021, 9, 27))
            .departureDate(LocalDate.of(2021, 10, 4))
            .rooms("1")
            .adults("4")
            .children("0")
            .build();

    final static HotelSearch hotelSearchPar =
            HotelSearch.builder()
                    .location(Location.builder().townName("Par").build())
                    .build();

    final static HotelSearch hotelSearchMinsk = HotelSearch.builder()
            .location(Location.builder().townName("Minsk").build())
            .arriveDate(LocalDate.of(2021, 9, 27))
            .departureDate(LocalDate.of(2021, 10, 4))
            .rooms("1")
            .adults("2")
            .children("2")
            .build();

    final static HotelSearch hotelSearchLondon =
            HotelSearch.builder()
                    .location(Location.builder().townName("London").build())
                    .build();
}
