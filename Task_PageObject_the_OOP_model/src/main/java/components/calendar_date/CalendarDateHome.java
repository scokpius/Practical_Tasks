package components.calendar_date;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;


public class CalendarDateHome extends CalendarDate {

    public CalendarDateHome(SelenideElement buttonCalendar) {
        super.buttonCalendar = buttonCalendar;
        super.dropdownCalendar = $(By.xpath(HOME_PAGE_DROPDOWN_CALENDAR_XPATH));
        super.buttonPrev = $(By.xpath(HOME_PAGE_BUTTON_PREV_MONTH_XPATH));
        super.buttonNext = $(By.xpath(HOME_PAGE_BUTTON_NEXT_MONTH_XPATH));
        super.textMonth = $(By.xpath(HOME_PAGE_TEXT_MONTH_XPATH));
        super.textDay = $(By.xpath(HOME_PAGE_TEXT_DAY_XPATH));
        super.textDayLocator = HOME_PAGE_TEXT_DAY_XPATH;

    }
}
