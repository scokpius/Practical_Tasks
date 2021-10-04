package components;

import com.codeborne.selenide.SelenideElement;
import components.search_options.SearchOptions;
import components.search_options.SearchOptionsHotels;
import lombok.Data;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;
import static constant.XPathCSS.*;

@Data
public class FormFindHotel {
    private final SelenideElement buttonLocation = $x(HOTEL_PAGE_INPUT_LOCATION_BUTTON_XPATH);
    private final SelenideElement inputLocation = $x(HOTEL_PAGE_INPUT_LOCATION_XPATH);
    private final SearchOptions searchOptions = new SearchOptionsHotels();
    private List<SelenideElement> dropdownLocation  = $$(HOTEL_PAGE_DROPDOWN_LOCATION_CSS);;

    public void getElementDropdownLocationClick() {
        dropdownLocation = $$(HOTEL_PAGE_DROPDOWN_LOCATION_CSS);
        dropdownLocation.get(1).pressEnter();
    }

    public void  clickButtonLocation(){
        $x(HOTEL_PAGE_INPUT_LOCATION_BUTTON_XPATH).click();
    }
}
