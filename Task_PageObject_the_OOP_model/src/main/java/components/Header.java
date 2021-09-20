package components;

import lombok.Data;
import org.openqa.selenium.By;
import page.DialogCreateAccount;
import page.DialogSingIn;
import page.HotelsPage;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;

@Data
public class Header {

    private final DialogSingIn dialogSingIn;
    private final DialogCreateAccount dialogCreateAccount;
    private final DropdownMenu dropdownAccount;
    private final DropdownMenu dropdownCurrency;
    private final Menu menu;

    public Header() {
        dialogSingIn = new DialogSingIn();
        dialogCreateAccount = new DialogCreateAccount();
        dropdownCurrency = new DropdownMenu(BUTTON_CURRENCY_XPATH, BUTTON_CURRENCY_CONTAINER_XPATH);
        dropdownAccount = new DropdownMenu(BUTTON_ACCOUNT_XPATH, BUTTON_ACCOUNT_CONTAINER_XPATH);
        menu = new Menu();
    }

    public void clickSingIn(String locator, String email, String password) {
        $(By.xpath(locator)).click();
        dialogSingIn.logInAccount(email, password);
    }

    public void clickSingUp(String locator, String firstName, String lastName, String email, String password) {
        $(By.xpath(locator)).click();
        dialogCreateAccount.registerAnAccount(firstName, lastName, email, password);
    }

    public void chooseElement(String element, DropdownMenu dropdownMenu) {
        dropdownMenu.selectFromDropdownMenu(element);
        $(By.xpath(element)).click();
    }

    public String verifyCurrency(){
      return  $(By.xpath(BUTTON_CURRENCY_VERIFY_ELEMENTS_XPATH)).getText();
    }

    public HotelsPage clickButtonHotelsMenu() {
        menu.getButtonMenu().click();
        return new HotelsPage();
    }


}
