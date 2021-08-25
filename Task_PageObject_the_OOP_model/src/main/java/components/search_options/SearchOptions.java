package components.search_options;

import com.codeborne.selenide.SelenideElement;
import components.calendar_date.CalendarDate;
import components.guests.Guests;
import page.ResultsSearchPage;

import java.time.LocalDate;

public abstract class SearchOptions {

    protected CalendarDate dateCheckIn;
    protected CalendarDate dateCheckOut;
    protected Guests buttonGuests;
    protected SelenideElement button;

    public void chooseCheckInDate(LocalDate localDate) {
        dateCheckIn.selectDate(localDate);
    }

    public void chooseCheckOutDate(LocalDate localDate) {
        dateCheckOut.selectDate(localDate);
    }

    public void chooseGuests(String amountRoom, String amountAdult, String amountChildren) {
        buttonGuests.clickButtonGuests();
        buttonGuests.setNumberOfRooms(amountRoom);
        buttonGuests.setNumberOfAdult(amountAdult);
        buttonGuests.setNumberOfAChildren(amountChildren);
        buttonGuests.clickButtonDone();
    }

    public ResultsSearchPage clickButton() {
        button.click();
        return new ResultsSearchPage();
    }

}






















   /* public void chooseGuests(int room, int adult, int children) {
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
    }*/


