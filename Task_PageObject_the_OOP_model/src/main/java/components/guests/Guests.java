package components.guests;


import com.codeborne.selenide.SelenideElement;


public abstract class Guests {
    protected SelenideElement buttonGuests;
    protected SelenideElement textAmountRooms;
    protected SelenideElement textAmountAdult;
    protected SelenideElement textAmountChildren;
    protected SelenideElement buttonAddRoom;
    protected SelenideElement buttonMinRoom;
    protected SelenideElement buttonAddAdult;
    protected SelenideElement buttonMinAdult;
    protected SelenideElement buttonAddChildren;
    protected SelenideElement buttonMinChildren;
    protected SelenideElement buttonDone;
    private Integer totalValue;
    private Integer initialValue;

    public void setNumberOfRooms(String amountRoom) {
        initialValue = Integer.parseInt(textAmountRooms.getValue());
        totalValue = Integer.parseInt(amountRoom);
        setValue(buttonAddRoom, buttonMinRoom);
    }

    public void setNumberOfAdult(String amountAdult) {
        initialValue = Integer.parseInt(textAmountAdult.getValue());
        totalValue = Integer.parseInt(amountAdult);
        setValue(buttonAddAdult, buttonMinAdult);
    }

    public void setNumberOfAChildren(String amountChildren) {
        initialValue = Integer.parseInt(textAmountChildren.getValue());
        totalValue = Integer.parseInt(amountChildren);
        setValue(buttonAddChildren, buttonMinChildren);
    }

    public void clickButtonGuests() {
        buttonGuests.click();
    }
    public void clickButtonDone() {
        buttonDone.click();
    }
    private void setValue(SelenideElement buttonAdd, SelenideElement buttonMin) {
        if (initialValue < totalValue) {
            while (totalValue - initialValue != 0)
                buttonAdd.click();
        } else {
            if (initialValue > totalValue) {
                while (initialValue - totalValue != 0)
                    buttonMin.click();
            }
        }
    }
}


