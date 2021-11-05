package components.calendar_date;

import com.codeborne.selenide.SelenideElement;

import java.time.LocalDate;
import java.util.Locale;

import static com.codeborne.selenide.Selenide.$x;
import static constant.XPathCSS.*;

public class CalendarDateHotelInformation extends CalendarDate{

    public CalendarDateHotelInformation(SelenideElement buttonCalendar) {
        super.buttonCalendar = buttonCalendar;
        super.dropdownCalendar = $x(HOTEL_INFORMATION_PAGE_DROPDOWN_CALENDAR_XPATH);
        super.buttonPrev = $x(HOTEL_INFORMATION_PAGE_BUTTON_PREV_MONTH_XPATH);
        super.buttonNext = $x(HOTEL_INFORMATION_PAGE_BUTTON_NEXT_MONTH_XPATH);
        super.textMonth = $x(HOTEL_INFORMATION_PAGE_TEXT_MONTH_XPATH);
        super.textDay = $x(HOTEL_INFORMATION_PAGE_TEXT_DAY_XPATH);
        super.textDayLocator = HOTEL_INFORMATION_PAGE_TEXT_DAY_XPATH;
    }
    @Override
    public void selectDate(LocalDate localDate) {
        String month = localDate.getMonth().toString().substring(0,1) + localDate.getMonth().toString().substring(1,3).toLowerCase(Locale.ROOT);
        String date = String.format(textDayLocator, month +" "+localDate.getDayOfMonth()+", " + localDate.getYear());
        buttonCalendar.click();
        findMonth(date);
        $x(date).click();
    }
}
