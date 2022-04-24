package pages;

import help.WaitHelper;
import locators.AladinPageConstants;
import locators.SeriePageConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Aladin extends BasePage{
    private By viewSerie = By.cssSelector(AladinPageConstants.viewSerie);
    private By serieButton = By.cssSelector(SeriePageConstants.serie);
    @Override
    public String getUrl() {
        return baseURL + "/assortment/product/aladin/";
    }
    public boolean isSerieButtonIsVisible() {
        return isElementDisplayed(viewSerie);
    }
    public Assortment clickSerieButton(){
        WebElement clickButton = WaitHelper.getInstance().waitForElementToBeClickable(serieButton);
        clickButton.click();
        return new Assortment();
    }
    public boolean isViewSerieElementIsVisible() {
        return isElementDisplayed(viewSerie);
    }

}
