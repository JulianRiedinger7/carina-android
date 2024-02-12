package pages.swaglabs.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import pages.swaglabs.common.CheckoutCompletePageBase;
import pages.swaglabs.common.CheckoutOverviewPageBase;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CheckoutOverviewPageBase.class)
public class CheckoutOverviewPage extends CheckoutOverviewPageBase {
    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean productTitleContains(String text) {
        return false;
    }

    @Override
    public void swipeToFinishBtn() {

    }

    @Override
    public CheckoutCompletePageBase clickFinishBtn() {
        return null;
    }
}
