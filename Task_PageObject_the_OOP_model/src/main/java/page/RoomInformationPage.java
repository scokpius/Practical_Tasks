package page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RoomInformationPage {

    public static final String FIGURE_PHOTOS_XPATH = "//*[@id=\"app-layer-room-info-201940577\"]//figure/div/img";
    public static final String FIELD_NAME_ROOM = "//*[@id=\"app-layer-room-info-201940577\"]//*[@data-stid=\"property-offers-details-dialog-header\"]/h3";
    public static final String SPAN_AREA = "//*[@id=\"app-layer-room-info-201940577\"]//div[2]/ul/li[1]";
    public static final String SPAN_SLEEPERS = "//*[@id=\"app-layer-room-info-201940577\"]//div[2]/ul/li[2]";
    public static final String SPAN_BEDS = "//*[@id=\"app-layer-room-info-201940577\"]//div[2]/ul/li[3]";

    public boolean getIsFieldNameRoom() {
        return $(By.xpath(FIGURE_PHOTOS_XPATH)).isDisplayed();

    }

    public RoomInformationPage enterTheSite(String locator) {
        open(locator);
        return new RoomInformationPage();
    }

    public void getFieldNameRoom() {
        $(By.xpath(FIELD_NAME_ROOM)).getText();
    }

    public void getArea() {
        $(By.xpath(SPAN_AREA)).getText();
    }


    public void getNumberSleepers() {
        $(By.xpath(SPAN_SLEEPERS)).getText();
    }

    public void getNumberBeds() {
        $(By.xpath(SPAN_BEDS)).getText();
    }
}
