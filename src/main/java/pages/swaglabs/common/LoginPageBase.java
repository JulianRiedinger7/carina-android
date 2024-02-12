package pages.swaglabs.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class LoginPageBase extends AbstractPage {
    public LoginPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void swipeInput();

    public abstract boolean isUsernameInputVisible();

    public abstract boolean isPasswordInputVisible();

    public abstract void enterUsername(String username);

    public abstract void enterPassword(String password);

    public abstract HomePageBase clickLoginBtn();

    public abstract HomePageBase login(String username, String password);

}
