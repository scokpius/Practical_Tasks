package components.calendar_date;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;

public class CalendarDateHome extends CalendarDate {


    private final SelenideElement dropdownCalendarHome = $(By.xpath(HOME_PAGE_DROPDOWN_CALENDAR_XPATH));
    private final SelenideElement buttonPrevHome = $(By.xpath(HOME_PAGE_BUTTON_PREV_MONTH_XPATH));
    private final SelenideElement buttonNextHome = $(By.xpath(HOME_PAGE_BUTTON_NEXT_MONTH_XPATH));
    private final SelenideElement textMonthHome = $(By.xpath(HOME_PAGE_TEXT_MONTH_XPATH));;
    private final SelenideElement textDayHome = $(By.xpath(HOME_PAGE_TEXT_DAY_XPATH));
    protected String textDayLocatorHome = HOME_PAGE_TEXT_DAY_XPATH;

    public CalendarDateHome(SelenideElement buttonCalendar) {
        super.buttonCalendar = buttonCalendar;
        super.dropdownCalendar = dropdownCalendarHome;
        super.buttonPrev = buttonPrevHome;
        super.buttonNext = buttonNextHome ;
        super.textMonth = textMonthHome;
        super.textDay = textDayHome;
        super.textDayLocator = textDayLocatorHome;
    }



}
