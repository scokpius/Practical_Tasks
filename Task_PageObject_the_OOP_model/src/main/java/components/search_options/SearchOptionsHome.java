package components.search_options;

import components.calendar_date.CalendarDateHome;
import components.guests.GuestsHome;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;

public class SearchOptionsHome extends SearchOptions {

    public SearchOptionsHome() {
        super.dateCheckIn = new CalendarDateHome($(By.xpath(HOME_PAGE_BUTTON_CHECK_IN_XPATH)));
        super.dateCheckOut = new CalendarDateHome($(By.xpath(HOME_PAGE_BUTTON_CHECK_OUT_XPATH)));
        super.buttonGuests = new GuestsHome($(By.xpath(HOME_PAGE_BUTTON_GUESTS_XPATH)));
        super.buttonFindOfHotel = $(By.xpath(HOME_PAGE_BUTTON_FIND_XPATH));
    }
}



