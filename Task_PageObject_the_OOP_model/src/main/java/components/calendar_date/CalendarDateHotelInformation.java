package components.calendar_date;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.LocalDate;
import java.util.Locale;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;

public class CalendarDateHotelInformation extends CalendarDate{

    public CalendarDateHotelInformation(SelenideElement buttonCalendar) {
        super.buttonCalendar = buttonCalendar;
        super.dropdownCalendar = $(By.xpath(HOTEL_INFORMATION_PAGE_DROPDOWN_CALENDAR_XPATH));
        super.buttonPrev = $(By.xpath(HOTEL_INFORMATION_PAGE_BUTTON_PREV_MONTH_XPATH));
        super.buttonNext = $(By.xpath(HOTEL_INFORMATION_PAGE_BUTTON_NEXT_MONTH_XPATH));
        super.textMonth = $(By.xpath(HOTEL_INFORMATION_PAGE_TEXT_MONTH_XPATH));
        super.textDay = $(By.xpath(HOTEL_INFORMATION_PAGE_TEXT_DAY_XPATH));super.textDayLocator = HOTEL_INFORMATION_PAGE_TEXT_DAY_XPATH;
    }
    @Override
    public void selectDate(LocalDate localDate) {
        String month = localDate.getMonth().toString().substring(0,1) + localDate.getMonth().toString().substring(1,3).toLowerCase(Locale.ROOT);
        String date = String.format(textDayLocator, month +" "+localDate.getDayOfMonth()+", " + localDate.getYear());
        buttonCalendar.click();
        findMonth(date);
        $(By.xpath(date)).click();
    }
}
