package components;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static constant.XPathCSS.*;

public class FunctionMenu {

    private final List<SelenideElement> elementList = $$(By.xpath(HOME_PAGE_LIST_FUNCTIONS_XPATH));
    private FormFindHotel formFindHotel;

    public void functionMenuNavigation(String name) {
        for (int i = 0; i < elementList.size(); i++) {
            if (elementList.get(i).getText() == name) {
                elementList.get(i).click();
            }
        }
    }
}
