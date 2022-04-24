package pages;
import help.WaitHelper;
import locators.HomePageConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
        private By viewOurAssortmentButton = By.cssSelector(HomePageConstants.viewOurAssortmentButton);
//        private By getInTouchButton = By.cssSelector(HomePageConstants.getInTouchButton);
        @Override
        public String getUrl() {
            return baseURL;
        }
        public Assortment clickViewOurAssortmentButton(){
            WebElement clickButton = WaitHelper.getInstance().waitForElementToBeClickable(viewOurAssortmentButton);
            clickButton.click();
            return new Assortment();
        }
        public boolean isViewOurAssortmentButtonVisible() {
            return isElementDisplayed(viewOurAssortmentButton);
        }
//         public boolean isGetInTouchButtonVisible() {
//        return isElementDisplayed(getInTouchButton);
//    }
}
