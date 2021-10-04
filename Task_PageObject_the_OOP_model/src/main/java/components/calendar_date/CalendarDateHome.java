package components.calendar_date;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static constant.XPathCSS.*;


public class CalendarDateHome extends CalendarDate {

    public CalendarDateHome(SelenideElement buttonCalendar) {
        super.buttonCalendar = buttonCalendar;
        super.buttonPrev = $x(HOME_PAGE_BUTTON_PREV_MONTH_XPATH);
        super.buttonNext = $x(HOME_PAGE_BUTTON_NEXT_MONTH_XPATH);
        super.textMonth = $$x(HOME_PAGE_TEXT_MONTH_XPATH).first();
        super.textDay = $x(HOME_PAGE_TEXT_DAY_XPATH);
        super.textDayLocator = HOME_PAGE_TEXT_DAY_XPATH;
    }
}
