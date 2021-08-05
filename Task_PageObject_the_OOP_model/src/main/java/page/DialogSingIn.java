package page;

import org.openqa.selenium.By;
import com.codeborne.selenide.Condition;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class DialogSingIn {
    public static final String INPUT_EMAIL_CSS = "#email";
    public static final String INPUT_PASSWORD_CSS = "#password";
    public static final String BUTTON_SING_IN_XPATH = "//*[@class = \"form-row\"]/button";


    public void logInAccount(String email, String password) {
        $(INPUT_EMAIL_CSS).setValue(email).shouldBe(Condition.visible, Duration.ofSeconds(5));
        $(INPUT_PASSWORD_CSS).setValue(password).shouldBe(Condition.visible, Duration.ofSeconds(5));
        $(By.xpath(BUTTON_SING_IN_XPATH)).shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
     }
}
