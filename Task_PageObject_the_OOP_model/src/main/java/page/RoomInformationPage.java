package page;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;
@Getter
public class RoomInformationPage {


    private final SelenideElement imgPhoto = $(By.xpath(IMG_PHOTO_XPATH));
    private final SelenideElement fielderNameRoom =  $(By.xpath(FIELD_NAME_ROOM_XPATH));
    private final SelenideElement spanArea = $(By.xpath(SPAN_AREA_XPATH));
    private final SelenideElement spanSleepers= $(By.xpath(SPAN_SLEEPERS_XPATH));
    private final SelenideElement spanBeds= $(By.xpath(SPAN_BEDS_XPATH));
    private final SelenideElement spanPricePerNight= $(By.xpath(SPAN_PRICE_PER_NIGHT_XPATH));
    private final SelenideElement dropdownPrice= $(By.xpath(DROPDOWN_PRICE_XPATH));
    private final SelenideElement spanPrice = $(By.xpath(SPAN_PRICE_ALL_TIME_XPATH));

    public RoomInformationPage waitForUpdateRoomInformationPage() {
        Configuration.timeout = 10000;
        return this;
    }
    public SelenideElement getSpanPrice() {
        dropdownPrice.click();
        return spanPrice;
    }
}
