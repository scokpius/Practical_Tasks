package components;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.BUTTON_HOTELS_MENU_XPATH;

@Getter
public class Menu {
    private final SelenideElement buttonMenu = $(By.xpath(BUTTON_HOTELS_MENU_XPATH));
}
