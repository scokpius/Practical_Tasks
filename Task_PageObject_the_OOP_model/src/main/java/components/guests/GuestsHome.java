package components.guests;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;

public class GuestsHome extends Guests{

    private final SelenideElement textAmountRoomsHotels = $(By.xpath(HOME_PAGE_TEXT_AMOUNT_ROOM_XPATH));
    private final SelenideElement textAmountAdultHotels = $(By.xpath(HOME_PAGE_TEXT_AMOUNT_ADULT_XPATH));
    private final SelenideElement textAmountChildrenHotels = $(By.xpath(HOME_PAGE_TEXT_AMOUNT_CHILDREN_XPATH));
    private final String buttonAddAndMinHotels = HOME_PAGE_BUTTON_ADD_MIN_XPATH;
    private final SelenideElement buttonDoneHotels = $(By.xpath(HOME_PAGE_BUTTON_DONE_XPATH));

    public GuestsHome(SelenideElement buttonGuests) {
        super.buttonGuests = buttonGuests;
        super.textAmountRooms = textAmountRoomsHotels;
        super.textAmountAdult = textAmountAdultHotels;
        super.textAmountChildren = textAmountChildrenHotels;
        super.buttonAddRoom = $(String.format(buttonAddAndMinHotels, 1, 2));
        super.buttonMinRoom = $(String.format(buttonAddAndMinHotels, 1, 1));
        super.buttonAddAdult = $(String.format(buttonAddAndMinHotels, 2, 2));
        super.buttonMinAdult = $(String.format(buttonAddAndMinHotels, 2, 1));
        super.buttonAddChildren = $(String.format(buttonAddAndMinHotels, 3, 2));
        super.buttonMinChildren = $(String.format(buttonAddAndMinHotels, 3, 1));
        super.buttonDone = buttonDoneHotels;
    }
}
