package components.guests;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;

public class GuestsHotelInformation extends Guests{
    private final SelenideElement textAmountRoomsHotelInformation = $(By.xpath(HOME_PAGE_TEXT_AMOUNT_ROOM_XPATH));
    private final SelenideElement textAmountAdultHotelInformation = $(By.xpath(HOME_PAGE_TEXT_AMOUNT_ADULT_XPATH));
    private final SelenideElement textAmountChildrenHotelInformation = $(By.xpath(HOME_PAGE_TEXT_AMOUNT_CHILDREN_XPATH));
    private final String buttonAddMinHotelInformation = HOTEL_INFORMATION_PAGE_BUTTON_ADD_MIN_XPATH;
    private final SelenideElement buttonDoneHotelInformation= $(By.xpath(HOTEL_INFORMATION_PAGE_BUTTON_DONE_XPATH));

    public GuestsHotelInformation(SelenideElement buttonGuests) {
        super.buttonGuests = buttonGuests;
        super.textAmountRooms = textAmountRoomsHotelInformation;
        super.textAmountAdult = textAmountAdultHotelInformation;
        super.textAmountChildren = textAmountChildrenHotelInformation;
        super.buttonAddRoom = $(String.format(buttonAddMinHotelInformation, 1, 2));
        super.buttonMinRoom = $(String.format(buttonAddMinHotelInformation, 1, 1));
        super.buttonAddAdult = $(String.format(buttonAddMinHotelInformation, 2, 2));
        super.buttonMinAdult = $(String.format(buttonAddMinHotelInformation, 2, 1));
        super.buttonAddChildren = $(String.format(buttonAddMinHotelInformation, 3, 2));
        super.buttonMinChildren = $(String.format(buttonAddMinHotelInformation, 3, 1));
        super.buttonDone = buttonDoneHotelInformation;
    }
}
