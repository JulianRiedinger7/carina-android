package pages.swaglabs.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import pages.swaglabs.common.CheckoutCompletePageBase;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CheckoutCompletePageBase.class)
public class CheckoutCompletePage extends CheckoutCompletePageBase {
    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isTitleCorrect(String text) {
        return false;
    }

    @Override
    public boolean isBackHomeBtnClickable() {
        return false;
    }
}
