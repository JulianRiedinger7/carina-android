package pages.swaglabs.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import pages.swaglabs.common.HomePageBase;
import pages.swaglabs.common.LoginPageBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase implements IMobileUtils {

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private ExtendedWebElement usernameInput;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private ExtendedWebElement passwordInput;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private ExtendedWebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void swipeInput() {
        swipe(usernameInput, Direction.UP);
    }

    @Override
    public boolean isUsernameInputVisible() {
        return usernameInput.isVisible();
    }

    @Override
    public boolean isPasswordInputVisible() {
        return passwordInput.isVisible();
    }

    @Override
    public void enterUsername(String username) {
        usernameInput.type(username);
    }

    @Override
    public void enterPassword(String password) {
        passwordInput.type(password);
    }

    @Override
    public HomePageBase clickLoginBtn() {
        loginBtn.click();
        return initPage(driver, HomePageBase.class);
    }

    @Override
    public HomePageBase login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        return clickLoginBtn();
    }

}