package steps;

import page.RoomInformationPage;

public class RoomInformationSteps {

    public RoomInformationPage roomInformationPage = new RoomInformationPage();

    public void getIsFieldNameRoom() {
        roomInformationPage.getIsFieldNameRoom();
    }

    public void getRoomName() {
        roomInformationPage.getFieldNameRoom();
    }

    public void getArea() {
        roomInformationPage.getArea();
    }

    public void getNumberSleepers() {
        roomInformationPage.getNumberSleepers();
    }

    public void getNumberBeds() {
        roomInformationPage.getNumberBeds();
    }

    public void getPricePerNight() {
        roomInformationPage.getSpanPricePerNight();
    }

    public void getPrice() {
        roomInformationPage.getSpanPrice();
    }
}