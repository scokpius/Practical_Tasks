package page;

import com.codeborne.selenide.Condition;
import components.FormFindHotel;
import components.Header;
import lombok.Getter;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static constant.XPathCSS.*;
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
        return this;
    }

    public void waitForUpdateHotelPage() {
        $(By.xpath(HOTEL_PAGE)).shouldBe(Condition.visible, Duration.ofSeconds(5));
    }

}
