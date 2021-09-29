package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;

import static constant.XPathCSS.*;

@Data
public class DialogSingIn {

    @FindBy(how = How.CSS, using = INPUT_EMAIL_CSS)
    private SelenideElement inputEmail;
    @FindBy(how = How.CSS, using = INPUT_PASSWORD_CSS)
    private SelenideElement inputPassword;
    @FindBy(how = How.XPATH, using = BUTTON_SING_IN_XPATH)
    private SelenideElement buttonSignIn;


    public void logInAccount(String email, String password) {
        inputEmail.setValue(email).shouldBe(Condition.visible, Duration.ofSeconds(5));
        inputPassword.setValue(password).shouldBe(Condition.visible, Duration.ofSeconds(5));
        buttonSignIn.shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
        new HomePage();
    }

    public SelenideElement getInputEmail() {
        return inputEmail;
    }

    public SelenideElement getInputPassword() {
        return inputPassword;
    }
}
