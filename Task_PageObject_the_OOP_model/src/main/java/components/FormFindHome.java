package components;

import com.codeborne.selenide.SelenideElement;
import components.search_options.SearchOptions;
import components.search_options.SearchOptionsHome;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;

@Getter
public class FormFindHome {

    private final SelenideElement inputLocation;
    private final SearchOptions searchOptions;

    public FormFindHome() {
        this.inputLocation = $(By.xpath(HOME_PAGE_INPUT_LOCATION_XPATH));
        this.searchOptions = new SearchOptionsHome();
    }

    public SearchOptions getSearchOptions() {
        return searchOptions;
    }
}
