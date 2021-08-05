package components;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;
import static constant.XPathCSS.*;

public class Menu {

  public String menuNavigation() {   // локатор элемента списка
        return  $$(By.xpath(LINK_LIST_MENU_XPATH)).get(0).getAttribute("href");
    }

}
