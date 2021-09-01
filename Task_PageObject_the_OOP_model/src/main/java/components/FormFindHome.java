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

    private final SelenideElement inputLocation = $(By.xpath(HOME_PAGE_INPUT_LOCATION_XPATH));
    private final SearchOptions searchOptions = new SearchOptionsHome();
}
