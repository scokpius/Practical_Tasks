package components;

import com.codeborne.selenide.SelenideElement;
import components.search_options.SearchOptions;
import components.search_options.SearchOptionsHome;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;

public class FormFindHome {

    private SelenideElement inputLocation = $(HOME_PAGE_INPUT_LOCATION_XPATH);
    private SearchOptions searchOptions = new SearchOptionsHome();
}
