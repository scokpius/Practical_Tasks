package components;

import com.codeborne.selenide.SelenideElement;
import components.search_options.SearchOptions;
import components.search_options.SearchOptionsHotels;
import lombok.Data;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static constant.XPathCSS.*;

@Data
public class FormFindHotel {
    private final SelenideElement buttonLocation = $(By.xpath(HOTEL_PAGE_INPUT_LOCATION_BUTTON_XPATH));
    private final SelenideElement inputLocation = $(By.xpath(HOTEL_PAGE_INPUT_LOCATION_XPATH));
    private final SearchOptions searchOptions = new SearchOptionsHotels();
    private List<SelenideElement> dropdownLocation;

    public SelenideElement getDropdownLocationClick(String townName) {
        dropdownLocation = $$(String.format(HOTEL_PAGE_DROPDOWN_LOCATION_CSS, townName));
        return dropdownLocation.get(0);
    }

    public void  clickButtonLocation(){
        $(By.xpath(HOTEL_PAGE_INPUT_LOCATION_BUTTON_XPATH)).click();
    }
}
