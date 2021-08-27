package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import components.search_options.SearchOptions;
import components.search_options.SearchOptionsResultsSearchPage;
import lombok.Getter;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static constant.XPathCSS.*;
@Getter
public class ResultsSearchPage {

    private final List<SelenideElement> listNameHotel = $$(By.xpath(SELECT_LIST_NAME_HOTEL_RESULT_SEARCH_XPATH));
    private final List<SelenideElement> listLinkHotel = $$(By.xpath(SELECT_LIST_LINK_HOTEL_RESULT_SEARCH_XPATH));
    private final SelenideElement buttonStandardRateHotels = $(By.xpath(BUTTON_STANDARD_RATE_HOTELS_XPATH));
    private final SelenideElement buttonContinue = $(By.xpath(BUTTON_CONTINUE_XPATH));
    private final SelenideElement inputLocation  = $(By.xpath(RESULTS_PAGE_INPUT_LOCATION_XPATH));
    private final SearchOptions searchOptions= new SearchOptionsResultsSearchPage();

    public ResultsSearchPage clickStandardRateHotels() {
        waitDisableElement(SELECT_LIST_LINK_HOTEL_RESULT_SEARCH_XPATH);
        buttonStandardRateHotels.click();
        return this;
    }

    public RoomInformationPage clickButtonContinue() {
        buttonContinue.click();
       return new  RoomInformationPage();
    }

    public List<SelenideElement> getListNameHotel() {
        return listNameHotel;
    }

    public ResultsSearchPage waitForPageLoaded() {
        Configuration.timeout = 30000;
        return this;
    }

    public void waitDisableElement(String locator) {
        $(By.xpath(locator)).shouldBe(Condition.exist);
    }
}
