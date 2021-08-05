package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class DialogCreateAccount extends DialogSingIn {

    public static final String INPUT_FIRST_NAME_CSS = "#firstName";
    public static final String INPUT_LAST_NAME_CSS = "#lastName";
    public static final String BUTTON_SING_UP_XPATH = "//*[@id=\"signin-model\"]/div/div/div[2]/form/div[2]/div[1]/button";

    public void registerAnAccount(String firstName, String lastName, String email, String password) {
        $(INPUT_FIRST_NAME_CSS).setValue(firstName).shouldBe(Condition.visible, Duration.ofSeconds(5));
        $(INPUT_LAST_NAME_CSS).setValue(lastName).shouldBe(Condition.visible, Duration.ofSeconds(5));
        Selenide.$(DialogSingIn.INPUT_EMAIL_CSS).setValue(email).shouldBe(Condition.visible, Duration.ofSeconds(5));
        Selenide.$(DialogSingIn.INPUT_PASSWORD_CSS).setValue(password).shouldBe(Condition.visible, Duration.ofSeconds(5));
        $(By.xpath(BUTTON_SING_UP_XPATH)).shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
        new HomePage();
    }
}
