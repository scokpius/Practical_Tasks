package components.search_options;

import com.codeborne.selenide.SelenideElement;
import components.calendar_date.CalendarDateHome;
import components.guests.GuestsHome;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;

public class SearchOptionsHome extends SearchOptions {

    private final SelenideElement buttonCheckInHome = $(By.xpath(HOME_PAGE_BUTTON_CHECK_IN_XPATH));
    private final SelenideElement buttonCheckOutHome = $(By.xpath(HOME_PAGE_BUTTON_CHECK_OUT_XPATH));
    private final SelenideElement buttonGuestsHome = $(By.xpath(HOME_PAGE_BUTTON_GUESTS_XPATH));
    private final SelenideElement dropdownTextAmountHome = $(By.xpath(HOME_PAGE_DROPDOWN_TEXT_AMOUNT_XPATH));
    private final SelenideElement buttonFindHome = $(By.xpath(HOME_PAGE_BUTTON_FIND_XPATH));


    public SearchOptionsHome() {
        super.dateCheckIn = new CalendarDateHome(buttonCheckInHome);
        super.dateCheckOut = new CalendarDateHome(buttonCheckOutHome);
        super.buttonGuests = new GuestsHome(buttonGuestsHome);
        super.button = buttonFindHome;
    }

}



