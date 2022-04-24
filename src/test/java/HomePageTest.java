import org.junit.Assert;
import org.junit.Test;
import pages.Assortment;
import pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    public void newsAndEventsPageTest(){
        HomePage homePage = new HomePage();
        Assortment assortmentPage = new Assortment();
        Assert.assertTrue(homePage.isViewOurAssortmentButtonVisible());
        homePage.clickViewOurAssortmentButton();
        Assert.assertTrue(assortmentPage.isSearchFieldVisible());
    }
}
