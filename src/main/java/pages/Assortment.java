package pages;

import help.WaitHelper;
import locators.AssortmentConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assortment extends BasePage {
    private By searchField = By.cssSelector(AssortmentConstants.search);
    private By aladinButton = By.cssSelector(AssortmentConstants.aladin);
    private By homeButton = By.cssSelector(AssortmentConstants.homeButton);
    private By getInTouchButton = By.cssSelector(AssortmentConstants.getInTouchButton);

    @Override
    public String getUrl() {
        return baseURL + "/assortment/";
    }

    public boolean isSearchFieldVisible(){
        return isElementDisplayed(searchField);
    }
    public Assortment clickAladinButton(){
        WebElement clickButton = WaitHelper.getInstance().waitForElementToBeClickable(aladinButton);
        clickButton.click();
        return new Assortment();
    }
    public boolean isAladinButtonVisible() {
        return isElementDisplayed(aladinButton);
    }

    public Assortment clickHomeButton(){
        WebElement clickButton = WaitHelper.getInstance().waitForElementToBeClickable(homeButton);
        clickButton.click();
        return new Assortment();
    }
    public boolean isHomeButtonVisible() {
        return isElementDisplayed(homeButton);
    }
    public boolean getInTouchButtonIsVisible() {
        return isElementDisplayed(getInTouchButton);
    }
}
