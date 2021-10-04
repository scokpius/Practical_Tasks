package page;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static constant.XPathCSS.*;

@Data
public class HotelInformationPage {

    private final List<SelenideElement> imgListPhotos = $$x(IMG_LIST_PHOTOS_XPATH);
    private final SelenideElement fieldNameHotel = $x(FIELD_NAME_HOTEL_XPATH);
    private final SelenideElement fieldLocation = $x(FIELD_LOCATION_XPATH);
    private final List<SelenideElement> listNameRooms = $$x(SELECT_LIST_NAME_ROOMS_XPATH);
    private final List<SelenideElement> linkMoreDetails = $$x(LINK_MORE_DETAILS_XPATH);

    public boolean getIsPhotos() {
        return imgListPhotos.get(0).isDisplayed();
    }

    public RoomInformationPage selectRoom(int index) {
        linkMoreDetails.get(index).click();
        return new RoomInformationPage();
    }

    public HotelInformationPage waitForUpdateHotelInformationPage() {
        Configuration.timeout = 10000;
        return this;
    }

    public void clickLocationTab() {
        $x(TAB_LOCATION_XPATH).click();
    }
}
