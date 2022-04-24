package help;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WaitHelper{

        private static final Duration DURATION = Duration.ofSeconds(30);

        public static WaitHelper getInstance() {
            return new WaitHelper();
        }

        public WaitHelper displayElement(By location) {
            new WebDriverWait(WebDriverHelp.getDriver(), DURATION).until(ExpectedConditions.visibilityOfElementLocated(location));
            return this;

        }

        public WebElement waitForElementToBeClickable(By location) {
            return new WebDriverWait(WebDriverHelp.getDriver(), DURATION).until(ExpectedConditions.elementToBeClickable(location));

        }


    }