package page;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$x;
import static constant.XPathCSS.*;

@Data
public class RoomInformationPage {

    private final SelenideElement imgPhoto = $x(IMG_PHOTO_XPATH);
    private final SelenideElement fielderNameRoom =  $x(FIELD_NAME_ROOM_XPATH);
    private final SelenideElement spanArea = $x(SPAN_AREA_XPATH);
    private final SelenideElement spanSleepers= $x(SPAN_SLEEPERS_XPATH);
    private final SelenideElement spanBeds= $x(SPAN_BEDS_XPATH);
    private final SelenideElement spanPricePerNight= $x(SPAN_PRICE_PER_NIGHT_XPATH);
    private final SelenideElement dropdownPrice= $x(DROPDOWN_PRICE_XPATH);
    private final SelenideElement spanPrice = $x(SPAN_PRICE_ALL_TIME_XPATH);

    public SelenideElement getSpanPrice() {
        dropdownPrice.click();
        return spanPrice;
    }


}
