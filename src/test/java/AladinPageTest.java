import org.junit.Test;
import pages.HomePage;
import org.junit.Assert;
import pages.Assortment;
import pages.Aladin;

public class AladinPageTest extends BaseTest{

    @Test
    public void aladinPageTest() {
        HomePage homePage = new HomePage();
        Assortment assortmentPage = new Assortment();
        Aladin aladin = new Aladin();
        Assert.assertTrue(homePage.isViewOurAssortmentButtonVisible());
        homePage.clickViewOurAssortmentButton();
        Assert.assertTrue(assortmentPage.isAladinButtonVisible());
        assortmentPage.clickAladinButton();
        Assert.assertTrue(aladin.isViewSerieElementIsVisible());
    }
}
