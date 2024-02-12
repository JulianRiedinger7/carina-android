package pages.swaglabs.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import pages.swaglabs.common.CartPageBase;
import pages.swaglabs.common.CheckoutInformationPageBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CartPageBase.class)
public class CartPage extends CartPageBase {

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[1]")
    private ExtendedWebElement productTitle;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]")
    private ExtendedWebElement checkoutBtn;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean productTitleContains(String text) {
        return productTitle.getText().toLowerCase().contains(text.toLowerCase());
    }

    @Override
    public CheckoutInformationPageBase clickCheckoutBtn() {
        checkoutBtn.click();
        return initPage(driver, CheckoutInformationPageBase.class);
    }
}
