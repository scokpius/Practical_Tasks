package components.search_options;

import com.codeborne.selenide.SelenideElement;
import components.calendar_date.CalendarDateHotelInformation;
import components.guests.GuestsHotelInformation;
import lombok.Getter;
import page.HotelInformationPage;

import static com.codeborne.selenide.Selenide.$x;
import static constant.XPathCSS.*;

@Getter
public class SearchOptionsHotelInformation extends SearchOptions {
    protected SelenideElement buttonCheckRates;

    public SearchOptionsHotelInformation() {
        super.dateCheckIn = new CalendarDateHotelInformation($x(HOTEL_INFORMATION_PAGE_BUTTON_CHECK_IN_XPATH));
        super.dateCheckOut = new CalendarDateHotelInformation($x(HOTEL_INFORMATION_PAGE_BUTTON_CHECK_OUT_XPATH));
        super.buttonGuests = new GuestsHotelInformation($x(HOTEL_INFORMATION_PAGE_BUTTON_GUESTS_XPATH));
        buttonCheckRates = $x(HOTEL_INFORMATION_PAGE_BUTTON_CHECK_RATES_XPATH);
    }

    public HotelInformationPage clickButtonCheckRates(){
        buttonCheckRates.click();
        return new HotelInformationPage();
    }
}
