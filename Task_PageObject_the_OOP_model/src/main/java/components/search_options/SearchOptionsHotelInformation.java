package components.search_options;

import com.codeborne.selenide.SelenideElement;
import components.calendar_date.CalendarDateHotelInformation;
import components.guests.GuestsHotelInformation;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;

@Getter
public class SearchOptionsHotelInformation extends SearchOptions {
    private final SelenideElement buttonCheckInHotelInformation = $(By.xpath(HOTEL_INFORMATION_PAGE_BUTTON_CHECK_IN_XPATH));
    private final SelenideElement buttonCheckOutHotelInformation = $(By.xpath(HOTEL_INFORMATION_PAGE_BUTTON_CHECK_OUT_XPATH));
    private final SelenideElement buttonGuestsHotelInformation = $(By.xpath(HOTEL_INFORMATION_PAGE_BUTTON_GUESTS_XPATH));
    private final SelenideElement buttonFindHotelInformation = $(By.xpath(HOTEL_INFORMATION_PAGE_BUTTON_FIND_XPATH));


    public SearchOptionsHotelInformation() {
        super.dateCheckIn = new CalendarDateHotelInformation(buttonCheckInHotelInformation);
        super.dateCheckOut = new CalendarDateHotelInformation(buttonCheckOutHotelInformation);
        super.buttonGuests = new GuestsHotelInformation(buttonGuestsHotelInformation);
        super.button = buttonFindHotelInformation;
    }

}
