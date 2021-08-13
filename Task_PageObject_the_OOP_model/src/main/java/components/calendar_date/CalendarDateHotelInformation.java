package components.calendar_date;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;

public class CalendarDateHotelInformation extends CalendarDate{

    private final SelenideElement dropdownCalendarHotelInformation = $(By.xpath(HOTEL_INFORMATION_PAGE_DROPDOWN_CALENDAR_XPATH));
    private final SelenideElement buttonPrevHotelInformation = $(By.xpath(HOTEL_INFORMATION_PAGE_BUTTON_PREV_MONTH_XPATH));
    private final SelenideElement buttonNextHotelInformation = $(By.xpath(HOTEL_INFORMATION_PAGE_BUTTON_NEXT_MONTH_XPATH));
    private final SelenideElement textMonthHotelInformation = $(By.xpath(HOTEL_INFORMATION_PAGE_TEXT_MONTH_XPATH));
    private final SelenideElement textDayHotelInformation = $(By.xpath(HOTEL_INFORMATION_PAGE_TEXT_DAY_XPATH));
    private final String textDayLocatorHotelInformation = HOTEL_INFORMATION_PAGE_TEXT_DAY_XPATH;

    public CalendarDateHotelInformation(SelenideElement buttonCalendar) {
        super.buttonCalendar = buttonCalendar;
        super.dropdownCalendar = dropdownCalendarHotelInformation;
        super.buttonPrev = buttonPrevHotelInformation;
        super.buttonNext = buttonNextHotelInformation;
        super.textMonth = textMonthHotelInformation;
        super.textDay = textDayHotelInformation;
        super.textDayLocator = textDayLocatorHotelInformation;
    }

}
