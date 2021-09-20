package components;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.BUTTON_HOTELS_MENU_XPATH;

@Data
public class Menu {
    private final SelenideElement buttonMenu = $(By.xpath(BUTTON_HOTELS_MENU_XPATH));

    public SelenideElement getButtonMenu() {
        return buttonMenu;
    }
}
