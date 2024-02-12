package pages.swaglabs.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import pages.swaglabs.common.HomePageBase;
import pages.swaglabs.common.LoginPageBase;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void swipeInput() {

    }

    @Override
    public boolean isUsernameInputVisible() {
        return false;
    }

    @Override
    public boolean isPasswordInputVisible() {
        return false;
    }

    @Override
    public void enterUsername(String username) {

    }

    @Override
    public void enterPassword(String password) {

    }

    @Override
    public HomePageBase clickLoginBtn() {
        return null;
    }

    @Override
    public HomePageBase login(String username, String password) {
        return null;
    }
}
