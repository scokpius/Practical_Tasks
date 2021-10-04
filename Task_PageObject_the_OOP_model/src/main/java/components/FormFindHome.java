package components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import components.search_options.SearchOptions;
import components.search_options.SearchOptionsHome;
import lombok.Data;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static constant.XPathCSS.*;


@Data
public class FormFindHome {

    private final SelenideElement inputLocation = $x(HOME_PAGE_INPUT_LOCATION_XPATH);
    private List<SelenideElement> dropdownLocation;
    private final SearchOptions searchOptions = new SearchOptionsHome();

    public SelenideElement getDropdownLocation(String townName) {
        dropdownLocation = $$(String.format(HOME_PAGE_DROPDOWN_LOCATION_CSS, townName));
        return dropdownLocation.get(0);
    }

    public void waitDropdownElement(){
        $(".dropdown-menu").shouldBe(Condition.visible, Duration.ofSeconds(10));
    }

    public void cleanInputLocation(){
        $x(RESULTS_PAGE_INPUT_LOCATION_DELETE_XPATH).click();
    }

    public List<SelenideElement> getDropdownLocationText() {
        return $$(String.format(HOME_PAGE_DROPDOWN_TEXT_CSS));
    }
}
