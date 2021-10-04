package components.guests;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static constant.XPathCSS.*;

public class GuestsHotelInformation extends Guests{

    public GuestsHotelInformation(SelenideElement buttonGuests) {
        super.buttonGuests = buttonGuests;
        super.textAmountRooms = $x(HOME_PAGE_TEXT_AMOUNT_ROOM_XPATH);
        super.textAmountAdult = $x(HOME_PAGE_TEXT_AMOUNT_ADULT_XPATH);
        super.textAmountChildren = $x(HOME_PAGE_TEXT_AMOUNT_CHILDREN_XPATH);
        super.buttonAddRoom = $x(String.format(HOTEL_INFORMATION_PAGE_BUTTON_ADD_MIN_XPATH, 1, 2));
        super.buttonMinRoom = $x(String.format(HOTEL_INFORMATION_PAGE_BUTTON_ADD_MIN_XPATH, 1, 1));
        super.buttonAddAdult = $x(String.format(HOTEL_INFORMATION_PAGE_BUTTON_ADD_MIN_XPATH, 2, 2));
        super.buttonMinAdult = $x(String.format(HOTEL_INFORMATION_PAGE_BUTTON_ADD_MIN_XPATH, 2, 1));
        super.buttonAddChildren = $x(String.format(HOTEL_INFORMATION_PAGE_BUTTON_ADD_MIN_XPATH, 3, 2));
        super.buttonMinChildren = $x(String.format(HOTEL_INFORMATION_PAGE_BUTTON_ADD_MIN_XPATH, 3, 1));
        super.buttonDone = $x(HOTEL_INFORMATION_PAGE_BUTTON_DONE_XPATH);
    }
}
