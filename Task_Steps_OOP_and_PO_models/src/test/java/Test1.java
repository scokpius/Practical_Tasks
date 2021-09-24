import com.codeborne.selenide.WebDriverRunner;
import object.Hotel;
import org.junit.Test;
import page.HomePage;
import steps.ResultsTofSearchingSteps;
import steps.ViewHotelInformationStep;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test1 {
    private ResultsTofSearchingSteps resultsTofSearchingSteps = new ResultsTofSearchingSteps();
    private ViewHotelInformationStep viewHotelInformation = new ViewHotelInformationStep();
    private List<Hotel> hotelsResult;
    static HomePage homePage = new HomePage();
    private Hotel hotel;
    @Test
    public void mainTest() {
//        HotelSearch hotelSearchParis =
//                HotelSearch.builder()
//                        .location(Location.builder().townName("Paris").build())
//                        .arriveDate(LocalDate.of(2021, 9, 27))
//                        .departureDate(LocalDate.of(2021, 10, 4))
//                        .rooms("1")
//                        .adults("4")
//                        .children("0")
//                        .build();
//        hotelsResult = resultsTofSearchingSteps.resultsOfSearchingWithHomePage(
//                hotelSearchParis);

       // homePage.enterTheSite("https://www.hotwire.com/hotels/search?destination=Paris,%20France&startDate=09-24-2021&endDate=09-25-2021&rooms=1&adults=2&children=0");
        homePage.enterTheSite("https://vacation.hotwire.com/Paris-Hotels-Campanile-La-Villette.h106674.Hotel-Information?gaiaId=179898&tmid=31841660893&currency=USD&rfrr=Header.Currency.USD&exp_dp=84&chkin=9/24/2021&chkout=9/25/2021&rm1=a2&paandi=true");

        WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(15000,
                TimeUnit.MILLISECONDS);
        hotel = viewHotelInformation.viewHotelInformation("Campanile La Villette");
    }
}
