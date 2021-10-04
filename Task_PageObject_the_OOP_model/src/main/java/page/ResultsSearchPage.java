package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import components.search_options.SearchOptions;
import components.search_options.SearchOptionsResultsSearchPage;
import lombok.Data;
import org.apache.commons.lang3.time.DateUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.*;
import static constant.XPathCSS.*;

@Data
public class ResultsSearchPage {

    private final List<SelenideElement> listCardHotel = $$(By.xpath(SELECT_LIST_CARD_HOTEL_RESULT_SEARCH_XPATH));
    private SelenideElement nameHotel;
    private SelenideElement classHotel;
    private SelenideElement sumPricePerNight;
    private SelenideElement codePricePerNight;
    private final List<SelenideElement> listLinkHotel = $$x(SELECT_LIST_LINK_HOTEL_RESULT_SEARCH_XPATH);
    private final List<SelenideElement> listTextLinkHotel = $$x(SELECT_LIST_LINK_TEXT_HOTEL_RESULT_SEARCH_XPATH);
    private final List<SelenideElement> listNameHotel = $$x(SELECT_LIST_NAME_HOTEL_RESULT_SEARCH_XPATH);

    private SelenideElement filterSortByButton = $(By.xpath(FILTER_SORT_BY_XPATH));
    private List<SelenideElement> filterSortByDropdown = $$(By.xpath(FILTER_SORT_BY_LIST_DROPDOWN_XPATH));
    private SelenideElement filterHotelClassButton = $(By.xpath(FILTER_HOTEL_STARS_BY_XPATH));
    private List<SelenideElement> filterHotelClassDropdown = $$(By.xpath(FILTER_HOTEL_STARS_LIST_DROPDOWN_XPATH));
    private List<SelenideElement> filterHotelClassDropdownText = $$(By.xpath(FILTER_HOTEL_STARS_LIST_DROPDOWN_TEXT_XPATH));
    private final SelenideElement buttonStandardRateHotels = $(By.xpath(BUTTON_STANDARD_RATE_HOTELS_XPATH));
    private final SelenideElement buttonContinue = $(By.xpath(BUTTON_CONTINUE_XPATH));
    private final SelenideElement inputLocation = $(By.xpath(RESULTS_PAGE_INPUT_LOCATION_XPATH));
    private final SelenideElement inputCheckIn = $(By.xpath(RESULTS_PAGE_BUTTON_CHECK_IN_XPATH));
    private final SelenideElement inputCheckOut = $(By.xpath(RESULTS_PAGE_BUTTON_CHECK_OUT_XPATH));
    private final SelenideElement inputGuest = $(By.xpath(RESULTS_PAGE_BUTTON_GUESTS_XPATH));

    private List<SelenideElement> dropdownLocation;
    private final SearchOptions searchOptions = new SearchOptionsResultsSearchPage();
    private String linkHotel;

    public ResultsSearchPage clickStandardRateHotels() {
        waitDisableElement(BUTTON_STANDARD_RATE_HOTELS_XPATH);
        buttonStandardRateHotels.click();
        return this;
    }

    public void cleanInputLocation() {
        $x(RESULTS_PAGE_INPUT_LOCATION_DELETE_XPATH).click();
    }

    public void closeBlueToptill() {
        $x("//*[@class=\"SVGIcon SVGIcon--16px SVGIcon--inline\"]").click();
    }

    public SelenideElement getDropdownLocationClick(String townName) {
        dropdownLocation = $$(String.format(RESULTS_PAGE_DROPDOWN_LOCATION_CSS, townName));
        return dropdownLocation.get(0);
    }

    public String getTextFromLocationField() {
        return getInputLocation().getAttribute("value");
    }
    public String getTextFromCheckInField() {
        return $x(RESULTS_PAGE_BUTTON_CHECK_IN_TEXT_XPATH).getAttribute("value");
    }

    public String getTextFromCheckOutField() {
        return $x(RESULTS_PAGE_BUTTON_CHECK_OUT_TEXT_XPATH).getAttribute("value");
    }
    public String getTextFromGuestsField() {
        return $x(RESULTS_PAGE_BUTTON_GUESTS_TEXT_XPATH ).getAttribute("value");
    }

    public SelenideElement getNameHotel(int index) {
        return $x(String.format(NAME_HOTEL_RESULT_SEARCH_XPATH, index));
    }

    public List<SelenideElement> getClassHotel(int index) {
        return $$x(String.format(CLASS_HOTEL_RESULT_SEARCH_XPATH, index));
    }

    public SelenideElement getSumPricePerNight(int index) {
        return $(By.xpath(String.format(SUM_PER_NIGHT_RESULT_SEARCH_XPATH, index)));
    }

    public SelenideElement getCodePricePerNight(int index) {
        return $(By.xpath(String.format(CODE_PER_NIGHT_RESULT_SEARCH_XPATH, index)));
    }

    public void selectHotel(String hotelName){
        int i = 0;
        while (i < listNameHotel.size()) {
            if(listNameHotel.get(i).getText().equals(hotelName)) {
                listLinkHotel.get(i).click();
                linkHotel = listTextLinkHotel.get(i).getAttribute("href");
                break;
            }
            i++;
        }
    }

    public HotelInformationPage goToHotelInformationPage() {
        buttonContinue.click();
        switchTo().window(1);
        HotelInformationPage hotelInformationPage = new HotelInformationPage();
        Selenide.sleep(20000);
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
        return hotelInformationPage;
    }

    public ResultsSearchPage waitForPageLoaded() {
        Selenide.sleep(10000);
        return this;
    }

    public void waitDisableElement(String locator) {
        Selenide.Wait().withTimeout(Duration.ofSeconds(20));
        $x(locator).shouldBe(Condition.exist);
    }

}
