package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;

@Data
public class DialogCreateAccount extends DialogSingIn {

    private final SelenideElement inputFirstName = $(INPUT_FIRST_NAME_CSS);
    private final SelenideElement inputLastName = $(INPUT_LAST_NAME_CSS);
    private final SelenideElement buttonSignUn = $(By.xpath(BUTTON_SING_UP_XPATH));

    public void registerAnAccount(String firstName, String lastName, String email, String password) {
        inputFirstName.setValue(firstName).shouldBe(Condition.visible, Duration.ofSeconds(5));
        inputLastName.setValue(lastName).shouldBe(Condition.visible, Duration.ofSeconds(5));
        super.getInputEmail().setValue(email).shouldBe(Condition.visible, Duration.ofSeconds(5));
        super.getInputPassword().setValue(password).shouldBe(Condition.visible, Duration.ofSeconds(5));
        buttonSignUn.shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
        new HomePage();
    }
}
