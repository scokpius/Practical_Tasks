package components.guests;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;

public class GuestsHotelInformation extends Guests{

    public GuestsHotelInformation(SelenideElement buttonGuests) {
        super.buttonGuests = buttonGuests;
        super.textAmountRooms = $(By.xpath(HOME_PAGE_TEXT_AMOUNT_ROOM_XPATH));
        super.textAmountAdult = $(By.xpath(HOME_PAGE_TEXT_AMOUNT_ADULT_XPATH));
        super.textAmountChildren = $(By.xpath(HOME_PAGE_TEXT_AMOUNT_CHILDREN_XPATH));
        super.buttonAddRoom = $(String.format(HOTEL_INFORMATION_PAGE_BUTTON_ADD_MIN_XPATH, 1, 2));
        super.buttonMinRoom = $(String.format(HOTEL_INFORMATION_PAGE_BUTTON_ADD_MIN_XPATH, 1, 1));
        super.buttonAddAdult = $(String.format(HOTEL_INFORMATION_PAGE_BUTTON_ADD_MIN_XPATH, 2, 2));
        super.buttonMinAdult = $(String.format(HOTEL_INFORMATION_PAGE_BUTTON_ADD_MIN_XPATH, 2, 1));
        super.buttonAddChildren = $(String.format(HOTEL_INFORMATION_PAGE_BUTTON_ADD_MIN_XPATH, 3, 2));
        super.buttonMinChildren = $(String.format(HOTEL_INFORMATION_PAGE_BUTTON_ADD_MIN_XPATH, 3, 1));
        super.buttonDone = $(By.xpath(HOTEL_INFORMATION_PAGE_BUTTON_DONE_XPATH));
    }
}
