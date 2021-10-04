package components.search_options;

import components.calendar_date.CalendarDateHotels;
import components.guests.GuestsHotels;

import static com.codeborne.selenide.Selenide.$x;
import static constant.XPathCSS.*;

public class SearchOptionsHotels extends SearchOptions {

    public SearchOptionsHotels() {
        super.dateCheckIn = new CalendarDateHotels($x(HOTEL_PAGE_BUTTON_CHECK_IN_XPATH));
        super.dateCheckOut = new CalendarDateHotels($x(HOTEL_PAGE_BUTTON_CHECK_OUT_XPATH));
        super.buttonGuests = new GuestsHotels($x(HOTEL_PAGE_BUTTON_GUESTS_XPATH));
        super.buttonFindOfHotel = $x(HOTEL_PAGE_BUTTON_FIND_XPATH);
    }

    @Override
    public void chooseGuests(String amountRoom, String amountAdult, String amountChildren) {
        buttonGuests.clickButtonGuests();
      //  buttonGuests.clickButtonGuests();
       // buttonGuests.setNumberOfRooms(amountRoom);
        buttonGuests.setNumberOfAdult(amountAdult);
        buttonGuests.setNumberOfAChildren(amountChildren);
        buttonGuests.clickButtonDone();
    }
}
