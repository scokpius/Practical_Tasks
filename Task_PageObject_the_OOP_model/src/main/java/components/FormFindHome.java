package components;

import com.codeborne.selenide.SelenideElement;
import components.search_options.SearchOptions;
import components.search_options.SearchOptionsHome;
import lombok.Data;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static constant.XPathCSS.*;


@Data
public class FormFindHome {

    private final SelenideElement inputLocation = $(By.xpath(HOME_PAGE_INPUT_LOCATION_XPATH));
    private List<SelenideElement> dropdownLocation;
    private final SearchOptions searchOptions = new SearchOptionsHome();

    public SelenideElement getDropdownLocationClick(String townName) {
        dropdownLocation = $$(String.format(HOME_PAGE_DROPDOWN_LOCATION_CSS, townName));
        return dropdownLocation.get(0);
    }

    public List<SelenideElement> getDropdownLocationText() {
        return $$(String.format(HOME_PAGE_DROPDOWN_TEXT_CSS));
    }
}
