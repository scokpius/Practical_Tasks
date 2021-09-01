package components.guests;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;

public class GuestsHome extends Guests{

     public GuestsHome(SelenideElement buttonGuests) {
        super.buttonGuests = buttonGuests;
        super.textAmountRooms = $(By.xpath(HOME_PAGE_TEXT_AMOUNT_ROOM_XPATH));
        super.textAmountAdult = $(By.xpath(HOME_PAGE_TEXT_AMOUNT_ADULT_XPATH));
        super.textAmountChildren = $(By.xpath(HOME_PAGE_TEXT_AMOUNT_CHILDREN_XPATH));
        super.buttonAddRoom = $(By.xpath(String.format(HOME_PAGE_BUTTON_ADD_MIN_XPATH, "rooms", "increase")));
        super.buttonMinRoom = $(By.xpath(String.format(HOME_PAGE_BUTTON_ADD_MIN_XPATH, "rooms", "decrease")));
        super.buttonAddAdult = $(By.xpath(String.format(HOME_PAGE_BUTTON_ADD_MIN_XPATH, "adults", "increase")));
        super.buttonMinAdult = $(By.xpath(String.format(HOME_PAGE_BUTTON_ADD_MIN_XPATH, "adults", "decrease")));
        super.buttonAddChildren = $(By.xpath(String.format(HOME_PAGE_BUTTON_ADD_MIN_XPATH, "children", "increase")));
        super.buttonMinChildren = $(By.xpath(String.format(HOME_PAGE_BUTTON_ADD_MIN_XPATH, "children", "decrease")));
        super.buttonDone = $(By.xpath(HOME_PAGE_BUTTON_DONE_XPATH));
    }
}
