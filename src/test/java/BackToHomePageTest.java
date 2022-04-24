import org.junit.Test;
import org.junit.Assert;
import pages.Assortment;
import pages.HomePage;
public class BackToHomePageTest {
    @Test
    public void BackToHomePageTest() {
                HomePage homePage = new HomePage();
                Assortment assortmentPage = new Assortment();
                homePage.clickViewOurAssortmentButton();
                Assert.assertTrue(assortmentPage.isHomeButtonVisible());
                assortmentPage.clickHomeButton();
                Assert.assertTrue(assortmentPage.getInTouchButtonIsVisible());
    }
}