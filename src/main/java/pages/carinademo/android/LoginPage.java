package pages.carinademo.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import pages.carinademo.common.LoginPageBase;
import pages.carinademo.common.WebViewPageBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {

    @FindBy(id = "name")
    private ExtendedWebElement nameInput;

    @FindBy(id = "password")
    private ExtendedWebElement passwordInput;

    @FindBy(id = "radio_male")
    private ExtendedWebElement radioMale;

    @FindBy(id = "radio_female")
    private ExtendedWebElement radioFemale;

    @FindBy(id = "checkbox")
    private ExtendedWebElement privacySwitch;

    @FindBy(id = "login_button")
    private ExtendedWebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void enterName(String name) {
        nameInput.type(name);
    }

    @Override
    public void enterPassword(String password) {
        passwordInput.type(password);
    }

    @Override
    public void selectRadioMale() {
        radioMale.click();
    }

    @Override
    public void acceptPrivacyPolicy() {
        privacySwitch.click();
    }

    @Override
    public WebViewPageBase clickLoginBtn() {
        loginBtn.click();
        return initPage(driver, WebViewPageBase.class);
    }

    @Override
    public WebViewPageBase login(String name, String password) {
        enterName(name);
        enterPassword(password);
        selectRadioMale();
        acceptPrivacyPolicy();
        return clickLoginBtn();
    }
}
