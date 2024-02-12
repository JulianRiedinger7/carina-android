package pages.carinademo.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import pages.carinademo.android.WebViewPage;

public abstract class LoginPageBase extends AbstractPage {
    public LoginPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void enterName(String name);

    public abstract void enterPassword(String password);

    public abstract void selectRadioMale();

    public abstract void acceptPrivacyPolicy();

    public abstract WebViewPageBase clickLoginBtn();

    public abstract WebViewPageBase login(String name, String password);
}
