package components.guests;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static constant.XPathCSS.*;

public class GuestsHotels extends Guests {

    public GuestsHotels(SelenideElement buttonGuests) {
        super.buttonGuests = buttonGuests;
        super.textAmountRooms = $(By.xpath(HOTEL_PAGE_TEXT_AMOUNT_ROOM_XPATH));
        super.textAmountAdult = $(By.xpath(HOTEL_PAGE_TEXT_AMOUNT_ADULT_XPATH));
        super.textAmountChildren = $(By.xpath(HOTEL_PAGE_TEXT_AMOUNT_CHILDREN_XPATH));
        super.buttonAddRoom = $(By.xpath(HOTEL_PAGE_BUTTON_ADD_ROOM_XPATH));
        super.buttonMinRoom = $(By.xpath(HOTEL_PAGE_BUTTON_MIN_ROOM_XPATH));
        super.buttonAddAdult = $$(HOTEL_PAGE_BUTTON_ADD_MIN_XPATH).get(0);
        super.buttonMinAdult = $$(HOTEL_PAGE_BUTTON_ADD_MIN_XPATH).get(1);
        super.buttonAddChildren = $$(HOTEL_PAGE_BUTTON_ADD_MIN_XPATH).get(2);
        super.buttonMinChildren = $$(HOTEL_PAGE_BUTTON_ADD_MIN_XPATH).get(3);
        super.buttonDone = $(By.xpath(HOTEL_PAGE_BUTTON_DONE_XPATH));
    }

    @Override
    public void setNumberOfRooms(String amountRoom) {
        super.setInitialValue(Integer.parseInt(textAmountRooms.getText().substring(5,6)));
        super.setTotalValue(Integer.parseInt(amountRoom));
        super.setValue(buttonAddRoom, buttonMinRoom);
    }
}
