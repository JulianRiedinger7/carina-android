package pages.carinademo.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import pages.carinademo.android.LoginPage;

public abstract class WelcomePageBase extends AbstractPage {
    public WelcomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isNextBtnClickable();

    public abstract LoginPageBase clickNextBtn();
}

