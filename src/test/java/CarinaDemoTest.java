import com.zebrunner.carina.core.IAbstractTest;
import components.carinademo.SideNav;
import components.carinademo.Toolbar;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.carinademo.ChartsPage;
import pages.carinademo.WebViewPage;
import pages.carinademo.LoginPage;
import pages.carinademo.WelcomePage;

public class CarinaDemoTest implements IAbstractTest {

    @Test
    public void verifyCorrectLoginTest() {
        WelcomePage welcomePage = new WelcomePage(getDriver());

        Assert.assertTrue(welcomePage.isNextBtnClickable(), "Next button is not clickable");

        LoginPage loginPage = welcomePage.clickNextBtn();

        loginPage.enterName("Julian");
        loginPage.enterPassword("123");
        loginPage.selectRadioMale();
        loginPage.acceptPrivacyPolicy();
        WebViewPage webViewPage = loginPage.clickLoginBtn();

        Toolbar toolbar = webViewPage.getToolbar();

        Assert.assertTrue(toolbar.isUIObjectPresent(2), "Toolbar was not found");
    }

    @Test
    public void verifyNavigationToChartsTest() {
        WelcomePage welcomePage = new WelcomePage(getDriver());

        LoginPage loginPage = welcomePage.clickNextBtn();

        WebViewPage webViewPage = loginPage.login("J", "1");

        Toolbar toolbar = webViewPage.getToolbar();
        toolbar.clickHamburgerMenu();

        SideNav sideNav = webViewPage.getSideNav();

        Assert.assertTrue(sideNav.isUIObjectPresent(2), "Side navigation menu was not found");

        ChartsPage chartsPage = sideNav.clickChartsLink();

        Assert.assertTrue(chartsPage.isPieChartContainerVisible(), "Pie chart container is not visible");
        Assert.assertTrue(chartsPage.isTemperatureChartContainerVisible(), "Fragment chart is not visible");
    }
}
