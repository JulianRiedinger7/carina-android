package pages.swaglabs.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import pages.swaglabs.common.CartPageBase;
import pages.swaglabs.common.CheckoutInformationPageBase;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CartPageBase.class)
public class CartPage extends CartPageBase {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean productTitleContains(String text) {
        return false;
    }

    @Override
    public CheckoutInformationPageBase clickCheckoutBtn() {
        return null;
    }
}
