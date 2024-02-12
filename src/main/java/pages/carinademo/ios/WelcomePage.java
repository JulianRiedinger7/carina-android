package pages.carinademo.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import pages.carinademo.common.LoginPageBase;
import pages.carinademo.common.WelcomePageBase;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = WelcomePageBase.class)
public class WelcomePage extends WelcomePageBase {
    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isNextBtnClickable() {
        return false;
    }

    @Override
    public LoginPageBase clickNextBtn() {
        return null;
    }
}
