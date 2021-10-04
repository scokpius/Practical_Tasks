package components.search_options;

import components.calendar_date.CalendarDateHome;
import components.guests.GuestsHome;

import static com.codeborne.selenide.Selenide.$x;
import static constant.XPathCSS.*;

public class SearchOptionsResultsSearchPage extends SearchOptions{
    public SearchOptionsResultsSearchPage() {
        super.dateCheckIn = new CalendarDateHome($x(RESULTS_PAGE_BUTTON_CHECK_IN_XPATH));
        super.dateCheckOut = new CalendarDateHome($x(RESULTS_PAGE_BUTTON_CHECK_OUT_XPATH));
        super.buttonGuests = new GuestsHome($x(RESULTS_PAGE_BUTTON_GUESTS_XPATH));
        super.buttonFindOfHotel = $x(RESULTS_PAGE_BUTTON_SEARCH_XPATH);
    }


}
