package pages.carinademo.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import pages.carinademo.common.LoginPageBase;
import pages.carinademo.common.WebViewPageBase;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void enterName(String name) {

    }

    @Override
    public void enterPassword(String password) {

    }

    @Override
    public void selectRadioMale() {

    }

    @Override
    public void acceptPrivacyPolicy() {

    }

    @Override
    public WebViewPageBase clickLoginBtn() {
        return null;
    }

    @Override
    public WebViewPageBase login(String name, String password) {
        return null;
    }
}
