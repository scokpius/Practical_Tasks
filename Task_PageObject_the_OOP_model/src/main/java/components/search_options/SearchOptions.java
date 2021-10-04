package components.search_options;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import components.calendar_date.CalendarDate;
import components.guests.Guests;
import org.apache.commons.lang3.time.DateUtils;
import org.openqa.selenium.Cookie;
import page.ResultsSearchPage;

import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public abstract class SearchOptions {

    CalendarDate dateCheckIn;
    CalendarDate dateCheckOut;
    Guests buttonGuests;
    SelenideElement buttonFindOfHotel;

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

    public ResultsSearchPage clickButtonFindOfHotel() {
        buttonFindOfHotel.click();
        ResultsSearchPage resultsSearchPage = new ResultsSearchPage();
        WebDriverRunner.getWebDriver().manage().deleteCookieNamed("ak_bmsc");
        WebDriverRunner.getWebDriver().manage().addCookie(new Cookie("ak_bmsc",
                "5949BB4D1CE164DBFF9FA3CE76ECB53C~000000000000000000000000000000~YAAQX/1zPmwO7PB6AQAAGMn" +
                        "MCgzyo4OhFNpAH7LQrwG7EcgwjNEGjvPmn04RrImfbgmSN25chB6KKLX2C1aA9zPbwa3SlXLeKkdob4eVLY89H" +
                        "znNU+1T6Z9074XclZiiMnyosqb1iFD0VTx2X1wdV8o9+5kr/ubVWojXdDU52goQJPLXGq3nzS9VLP2cc+bFbhwa" +
                        "2kL9cbLFd6w0Vf4IsonRm9z+YrGslWFyqyVbjGpfbC0JsYKI2VXVRII5wC3LCenCeCj8XAIrMPKIlC6tX22VOeKW" +
                        "iYBQRqs27DUHf6Y5sAwSc9oEHMvClJVeC43qlB2LkJD9Wz9sRr9TCJKbunUn2Z44NZwaJrDKWgVfXRlW3B1pzy3Ta" +
                        "lZH97jqCafIKLtJqV7cfkWnqhqS60Jc1yHnW+abZHxJlgQnNM5VF6r8ctfml5cytg6FuU5uS1CDb+16AyGxbFdY8Z" +
                        "7RJAAjLPfbBjMMz0G7MCLetfNs3vR5oQRwNdcJT0RyaqVBP8TS",
                ".hotwire.com", "/", DateUtils.addHours(new Date(), 2)));
        WebDriverRunner.getWebDriver().manage().timeouts().pageLoadTimeout(10000,
                TimeUnit.MILLISECONDS);
        return resultsSearchPage;
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


