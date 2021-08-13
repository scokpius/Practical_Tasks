package components;

import com.codeborne.selenide.SelenideElement;
import components.search_options.SearchOptions;
import components.search_options.SearchOptionsHotels;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;

public class FormFindHotel {

    private final SelenideElement inputLocation = $(By.xpath(HOTEL_PAGE_INPUT_LOCATION_XPATH));
    private final SearchOptions searchOptions = new SearchOptionsHotels();

    public SelenideElement getInputLocation() {
        return inputLocation;
    }


}
