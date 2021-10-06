package page;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import lombok.Data;
import org.apache.commons.lang3.time.DateUtils;
import org.openqa.selenium.Cookie;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

    public RoomInformationPage goToRoomInformationPage() {
        RoomInformationPage roomInformationPage = new RoomInformationPage();
    //    Selenide.sleep(10000);
        WebDriverRunner.getWebDriver().manage().deleteCookieNamed("ak_bmsc");
        WebDriverRunner.getWebDriver().manage().addCookie(new Cookie("ak_bmsc",
                "5949BB4D1CE164DBFF9FA3CE76ECB53C~000000000000000000000000000000~YAAQX/1zPmwO7PB6AQAAGMn" +
                        "MCgzyo4OhFNpAH7LQrwG7EcgwjNEGjvPmn04RrImfbgmSN25chB6KKLX2C1aA9zPbwa3SlXLeKkdob4eVLY89H" +
                        "znNU+1T6Z9074XclZiiMnyosqb1iFD0VTx2X1wdV8o9+5kr/ubVWojXdDU52goQJPLXGq3nzS9VLP2cc+bFbhwa" +
                        "2kL9cbLFd6w0Vf4IsonRm9z+YrGslWFyqyVbjGpfbC0JsYKI2VXVRII5wC3LCenCeCj8XAIrMPKIlC6tX22VOeKW" +
                        "iYBQRqs27DUHf6Y5sAwSc9oEHMvClJVeC43qlB2LkJD9Wz9sRr9TCJKbunUn2Z44NZwaJrDKWgVfXRlW3B1pzy3Ta" +
                        "lZH97jqCafIKLtJqV7cfkWnqhqS60Jc1yHnW+abZHxJlgQnNM5VF6r8ctfml5cytg6FuU5uS1CDb+16AyGxbFdY8Z" +
                        "7RJAAjLPfbBjMMz0G7MCLetfNs3vR5oQRwNdcJT0RyaqVBP8TS",
                ".hotwire.com", "/", DateUtils.addHours(new Date(), 2)));
        WebDriverRunner.getWebDriver().manage().timeouts().pageLoadTimeout(10000,
                TimeUnit.MILLISECONDS);
        return roomInformationPage;
    }

    public HotelInformationPage waitForUpdateHotelInformationPage() {
        Configuration.timeout = 10000;
        return this;
    }

    public void clickLocationTab() {
        $x(TAB_LOCATION_XPATH).click();
    }
    public void clickRoomTab() {
        $x(TAB_ROOM_XPATH).click();
    }

    public void selectRoom (String roomName){
        waitForUpdateHotelInformationPage();
        for (int i = 0; i < getListNameRooms().size(); i++) {
            if (roomName.equals(getListNameRooms().get(i).getText())){
                linkMoreDetails.get(i).click();
                break;
            }
        }
    }
}
