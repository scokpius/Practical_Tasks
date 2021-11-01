package components.guests;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
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

    public void clickButtonGuests() {
        buttonGuests.click();
    }

    public void setNumberOfRooms(String amountRoom) {
        initialValue = Integer.parseInt(Objects.requireNonNull(textAmountRooms.getValue()));
        totalValue = Integer.parseInt(amountRoom);
        setValue(buttonAddRoom, buttonMinRoom);
    }

    public void setNumberOfAdult(String amountAdult) {
        initialValue = Integer.parseInt(Objects.requireNonNull(textAmountAdult.getValue()));
        totalValue = Integer.parseInt(amountAdult);
        setValue(buttonAddAdult, buttonMinAdult);
    }

    public void setNumberOfAChildren(String amountChildren) {
        initialValue = Integer.parseInt(Objects.requireNonNull(textAmountChildren.getValue()));
        totalValue = Integer.parseInt(amountChildren);
        setValue(buttonAddChildren, buttonMinChildren);
    }

    public void clickButtonDone() {
        buttonDone.click();
    }

    void setValue(SelenideElement buttonAdd, SelenideElement buttonMin) {
        if (initialValue < totalValue) {
            while (totalValue - initialValue != 0) {
                buttonAdd.click();
                initialValue = initialValue + 1;
            }
        } else {
            if (initialValue > totalValue) {
                while (initialValue - totalValue != 0) {
                    buttonMin.click();
                    initialValue = initialValue - 1;
                }
            }
        }
    }
}


