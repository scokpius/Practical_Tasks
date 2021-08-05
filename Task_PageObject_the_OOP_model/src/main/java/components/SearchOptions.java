package components;

import org.openqa.selenium.By;
import page.ResultsSearchPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchOptions {

    public CalendarDate buttonCheckIn;
    public CalendarDate buttonCheckOut;
    public String buttonGuests;
    public String dropdownGuests;
    public Guests addAndMinGuests;
    public String buttonFind;

    public SearchOptions(String buttonCheckIn, String buttonCheckOut,
                         String buttonGuests, String dropdownGuests, String buttonFind,
                         String dropdownCalendar, String buttonPrev, String buttonNext,
                         String textMonth, String textDay, String textAmount,
                         String buttonAddAndMin, String buttonDone) {
        this.buttonCheckIn = new CalendarDate(buttonCheckIn, dropdownCalendar, buttonPrev,
                buttonNext, textMonth, textDay);
        this.buttonCheckOut = new CalendarDate(buttonCheckOut, dropdownCalendar, buttonPrev,
                buttonNext, textMonth, textDay);
        this.buttonGuests = buttonGuests;
        this.dropdownGuests = dropdownGuests;
        this.addAndMinGuests = new Guests(textAmount, buttonAddAndMin, buttonDone);
        this.buttonFind = buttonFind;
    }

    public void chooseCheckInDate(String month, String day, String yer) {
        $(By.xpath(buttonCheckIn.buttonCalendar)).click();
        buttonCheckIn.selectDate(month, day, yer);
    }

    public void chooseCheckOutDate(String month, String day, String yer) {
        $(By.xpath(buttonCheckOut.buttonCalendar)).click();
        buttonCheckOut.selectDate(month, day, yer);
    }

    public void chooseGuests(int room, int adult, int children) {
        chooseElementGuest(room, 0, addAndMinGuests.addAndMinButtonRoom .getButtonAdd());
        chooseElementGuest(adult, 1, addAndMinGuests.addAndMinButtonAdult.getButtonAdd());
        chooseElementGuest(children, 2, addAndMinGuests.addAndMinButtonChildren.getButtonAdd());
    }

    public ResultsSearchPage clickFind (){
        $(By.xpath(buttonFind)).shouldBe().click();
        return new ResultsSearchPage();
    }


    private void chooseElementGuest(int element, int serialNumber, String elementAddMin) {
        int elementGusts = Integer.parseInt($$(By.xpath(addAndMinGuests.getTextAmount())).get(serialNumber).getText());
        if (elementGusts < element) {
            while (true) {
                if (elementGusts != element) {
                    $(By.xpath(elementAddMin)).click();
                    elementGusts++;
                }
            }
        } else {
            while (true) {
                if (elementGusts != element) {
                    $(By.xpath(elementAddMin)).click();
                    elementGusts--;
                }
            }
        }
    }
}
