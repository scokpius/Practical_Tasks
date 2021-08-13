package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static constant.XPathCSS.*;

public class HotelInformationPage {

    @FindBy(how = How.XPATH, using = IMG_LIST_PHOTOS_XPATH)
    private SelenideElement imgPhotos;
    @FindBy(how = How.XPATH, using = FIELD_NAME_HOTEL_XPATH)
    private SelenideElement fieldNameHotel;
    @FindBy(how = How.XPATH, using = INPUT_LOCATION_XPATH)
    private SelenideElement inputLocation;
    @FindBy(how = How.XPATH, using = SELECT_LIST_ROOMS_XPATH)
    private List<SelenideElement> selectListRooms;
    @FindBy(how = How.XPATH, using = LINK_MORE_DETAILS_XPATH)
    private List<SelenideElement> linkMoreDetails;


    public boolean getIsPhotos() {
        return imgPhotos.isDisplayed();

    }

    public RoomInformationPage selectRoom() {
        selectListRooms.get(0).should();
        linkMoreDetails.get(0);
        return new RoomInformationPage();
    }

    public String getNameHotel() {
        return fieldNameHotel.getText();
    }

    public String getLocation() {
        return inputLocation.getText();
    }
}
