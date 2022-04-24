package pages;
import help.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static help.WebDriverHelp.getDriver;

public abstract class BasePage{
        public static WebDriver webDriver;
        public static String baseURL = "https://www.hilverdaflorist.com/";


        public BasePage() {
            webDriver = getDriver();
        }

        public abstract String getUrl();

        public boolean isElementDisplayed(By location) {
            return findElement(location).isDisplayed();
        }
        public WebElement findElement(By location) {
            WaitHelper.getInstance().displayElement(location);
            return webDriver.findElement(location);
        }
    }

