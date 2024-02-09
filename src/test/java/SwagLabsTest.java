import com.zebrunner.carina.core.IAbstractTest;
import components.swaglabs.Product;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.swaglabs.*;

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
        LoginPage loginPage = new LoginPage(getDriver());

        Assert.assertTrue(loginPage.isUsernameInputVisible(), "Username input is not visible");
        Assert.assertTrue(loginPage.isPasswordInputVisible(), "Password input is not visible");

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        HomePage homePage = loginPage.clickLoginBtn();

        sa.assertTrue(homePage.isCartIconVisible(), "Cart icon is not visible");
        sa.assertAll();
    }

    @Test(dataProvider = "Credentials")
    public void verifyCorrectPurchaseTest(String username, String password) {
        SoftAssert sa = new SoftAssert();
        LoginPage loginPage = new LoginPage(getDriver());
        int productNumber = 0;
        String productTitle = "Sauce Labs Backpack";

        HomePage homePage = loginPage.login(username, password);

        Product product = homePage.getProduct(productNumber);

        sa.assertTrue(product.titleContains(productTitle), "The product title does not contain " + productTitle);
        sa.assertTrue(product.isPriceCorrect(), "The product price is not correct");

        product.clickAddToCartBtn();
        sa.assertTrue(homePage.isCartBadgeCorrect(1));

        CartPage cartPage = homePage.clickCartIcon();
        Assert.assertTrue(cartPage.productTitleContains(productTitle), "The cart product title does not contain " + productTitle);

        CheckoutInformationPage checkoutInformationPage = cartPage.clickCheckoutBtn();

        Assert.assertTrue(checkoutInformationPage.isFirstNameInputVisible(), "First name input is not visible");
        Assert.assertTrue(checkoutInformationPage.isLastNameInputVisible(), "Last name input is not visible");
        Assert.assertTrue(checkoutInformationPage.isPostalCodeInputVisible(), "Postal code input is not visible");

        checkoutInformationPage.enterFirstName("Julian");
        checkoutInformationPage.enterLastName("Perez");
        checkoutInformationPage.enterPostalCode("1000");

        CheckoutOverviewPage checkoutOverviewPage = checkoutInformationPage.clickContinueBtn();
        Assert.assertTrue(checkoutOverviewPage.productTitleContains(productTitle), "The checkout product title does not contain " + productTitle);

        CheckoutCompletePage checkoutCompletePage = checkoutOverviewPage.clickFinishBtn();
        Assert.assertTrue(checkoutCompletePage.isTitleCorrect("Thank you for you order"), "The checkout complete title is not correct");
        sa.assertTrue(checkoutCompletePage.isBackHomeBtnClickable(), "The checkout complete back home button is not clickable");

        sa.assertAll();
    }
}
