package components.calendar_date;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

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

    public void findMonth(String month, String day, String year) {
        String date = String.format(textDayLocator, month, day, year);

        while (true) {
            if ($(By.xpath(date)).exists()) {
                break;
            } else {
                buttonNext.click();
            }
        }
    }

    public void selectDate(String month, String day, String year) {
        String date = String.format(textDayLocator, month, day, year);
        buttonCalendar.click();
        findMonth(month, day, year);
        $(By.xpath(date)).click();
    }
}
