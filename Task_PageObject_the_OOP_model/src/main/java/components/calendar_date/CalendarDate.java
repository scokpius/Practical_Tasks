package components.calendar_date;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.LocalDate;
import java.util.Locale;

import static com.codeborne.selenide.Selenide.$;


public abstract class CalendarDate {
    protected SelenideElement buttonCalendar;
    protected SelenideElement dropdownCalendar;
    protected SelenideElement buttonPrev;
    protected SelenideElement buttonNext;
    protected SelenideElement textMonth;
    protected SelenideElement textDay;
    protected String textDayLocator;


    public void clickButtonCalendar(){
        buttonCalendar.click();
    }

    public void findMonth(String dateXpath) {
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
        $(By.xpath(date)).click();
    }
}
