import com.zebrunner.carina.core.IAbstractTest;
import components.swaglabs.Product;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.swaglabs.common.*;

public class SwagLabsTest implements IAbstractTest {

    @DataProvider(name = "Credentials")
    public Object[][] dataprovider() {
        return new Object[][] {
            {"standard_user", "secret_sauce"}
        };
    }

    @Test(dataProvider = "Credentials")
    public void verifyCorrectLoginTest(String username, String password) {
        SoftAssert sa = new SoftAssert();
        LoginPageBase loginPage = initPage(LoginPageBase.class);

        Assert.assertTrue(loginPage.isUsernameInputVisible(), "Username input is not visible");
        Assert.assertTrue(loginPage.isPasswordInputVisible(), "Password input is not visible");

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        HomePageBase homePage = loginPage.clickLoginBtn();

        sa.assertTrue(homePage.isCartIconVisible(), "Cart icon is not visible");
        sa.assertAll();
    }

    @Test(dataProvider = "Credentials")
    public void verifyCorrectPurchaseTest(String username, String password) {
        SoftAssert sa = new SoftAssert();
        LoginPageBase loginPage = initPage(LoginPageBase.class);
        int productNumber = 0;
        String productTitle = "Sauce Labs Backpack";

        HomePageBase homePage = loginPage.login(username, password);

        Product product = homePage.getProduct(productNumber);

        sa.assertTrue(product.titleContains(productTitle), "The product title does not contain " + productTitle);
        sa.assertTrue(product.isPriceCorrect(), "The product price is not correct");

        product.clickAddToCartBtn();
        sa.assertTrue(homePage.isCartBadgeCorrect(1));

        CartPageBase cartPage = homePage.clickCartIcon();
        Assert.assertTrue(cartPage.productTitleContains(productTitle), "The cart product title does not contain " + productTitle);

        CheckoutInformationPageBase checkoutInformationPage = cartPage.clickCheckoutBtn();

        Assert.assertTrue(checkoutInformationPage.isFirstNameInputVisible(), "First name input is not visible");
        Assert.assertTrue(checkoutInformationPage.isLastNameInputVisible(), "Last name input is not visible");
        Assert.assertTrue(checkoutInformationPage.isPostalCodeInputVisible(), "Postal code input is not visible");

        checkoutInformationPage.enterFirstName("Julian");
        checkoutInformationPage.enterLastName("Perez");
        checkoutInformationPage.enterPostalCode("1000");

        CheckoutOverviewPageBase checkoutOverviewPage = checkoutInformationPage.clickContinueBtn();
        Assert.assertTrue(checkoutOverviewPage.productTitleContains(productTitle), "The checkout product title does not contain " + productTitle);

        CheckoutCompletePageBase checkoutCompletePage = checkoutOverviewPage.clickFinishBtn();
        Assert.assertTrue(checkoutCompletePage.isTitleCorrect("Thank you for you order"), "The checkout complete title is not correct");
        sa.assertTrue(checkoutCompletePage.isBackHomeBtnClickable(), "The checkout complete back home button is not clickable");

        sa.assertAll();
    }
}
