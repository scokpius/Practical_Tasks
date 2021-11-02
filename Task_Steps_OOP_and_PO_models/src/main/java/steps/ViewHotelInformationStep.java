package steps;

import page.HotelInformationPage;

public class ViewHotelInformationStep {


    private HotelInformationPage hotelInformationPage = new HotelInformationPage();


    public String getHotelNameFromHotelInformationPage(){
        hotelInformationPage.waitForUpdateHotelInformationPage();
        return hotelInformationPage.getFieldNameHotel().getText();
    }

    public String getHotelLocationFromHotelInformationPage(){
        hotelInformationPage.waitForUpdateHotelInformationPage();
        hotelInformationPage.clickLocationTab();
        return hotelInformationPage.getFieldLocation().getText();
    }

    public void goToRoomInformationPages(String roomName) {
        hotelInformationPage.waitForUpdateHotelInformationPage();
        hotelInformationPage.clickRoomTab();
        hotelInformationPage.selectRoom(roomName);
        hotelInformationPage.goToRoomInformationPage();
    }
//    public List<HotelRoom> getHotelsListFromResultsPage() {
//        List<HotelRoom> listHotelRoom = new ArrayList<>();
//        for (int i = 1; i < hotelInformationPage.getListCardHotel().size(); i++) {
//            listHotels.add(Hotel.builder()
//                    .hotelName(hotelInformationPage.getNameHotel(i).getText())
//                    .classHotel(hotelInformationPage.getClassHotel(i).size())
//                    .pricePerNight(Price.builder()
//                            .code(hotelInformationPage.getCodePricePerNight(i).getText())
//                            .sum(BigDecimal.valueOf(Double.parseDouble(
//                                    hotelInformationPage.getSumPricePerNight(i).getText().replace("$", "")
//                                            .replace(",", ""))))
//                            .build())
//                    .build());
//        }
//        return listHotels;
//    }

}
