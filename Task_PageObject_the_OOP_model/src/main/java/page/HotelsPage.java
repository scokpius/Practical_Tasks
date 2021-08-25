package page;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import components.FormFindHotel;
import components.Header;
import lombok.Getter;
import org.apache.commons.lang3.time.DateUtils;
import org.openqa.selenium.Cookie;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.open;

@Getter
public class HotelsPage {

    private final Header header;
    private final FormFindHotel formFindHotel;

    public HotelsPage() {
        header = new Header();
        formFindHotel = new FormFindHotel();
    }

    public HotelsPage goToHotelPage(String locator) {
        open(locator);
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

        waitForUpdateHotelPage();
        return this;
    }

    public HotelsPage waitForUpdateHotelPage() {
        Configuration.timeout = 10000;
        return this;
    }
}
