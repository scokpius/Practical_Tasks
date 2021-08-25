package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static constant.XPathCSS.*;
@Getter
public class ResultsSearchPage {

    private final List<SelenideElement> list = $$(By.xpath(SELECT_LIST_RESULT_SEARCH_XPATH));
    private final SelenideElement buttonStandardRateHotels = $(By.xpath(BUTTON_STANDARD_RATE_HOTELS_XPATH));
    private final SelenideElement buttonContinue = $(By.xpath(BUTTON_CONTINUE_XPATH));

    public ResultsSearchPage clickStandardRateHotels() {
        waitDisableElement(SELECT_LIST_RESULT_SEARCH_XPATH);
        buttonStandardRateHotels.click();
        return this;
    }

    public void clickButtonContinue() {
        buttonContinue.click();
    }

    public List<SelenideElement> getList() {
        return list;
    }

    public ResultsSearchPage waitForPageLoaded() {
        Configuration.timeout = 30000;
        return this;
    }

    public void waitDisableElement(String locator) {
        $(By.xpath(locator)).shouldBe(Condition.exist);
    }
}
