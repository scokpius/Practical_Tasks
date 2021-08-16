package steps;

import page.HomePage;

import static constant.URL.HOTWIRE;

public class AccountSteps {
    HomePage homePage = new HomePage();

    public void createAccount() {
        homePage.enterTheSite(HOTWIRE);
        homePage.createAccount("Vasia", "Pupkin", "vasia_pupkin_mail00@mail.ru",
                "pass_WORD_2000");
    }

     public void checkThatTheUserIsLoggedIn() {
        homePage.enterTheSite(HOTWIRE);
        homePage.clickSingIN("lenka_107522@mail.ru", "201184");
    }


    public void checkThatTheUserLoggedOutTheAccount() {
        homePage.enterTheSite(HOTWIRE);
        homePage.clickSingIN("lenka_107522@mail.ru", "201184");
       // homePage.chooseSignOut();
    }

}
