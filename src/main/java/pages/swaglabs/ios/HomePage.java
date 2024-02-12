package pages.swaglabs.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import components.swaglabs.Product;
import org.openqa.selenium.WebDriver;
import pages.swaglabs.common.CartPageBase;
import pages.swaglabs.common.HomePageBase;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected int getProductListSize() {
        return 0;
    }

    @Override
    public boolean isCartIconVisible() {
        return false;
    }

    @Override
    public boolean isCartBadgeCorrect(int itemsNumber) {
        return false;
    }

    @Override
    public Product getProduct(int index) {
        return null;
    }

    @Override
    public CartPageBase clickCartIcon() {
        return null;
    }
}
