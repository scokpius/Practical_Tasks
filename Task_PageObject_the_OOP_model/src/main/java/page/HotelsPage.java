package page;

import com.codeborne.selenide.Condition;
import components.FormFindHotel;
import org.openqa.selenium.By;
import components.Header;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static constant.XPathCSS.*;

public class HotelsPage extends FormFindHotel {

    public Header header;

    public HotelsPage() {
        super(HOTEL_PAGE_INPUT_LOCATION_XPATH,
                HOTEL_PAGE_BUTTON_CHECK_IN_XPATH,
                HOTEL_PAGE_BUTTON_CHECK_OUT_XPATH,
                HOTEL_PAGE_BUTTON_GUESTS_XPATH,
                HOTEL_PAGE_BUTTON_GUESTS_DROPDOWN_XPATH,
                HOTEL_PAGE_BUTTON_FIND_XPATH,
                HOTEL_PAGE_DROPDOWN_CALENDAR_XPATH,
                HOTEL_PAGE_BUTTON_PREV_MONTH_XPATH,
                HOTEL_PAGE_BUTTON_NEXT_MONTH_XPATH,
                HOTEL_PAGE_TEXT_MONTH_XPATH,
                HOTEL_PAGE_TEXT_DAY_XPATH,
                HOTEL_PAGE_DROPDOWN_TEXT_AMOUNT_XPATH,
                HOTEL_PAGE_BUTTON_ADD_MIN_XPATH,
                HOTEL_PAGE_BUTTON_DONE_XPATH);
        header = new Header();
    }

    public HotelsPage goToHotelPage(String locator) {
        open(locator);
        return this;
    }

    public void waitForUpdateHotelPage() {
        $(By.xpath("//*[@role=\"main\"]/div/div[3]/div[2]")).shouldBe(Condition.visible, Duration.ofSeconds(5));
        new HotelsPage();
    }
}
