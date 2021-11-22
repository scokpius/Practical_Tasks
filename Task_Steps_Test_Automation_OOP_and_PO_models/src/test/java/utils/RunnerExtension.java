package utils;

import io.qameta.allure.Attachment;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RunnerExtension implements AfterTestExecutionCallback {
    WebDriver driver;
    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
//        Boolean testResult = context.getExecutionException().isPresent();
//        System.out.println(testResult);
//        AllureAttachment.addAttachments();
        Object test = context.getRequiredTestInstance();
        Field a = test.getClass().getDeclaredField("driver");
        a.setAccessible(true);
        driver = (WebDriver) a.get(test);

        Method method = context.getRequiredTestMethod();
        if (context.getExecutionException().isPresent()) {
            makeScreenshotOnFailure(method.getName());
        }
    }

    @Attachment(value = "{testName} - screenshot", type = "image/png")
    private byte[] makeScreenshotOnFailure(String testName) {

        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
