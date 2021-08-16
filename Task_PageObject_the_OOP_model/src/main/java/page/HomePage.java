package page;

import com.codeborne.selenide.WebDriverRunner;
import components.FunctionMenu;
import components.Header;
import lombok.Getter;
import org.apache.commons.lang3.time.DateUtils;
import org.openqa.selenium.Cookie;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.open;
import static constant.XPathCSS.*;

@Getter
public class HomePage {

    public Header header;
    private final FunctionMenu functionMenu;

    public HomePage() {
        header = new Header();
        functionMenu = new FunctionMenu();
    }

    public void enterTheSite(String locator) {
        open(locator);
        WebDriverRunner.getWebDriver().manage().deleteCookieNamed("ak_bmsc");
        WebDriverRunner.getWebDriver().manage().addCookie(new Cookie("ak_bmsc",
                "5949BB4D1CE164DBFF9FA3CE76ECB53C~000000000000000000000000000000~YAAQX/1zPmwO7PB6AQAAGMn" +
                        "MCgzyo4OhFNpAH7LQrwG7EcgwjNEGjvPmn04RrImfbgmSN25chB6KKLX2C1aA9zPbwa3SlXLeKkdob4eVLY89H" +
                        "znNU+1T6Z9074XclZiiMnyosqb1iFD0VTx2X1wdV8o9+5kr/ubVWojXdDU52goQJPLXGq3nzS9VLP2cc+bFbhwa" +
                        "2kL9cbLFd6w0Vf4IsonRm9z+YrGslWFyqyVbjGpfbC0JsYKI2VXVRII5wC3LCenCeCj8XAIrMPKIlC6tX22VOeKW" +
                        "iYBQRqs27DUHf6Y5sAwSc9oEHMvClJVeC43qlB2LkJD9Wz9sRr9TCJKbunUn2Z44NZwaJrDKWgVfXRlW3B1pzy3Ta" +
                        "lZH97jqCafIKLtJqV7cfkWnqhqS60Jc1yHnW+abZHxJlgQnNM5VF6r8ctfml5cytg6FuU5uS1CDb+16AyGxbFdY8Z" +
                        "7RJAAjLPfbBjMMz0G7MCLetfNs3vR5oQRwNdcJT0RyaqVBP8TS",
                ".hotwire.com", "/", DateUtils.addHours(new Date(), 2)));
        WebDriverRunner.getWebDriver().manage().timeouts().pageLoadTimeout(10000,
                TimeUnit.MILLISECONDS);
    }

    public void clickSingIN(String email, String password) {
        header.clickSingIn(HOME_PAGE_BUTTON_SING_UP_XPATH, email, password);
        new HomePage();
    }

    public void createAccount(String firstName, String lastName, String email, String password) {
        header.clickSingUp(HOME_PAGE_BUTTON_SING_IN_XPATH, firstName, lastName, email, password);
    }

    public void chooseCurrency() {
        header.chooseElement(BUTTON_CURRENCY_ELEMENTS_XPATH, header.getDropdownCurrency());
    }

    public void clickFunctionMenu(String nameFunction) {
        functionMenu.functionMenuNavigation(nameFunction);
    }




}



















    /*
    public void chooseSignOut() {
        header.chooseElement(BUTTON_ACCOUNT_ELEMENTS_XPATH, header.getDropdownAccount());
    }

    public void waitVisibleCurrency(String locator) {
        $(locator).shouldBe(Condition.visible);
    }

    public void waitDisableElement(String locator) {
        $(locator).shouldBe(Condition.disabled);
    }

    public void searchForHotel(String location, String monthIn, String dayIn, String yerIn,
                               String monthOut, String dayOut, String yerOut,
                               int room, int adult, int children) {
        super.writeFindSearch(location, monthIn, dayIn, yerIn, monthOut, dayOut, yerOut, room,
                adult, children);
        new ResultsSearchPage();
    }

    public void chooseFunction() {
        String locator = header.chooseFunction();
        new HotelsPage().goToHotelPage(locator).waitForUpdateHotelPage();

    }*/

