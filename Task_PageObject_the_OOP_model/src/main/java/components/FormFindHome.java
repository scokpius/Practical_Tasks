package components;

import com.codeborne.selenide.SelenideElement;
import components.search_options.SearchOptions;
import components.search_options.SearchOptionsHome;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;

@Getter
public class FormFindHome {

    private SelenideElement inputLocation = $(HOME_PAGE_INPUT_LOCATION_XPATH);
    private SearchOptions searchOptions = new SearchOptionsHome();

    public SearchOptions getSearchOptions() {
        return searchOptions;
    }
}
