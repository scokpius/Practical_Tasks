package page;

import com.codeborne.selenide.Configuration;
import components.FormFindHotel;
import components.Header;
import lombok.Data;

@Data
public class HotelsPage {

    private final Header header;
    private final FormFindHotel formFindHotel;

    public HotelsPage() {
        header = new Header();
        formFindHotel = new FormFindHotel();
        waitForUpdateHotelPage();
    }

    public HotelsPage waitForUpdateHotelPage() {
        Configuration.timeout = 10000;
        return this;
    }

    public FormFindHotel getFormFindHotel() {
        return formFindHotel;
    }
}
