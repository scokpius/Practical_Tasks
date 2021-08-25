package components;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static constant.XPathCSS.LINK_LIST_MENU_XPATH;

@Getter
public class Menu {

    private final List<SelenideElement> linkListMenu = $$(By.xpath(LINK_LIST_MENU_XPATH)) ;

    public String menuNavigation(String nameButton) {
        int i = 0;
        while (true){
            if (linkListMenu.get(i).getText().equals(nameButton)){
                return  linkListMenu.get(i).getAttribute("href");
            } else {i++;}
        }
    }


}
