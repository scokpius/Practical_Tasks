package components;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$x;
import static constant.XPathCSS.BUTTON_HOTELS_MENU_XPATH;

@Data
public class Menu {
    private final SelenideElement buttonMenu = $x(BUTTON_HOTELS_MENU_XPATH);

    public SelenideElement getButtonMenu() {
        return buttonMenu;
    }
}
