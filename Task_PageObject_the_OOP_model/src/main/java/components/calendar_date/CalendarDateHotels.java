package components.calendar_date;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;

public class CalendarDateHotels extends CalendarDate{

    private final SelenideElement dropdownCalendarHotels = $(By.xpath(HOTEL_PAGE_DROPDOWN_CALENDAR_XPATH));
    private final SelenideElement buttonPrevHotels = $(By.xpath(HOTEL_PAGE_BUTTON_PREV_MONTH_XPATH));
    private final SelenideElement buttonNextHotels = $(By.xpath(HOTEL_PAGE_BUTTON_NEXT_MONTH_XPATH));
    private final SelenideElement textMonthHotels = $(By.xpath(HOTEL_PAGE_TEXT_MONTH_XPATH));
    private final SelenideElement textDayHotels = $(By.xpath(HOTEL_PAGE_TEXT_DAY_XPATH));
    private final String textDayLocatorHotels = HOTEL_PAGE_TEXT_DAY_XPATH;
    private final SelenideElement calendarButtonDone = $(By.xpath(HOTEL_PAGE_CALENDAR_BUTTON_DONE_XPATH));

    public CalendarDateHotels(SelenideElement buttonCalendar) {
        super.buttonCalendar = buttonCalendar;
        super.dropdownCalendar = dropdownCalendarHotels;
        super.buttonPrev = buttonPrevHotels;
        super.buttonNext = buttonNextHotels;
        super.textMonth = textMonthHotels;
        super.textDay = textDayHotels;
        super.textDayLocator = textDayLocatorHotels;
    }
    public void clickCalendarButtonDone(){
        calendarButtonDone.click();
    }

}
