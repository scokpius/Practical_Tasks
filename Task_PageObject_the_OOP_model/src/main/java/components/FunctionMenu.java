package components;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static constant.XPathCSS.HOME_PAGE_LIST_FUNCTIONS_XPATH;

@Getter
public class FunctionMenu {

    private final List<SelenideElement> elementList = $$(By.xpath(HOME_PAGE_LIST_FUNCTIONS_XPATH));
    private final FormFindHome formFindHome = new FormFindHome();

    public void functionMenuNavigation(String name) {
        for (int i = 0; i < elementList.size(); i++) {
            if (elementList.get(i).getText().equals(name)) {
                elementList.get(i).click();
            }
        }
    }
}
