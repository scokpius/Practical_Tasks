package page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HotelInformationPage {

    public static final String FIGURE_PHOTOS_CSS = "#Overview > div > div";
    public static final String FIELD_NAME_HOTEL_XPATH = "//*[@class=\"uitk-heading-3\"]";
    public static final String INPUT_LOCATION_XPATH = " //*[@itemprop=\"address\"]";
    public static final String SELECT_LIST_ROOMS_CSS = "#Offers > span > div:nth-child(3) > div>div";
    public static final String LINK_MORE_DETAILS = "//*[@id=\"Offers\"]/span/div[3]/div/div[3]/div[1]/div/button";


    public boolean getIsPhotos() {
        return  $(FIGURE_PHOTOS_CSS).isDisplayed();

    }

    public RoomInformationPage selectRoom() {
        $$(SELECT_LIST_ROOMS_CSS).get(0).should();
        $$(LINK_MORE_DETAILS).get(0);
    return new RoomInformationPage();
    }

    public String getNameHotel(){
        return $(By.xpath(FIELD_NAME_HOTEL_XPATH)).getText();
    }

    public String getLocation(){
        return $(INPUT_LOCATION_XPATH).getText();
    }


}
