package components.calendar_date;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.LocalDate;
import java.util.Locale;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public abstract class CalendarDate {
    SelenideElement buttonCalendar;
    SelenideElement dropdownCalendar;
    SelenideElement buttonPrev;
    SelenideElement buttonNext;
    SelenideElement textMonth;
    SelenideElement textDay;
    String textDayLocator;


    public void clickButtonCalendar(){
        buttonCalendar.click();
    }

    void findMonth(String dateXpath) {
        while (true) {
            if ($(By.xpath(dateXpath)).exists()) {
                break;
            } else {
                buttonNext.click();
            }
        }
    }

    public void selectDate(LocalDate localDate) {
        String month = localDate.getMonth().toString().substring(0,1) + localDate.getMonth().toString().substring(1).toLowerCase(Locale.ROOT);
        String date = String.format(textDayLocator, month +" "+localDate.getDayOfMonth()+", " + localDate.getYear());
        buttonCalendar.click();
        findMonth(date);
        $x(date).click();
    }
}
