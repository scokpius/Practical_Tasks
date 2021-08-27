package components.search_options;

import components.calendar_date.CalendarDateHome;
import components.guests.GuestsHome;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;

public class SearchOptionsResultsSearchPage extends SearchOptions{
    public SearchOptionsResultsSearchPage() {
        super.dateCheckIn = new CalendarDateHome($(By.xpath(RESULTS_PAGE_BUTTON_CHECK_IN_XPATH)));
        super.dateCheckOut = new CalendarDateHome($(By.xpath(RESULTS_PAGE_BUTTON_CHECK_OUT_XPATH)));
        super.buttonGuests = new GuestsHome($(By.xpath(RESULTS_PAGE_BUTTON_GUESTS_XPATH)));
        super.buttonFindOfHotel = $(By.xpath(RESULTS_PAGE_BUTTON_SEARCH_XPATH));
    }


}
