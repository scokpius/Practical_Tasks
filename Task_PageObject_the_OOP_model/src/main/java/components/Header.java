package components;

import lombok.Data;
import page.DialogCreateAccount;
import page.DialogSingIn;
import page.HotelsPage;

import static com.codeborne.selenide.Selenide.$x;
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
        $x(locator).click();
        dialogSingIn.logInAccount(email, password);
    }

    public void clickSingUp(String locator, String firstName, String lastName, String email, String password) {
        $x(locator).click();
        dialogCreateAccount.registerAnAccount(firstName, lastName, email, password);
    }

    public void chooseElement(String element, DropdownMenu dropdownMenu) {
        dropdownMenu.selectFromDropdownMenu(element);
        $x(element).click();
    }

    public String verifyCurrency(){
      return  $x(BUTTON_CURRENCY_VERIFY_ELEMENTS_XPATH).getText();
    }

    public HotelsPage clickButtonHotelsMenu() {
        menu.getButtonMenu().click();
        return new HotelsPage();
    }


}
