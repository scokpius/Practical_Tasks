package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static constant.XPathCSS.*;

public class ResultsSearchPage {
    @FindBy(how = How.XPATH, using = SELECT_LIST_RESULT_SEARCH_XPATH)
    private List<SelenideElement> list;
    @FindBy(how = How.XPATH, using = BUTTON_STANDARD_RATE_HOTELS_XPATH)
    private SelenideElement buttonStandardRateHotels;
    @FindBy(how = How.XPATH, using = BUTTON_CONTINUE_XPATH)
    private SelenideElement buttonContinue;

    public void clickStandardRateHotels() {
        buttonStandardRateHotels.click();
    }

    public void clickButtonContinue() {
        buttonContinue.click();
    }

    public List<SelenideElement> getList() {
        return list;
    }
}
