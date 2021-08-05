package components;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;
import static constant.XPathCSS.*;

public class FunctionMenu {

    public FormFindHotel formFindHotel;

    public void functionMenuNavigation() {
        $$(By.xpath(HOME_PAGE_LIST_FUNCTIONS_XPATH)).get(0).click();
    }
}
