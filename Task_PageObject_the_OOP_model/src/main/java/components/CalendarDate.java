package components;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class CalendarDate {
    // локаторы
    public String buttonCalendar;
    public String dropdownCalendar;
    public String buttonPrev;
    public String buttonNext;
    public String textMonth;
    public String textDay;

    public CalendarDate(String buttonCalendar, String dropdownCalendar,
                        String buttonPrev, String buttonNext,
                        String textMonth, String textDay) {
        this.buttonCalendar = buttonCalendar;
        this.dropdownCalendar = dropdownCalendar;
        this.buttonPrev = buttonPrev;
        this.buttonNext = buttonNext;
        this.textMonth = textMonth;
        this.textDay = textDay;
    }

    public SelenideElement nextMonthButton() {
        return $(By.xpath(buttonNext));
    }

    public SelenideElement previousMonthButton() {
        return $(By.xpath(buttonPrev));
    }

    public void findMonth(String month, String day, String year) {
        String date = String.format(textDay, month, day, year);
        while (true) {
            if ($(By.xpath(date)).exists()) {
                break;
            } else {
                nextMonthButton().click();
            }
        }
    }

    public void selectDate(String month, String day, String year) {
        String date = String.format(textDay, month, day, year);
        $(By.xpath(buttonCalendar)).click();
        findMonth(month, day, year);
        $(By.xpath(date)).click();
    }
}
