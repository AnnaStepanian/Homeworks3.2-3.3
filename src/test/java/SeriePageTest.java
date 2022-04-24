import org.junit.Assert;
import org.junit.Test;
import pages.Aladin;
import pages.Assortment;
import pages.HomePage;

public class SeriePageTest {

    @Test
    public void aladinPageTest() {
        HomePage homePage = new HomePage();
        Assortment assortmentPage = new Assortment();
        Aladin aladin = new Aladin();
        Assert.assertTrue(homePage.isViewOurAssortmentButtonVisible());
        homePage.clickViewOurAssortmentButton();
        Assert.assertTrue(assortmentPage.isAladinButtonVisible());
        assortmentPage.clickAladinButton();
        Assert.assertTrue(aladin.isSerieButtonIsVisible());
        aladin.clickSerieButton();
    }
}
