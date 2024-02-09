package pages.swaglabs;

import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage implements IMobileUtils {

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private ExtendedWebElement usernameInput;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private ExtendedWebElement passwordInput;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private ExtendedWebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void swipeInput() {
        swipe(usernameInput, Direction.UP);
    }

    public boolean isUsernameInputVisible() {
        return usernameInput.isVisible();
    }

    public boolean isPasswordInputVisible() {
        return passwordInput.isVisible();
    }

    public void enterUsername(String username) {
        usernameInput.type(username);
    }

    public void enterPassword(String password) {
        passwordInput.type(password);
    }

    public HomePage clickLoginBtn() {
        loginBtn.click();
        return new HomePage(driver);
    }

    public HomePage login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        return clickLoginBtn();
    }

}