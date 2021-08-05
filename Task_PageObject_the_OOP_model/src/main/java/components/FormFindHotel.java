package components;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class FormFindHotel extends SearchOptions {

    public String inputLocation;

    //локаторы
    public FormFindHotel(String inputLocation, String buttonCheckIn, String buttonCheckOut,
                         String buttonGuests, String dropdownGuests, String buttonFind, String dropdownCalendar,
                         String buttonPrev, String buttonNext, String textMonth, String textDay,
                         String textAmount, String buttonAddAndMin, String buttonDone) {
        super(buttonCheckIn, buttonCheckOut, buttonGuests, dropdownGuests, buttonFind, dropdownCalendar, buttonPrev,
                buttonNext, textMonth, textDay, textAmount, buttonAddAndMin, buttonDone);
        this.inputLocation = inputLocation;
    }


    public void writeFindSearch(String location, String monthIn, String dayIn, String yerIn,
                                String monthOut, String dayOut, String yerOut, int room, int adult, int children) {
        $(By.xpath(inputLocation)).setValue(location).
                shouldBe(Condition.visible, Duration.ofSeconds(3)).pressEnter();
        chooseCheckInDate(monthIn, dayIn, yerIn);
        chooseCheckOutDate(monthOut, dayOut, yerOut);
        chooseGuests(room, adult, children);
    }
}
