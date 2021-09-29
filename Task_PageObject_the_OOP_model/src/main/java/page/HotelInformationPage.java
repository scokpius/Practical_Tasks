package page;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static constant.XPathCSS.*;

@Data
public class HotelInformationPage {

    private final List<SelenideElement>  imgListPhotos = $$(By.xpath(IMG_LIST_PHOTOS_XPATH));
    private final SelenideElement fieldNameHotel = $(By.xpath(FIELD_NAME_HOTEL_XPATH));
    private final SelenideElement inputLocation = $(By.xpath(INPUT_LOCATION_XPATH));
    private final SelenideElement buttonRooms = $(By.xpath(BUTTON_ROOMS_XPATH));
    private final List<SelenideElement> listClassHotel = $$(By.xpath(LIST_CLASS_HOTEL_XPATH));
    private final List<SelenideElement> listNameRooms = $$(SELECT_LIST_NAME_ROOMS_CSS);
    private final List<SelenideElement> linkMoreDetails = $$(By.xpath(LINK_MORE_DETAILS_XPATH));

    public RoomInformationPage selectRoom(int index) {
        linkMoreDetails.get(index).click();
        return new RoomInformationPage();
    }

    public HotelInformationPage waitForUpdateHotelInformationPage() {
        Configuration.timeout = 10000;
        return this;
    }

    public void clickButtonRooms(){
        buttonRooms.click();
    }

}
