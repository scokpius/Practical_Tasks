package steps;


import page.HomePage;
import object.*;

import static constant.URL.HOTWIRE;

public class CurrencyStep {
    static HomePage homePage = new HomePage();
    static Currency changeCurrency = new Currency();

    /**
     * the method allows you to select any currency from the drop-down list
     * @param currency  the input parameter can be a currency code or a currency name
     * @return currency code
     */
    public static String changeCurrencyStep(String currency) {
        homePage.enterTheSite(HOTWIRE);
        homePage.chooseCurrency(currency);
        changeCurrency.setCode(homePage.getHeader().verifyCurrency());
        return  changeCurrency.getCode();
    }

}
