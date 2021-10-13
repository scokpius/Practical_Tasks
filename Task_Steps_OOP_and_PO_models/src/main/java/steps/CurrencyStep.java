package steps;


import object.Currency;
import page.HomePage;

import static constant.URL.HOTWIRE;

public class CurrencyStep {
    private static HomePage homePage = new HomePage();
    private static Currency changeCurrency = new Currency();

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
