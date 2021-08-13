package components.search_options;

import com.codeborne.selenide.SelenideElement;
import components.calendar_date.CalendarDateHotels;
import components.guests.GuestsHotels;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;

public class SearchOptionsHotels extends SearchOptions {
    private final SelenideElement buttonCheckInHotels = $(By.xpath(HOTEL_PAGE_BUTTON_CHECK_IN_XPATH));
    private final SelenideElement buttonCheckOutHotels = $(By.xpath(HOTEL_PAGE_BUTTON_CHECK_OUT_XPATH));
    private final SelenideElement buttonGuestsHotels = $(By.xpath(HOTEL_PAGE_BUTTON_GUESTS_XPATH));
    private final SelenideElement buttonFindHotels = $(By.xpath(HOTEL_PAGE_BUTTON_FIND_XPATH));

    public SearchOptionsHotels() {
        super.dateCheckIn = new CalendarDateHotels(buttonCheckInHotels);
        super.dateCheckOut = new CalendarDateHotels(buttonCheckOutHotels);
        super.buttonGuests = new GuestsHotels(buttonGuestsHotels);
        super.button = buttonFindHotels;
    }

}
