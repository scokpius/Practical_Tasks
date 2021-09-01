package components.search_options;

import components.calendar_date.CalendarDateHotels;
import components.guests.GuestsHotels;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;

public class SearchOptionsHotels extends SearchOptions {

    public SearchOptionsHotels() {
        super.dateCheckIn = new CalendarDateHotels($(By.xpath(HOTEL_PAGE_BUTTON_CHECK_IN_XPATH)));
        super.dateCheckOut = new CalendarDateHotels($(By.xpath(HOTEL_PAGE_BUTTON_CHECK_OUT_XPATH)));
        super.buttonGuests = new GuestsHotels($(By.xpath(HOTEL_PAGE_BUTTON_GUESTS_XPATH)));
        super.buttonFindOfHotel = $(By.xpath(HOTEL_PAGE_BUTTON_FIND_XPATH));
    }

}
