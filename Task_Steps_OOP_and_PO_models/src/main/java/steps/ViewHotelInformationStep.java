package steps;

import object.HotelRoom;
import page.HotelInformationPage;
import page.ResultsSearchPage;

import java.util.ArrayList;
import java.util.List;

public class ViewHotelInformationStep {

    ResultsSearchPage resultsSearchPage = new ResultsSearchPage();
    HotelInformationPage hotelInformationPage = new HotelInformationPage();
    List<HotelRoom> listHotelRoom = new ArrayList<>();
    List<String> listPhotoRoom = new ArrayList<>();

    public String getHotelNameFromHotelInformationPage(){
        hotelInformationPage.waitForUpdateHotelInformationPage();
        return hotelInformationPage.getFieldNameHotel().getText();
    }

    public String getHotelLocationFromHotelInformationPage(){
        hotelInformationPage.waitForUpdateHotelInformationPage();
        hotelInformationPage.clickLocationTab();
        return hotelInformationPage.getFieldLocation().getText();
    }

}
