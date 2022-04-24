import org.openqa.selenium.OutputType;
import com.google.common.io.Files;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import help.WebDriverHelp;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;

import static help.WebDriverHelp.driver;
import static help.WebDriverHelp.getDriver;

public abstract class BaseTest {
    @BeforeClass
    @Parameters("browser")
    public void startRemoteServer(String browser) {
        WebDriverHelp.startDriverSession(browser);
    }
    @BeforeMethod
    public void startDriver() {
        getDriver().get("https://www.hilverdaflorist.com/");
    }
    @AfterMethod
    public void quitDriver() {
        WebDriverHelp.getDriver().quit();
    }
    @AfterMethod
    public void recordFailure(ITestResult result){
        if (ITestResult.FAILURE == result.getStatus()){
            var camera = (TakesScreenshot)driver;
            File screenshot = ((TakesScreenshot) camera).getScreenshotAs(OutputType.FILE);
            try{
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        getDriver().quit();

    }

}
