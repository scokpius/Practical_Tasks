package steps;

import page.HomePage;
import page.ResultsSearchPage;

import static constant.URL.HOTWIRE;

public class SearchFindSteps {
    HomePage homePage = new HomePage();
    ResultsSearchPage resultsSearchPage = new ResultsSearchPage();

    public void createSearchRequestHomePage() {
        homePage.enterTheSite(HOTWIRE);
        homePage.clickFunctionMenu("Hotels");
        homePage.getFunctionMenu().getFormFindHome().getInputLocation().setValue("Paris");
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().chooseCheckInDate("August", "25", "2021");
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().chooseCheckOutDate("September","3", "2021");
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().chooseGuests("1", "2", "2");
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().clickButton();
    }
}
