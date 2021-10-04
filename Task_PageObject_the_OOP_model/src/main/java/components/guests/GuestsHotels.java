package components.guests;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static constant.XPathCSS.*;

public class GuestsHotels extends Guests {

    public GuestsHotels(SelenideElement buttonGuests) {
        super.buttonGuests = buttonGuests;
        super.textAmountRooms = $x(HOTEL_PAGE_TEXT_AMOUNT_ROOM_XPATH);
        super.textAmountAdult = $x(HOTEL_PAGE_TEXT_AMOUNT_ADULT_XPATH);
        super.textAmountChildren = $x(HOTEL_PAGE_TEXT_AMOUNT_CHILDREN_XPATH);
        super.buttonAddRoom = $x(HOTEL_PAGE_BUTTON_ADD_ROOM_XPATH);
        super.buttonMinRoom = $x(HOTEL_PAGE_BUTTON_MIN_ROOM_XPATH);
        super.buttonAddAdult = $$x(HOTEL_PAGE_BUTTON_ADD_MIN_XPATH).get(0);
        super.buttonMinAdult = $$x(HOTEL_PAGE_BUTTON_ADD_MIN_XPATH).get(1);
        super.buttonAddChildren = $$x(HOTEL_PAGE_BUTTON_ADD_MIN_XPATH).get(2);
        super.buttonMinChildren = $$x(HOTEL_PAGE_BUTTON_ADD_MIN_XPATH).get(3);
        super.buttonDone = $x(HOTEL_PAGE_BUTTON_DONE_XPATH);
    }

    @Override
    public void setNumberOfRooms(String amountRoom) {
        super.setInitialValue(Integer.parseInt(textAmountRooms.getText().substring(4,5)));
        super.setTotalValue(Integer.parseInt(amountRoom));
        super.setValue(buttonAddRoom, buttonMinRoom);
    }
}
