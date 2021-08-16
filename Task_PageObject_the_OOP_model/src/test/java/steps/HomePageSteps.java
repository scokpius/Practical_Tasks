package steps;

import page.HomePage;

import static constant.URL.HOTWIRE;

public class HomePageSteps {
    HomePage homePage = new HomePage();


    public void checkTheCurrencyHasChanged() {
        homePage.enterTheSite(HOTWIRE);
        homePage.chooseCurrency();
    }

    public void enterTheSite(String url){
        homePage.enterTheSite(url);

    }

    public void chooseFunctionMenu(String element){
        homePage.enterTheSite(element);

    }

    public void chooseInputLocation (String location){
        homePage.getFunctionMenu().getFormFindHome().getInputLocation().setValue(location);
    }

    public void chooseCheckInDateCheckOutDate (String monthInDate, String dayInDate, String yerInDate,
                                               String monthOutDate, String dayOutDate, String yerOutDate){
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().chooseCheckInDate(monthInDate, dayInDate, yerInDate);
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().chooseCheckOutDate(monthOutDate,dayOutDate, yerOutDate);
    }

    public void chooseGuests (String numberRooms, String numberAdult, String numberChildren) {
        homePage.getFunctionMenu().getFormFindHome().getSearchOptions().chooseGuests(numberRooms, numberAdult, numberChildren);
    }

    public void clickButtonFind(){
       homePage.getFunctionMenu().getFormFindHome().getSearchOptions().clickButton();
    }
}
