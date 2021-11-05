package components.guests;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static constant.XPathCSS.*;

public class GuestsHome extends Guests{

     public GuestsHome(SelenideElement buttonGuests) {
        super.buttonGuests = buttonGuests;
        super.textAmountRooms = $x(HOME_PAGE_TEXT_AMOUNT_ROOM_XPATH);
        super.textAmountAdult = $x(HOME_PAGE_TEXT_AMOUNT_ADULT_XPATH);
        super.textAmountChildren = $x(HOME_PAGE_TEXT_AMOUNT_CHILDREN_XPATH);
        super.buttonAddRoom = $x(String.format(HOME_PAGE_BUTTON_ADD_MIN_XPATH, "rooms", "increase"));
        super.buttonMinRoom = $x(String.format(HOME_PAGE_BUTTON_ADD_MIN_XPATH, "rooms", "decrease"));
        super.buttonAddAdult = $x(String.format(HOME_PAGE_BUTTON_ADD_MIN_XPATH, "adults", "increase"));
        super.buttonMinAdult = $x(String.format(HOME_PAGE_BUTTON_ADD_MIN_XPATH, "adults", "decrease"));
        super.buttonAddChildren = $x(String.format(HOME_PAGE_BUTTON_ADD_MIN_XPATH, "children", "increase"));
        super.buttonMinChildren = $x(String.format(HOME_PAGE_BUTTON_ADD_MIN_XPATH, "children", "decrease"));
        super.buttonDone = $x(HOME_PAGE_BUTTON_DONE_XPATH);
    }
}
