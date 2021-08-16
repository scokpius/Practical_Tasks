package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.open;
import static constant.XPathCSS.*;

public class RoomInformationPage {

    @FindBy(how = How.XPATH, using = IMG_PHOTO_XPATH)
    private SelenideElement imgPhoto;
    @FindBy(how = How.XPATH, using = FIELD_NAME_ROOM_XPATH)
    private SelenideElement fielderNameRoom;
    @FindBy(how = How.XPATH, using = SPAN_AREA_XPATH)
    private SelenideElement spanArea;
    @FindBy(how = How.XPATH, using = SPAN_SLEEPERS_XPATH)
    private SelenideElement spanSleepers;
    @FindBy(how = How.XPATH, using = SPAN_BEDS_XPATH)
    private SelenideElement spanBeds;
    @FindBy(how = How.XPATH, using = SPAN_PRICE_PER_NIGHT_XPATH)
    private SelenideElement spanPricePerNight;
    @FindBy(how = How.XPATH, using = DROPDOWN_PRICE_XPATH)
    private SelenideElement dropdownPrice;
    @FindBy(how = How.XPATH, using = SPAN_PRICE_ALL_TIME_XPATH)
    private SelenideElement spanPrice;


    public boolean getIsFieldNameRoom() {
        return imgPhoto.isDisplayed();

    }

    public RoomInformationPage enterTheSite(String locator) {
        open(locator);
        return new RoomInformationPage();
    }

    public void getFieldNameRoom() {
        fielderNameRoom.getText();
    }

    public void getArea() {
        spanArea.getText();
    }

    public void getNumberSleepers() {
        spanSleepers.getText();
    }

    public void getNumberBeds() {
        spanBeds.getText();
    }

    public void getSpanPricePerNight() {
        spanPricePerNight.getText();
    }

    public void getSpanPrice() {
        dropdownPrice.click();
        spanPrice.getText();
    }
}
