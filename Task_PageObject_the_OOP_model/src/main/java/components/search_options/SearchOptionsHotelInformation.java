package components.search_options;

import com.codeborne.selenide.SelenideElement;
import components.calendar_date.CalendarDateHotelInformation;
import components.guests.GuestsHotelInformation;
import lombok.Getter;
import org.openqa.selenium.By;
import page.HotelInformationPage;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;

@Getter
public class SearchOptionsHotelInformation extends SearchOptions {
    protected SelenideElement buttonCheckRates;

    public SearchOptionsHotelInformation() {
        super.dateCheckIn = new CalendarDateHotelInformation($(By.xpath(HOTEL_INFORMATION_PAGE_BUTTON_CHECK_IN_XPATH)));
        super.dateCheckOut = new CalendarDateHotelInformation($(By.xpath(HOTEL_INFORMATION_PAGE_BUTTON_CHECK_OUT_XPATH)));
        super.buttonGuests = new GuestsHotelInformation($(By.xpath(HOTEL_INFORMATION_PAGE_BUTTON_GUESTS_XPATH)));
        buttonCheckRates = $(By.xpath(HOTEL_INFORMATION_PAGE_BUTTON_CHECK_RATES_XPATH));
    }

    public HotelInformationPage clickButtonCheckRates(){
        buttonCheckRates.click();
        return new HotelInformationPage();
    }
}
