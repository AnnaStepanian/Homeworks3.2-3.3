package pages;

import locators.AladinPageConstants;
import org.openqa.selenium.By;

public class Serie  extends BasePage {
    private By serie = By.cssSelector(AladinPageConstants.series);
    @Override
    public String getUrl() {
        return baseURL + "/assortment/cutflowers-introductions-2022/gerbera/";
    }

}
