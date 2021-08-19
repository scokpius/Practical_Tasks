package components;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static constant.XPathCSS.LINK_LIST_MENU_XPATH;
@Getter
public class Menu {

    @FindBy(how = How.XPATH, using = LINK_LIST_MENU_XPATH)
    private List<SelenideElement> linkListMenu;

  public String menuNavigation() {   // локатор элемента списка
        return  linkListMenu.get(0).getAttribute("href");
    }

}
