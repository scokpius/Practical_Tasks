package page;

import com.codeborne.selenide.SelenideElement;
import components.search_options.SearchOptions;
import components.search_options.SearchOptionsHotelInformation;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static constant.XPathCSS.*;

public class HotelInformationPage {

    @FindBy(how = How.XPATH, using = IMG_LIST_PHOTOS_XPATH)
    private List<SelenideElement> imgPhotos;
    @FindBy(how = How.XPATH, using = FIELD_NAME_HOTEL_XPATH)
    private SelenideElement fieldNameHotel;
    @FindBy(how = How.XPATH, using = INPUT_LOCATION_XPATH)
    private SelenideElement inputLocation;
    @FindBy(how = How.XPATH, using = SELECT_LIST_ROOMS_XPATH)
    private List<SelenideElement> selectListRooms;
    @FindBy(how = How.XPATH, using = LINK_MORE_DETAILS_XPATH)
    private List<SelenideElement> linkMoreDetails;

    private SearchOptions searchOptionsHotelInformation = new SearchOptionsHotelInformation();


    public boolean getIsPhotos() {
        if (imgPhotos.size()==0) return false;
        return true;
    }

    public RoomInformationPage selectRoom(int selectedRoom) {
        selectListRooms.get(selectedRoom).should();
        linkMoreDetails.get(selectedRoom);
        return new RoomInformationPage();
    }

    public String getNameHotel() {
        return fieldNameHotel.getText();
    }

    public String getLocation() {
        return inputLocation.getText();
    }

    public void getCheckIn(String month, String day, String yer) {
        searchOptionsHotelInformation.chooseCheckInDate(month, day, yer);
    }

    public void getCheckOut(String month, String day, String yer) {
        searchOptionsHotelInformation.chooseCheckInDate(month, day, yer);
    }

    public void getGuests(String numberRooms, String numberAdult, String numberChildren) {
        searchOptionsHotelInformation.chooseGuests(numberRooms, numberAdult, numberChildren);
    }
    public void clickButtonRates() {
        searchOptionsHotelInformation.clickButton();
    }

}
