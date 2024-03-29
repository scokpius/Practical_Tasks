import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.RunnerExtension;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@ExtendWith(RunnerExtension.class)
public class  BaseTest {
    @BeforeAll
    public static void setUp(){

        Configuration.remote = "http://selenoid:4444/wd/hub";
        Configuration.browser = "chrome";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;

        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        Configuration.startMaximized = true;
        Configuration.timeout = 15000;
        Configuration.holdBrowserOpen = true;
        Configuration.headless = false;
    }

    @AfterAll
    public static void closeBrowser(){
        getWebDriver().quit();
    }
}
