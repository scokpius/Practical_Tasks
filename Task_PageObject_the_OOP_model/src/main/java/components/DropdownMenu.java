package components;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class DropdownMenu {

    // локаторы
    private final String buttonDropdown;
    private final String dropdown;

    public DropdownMenu(String buttonDropdown, String dropdown) {
        this.buttonDropdown = buttonDropdown;
        this.dropdown = dropdown;
    }

    public void selectFromDropdownMenu(String element) {  //
        $(By.xpath(this.buttonDropdown)).shouldBe(Condition.visible, Duration.ofSeconds(3)).click();
        $(By.xpath(this.dropdown)).$(By.xpath(element));
    }
}
