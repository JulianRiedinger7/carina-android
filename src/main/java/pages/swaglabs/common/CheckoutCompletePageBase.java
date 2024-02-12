package pages.swaglabs.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CheckoutCompletePageBase extends AbstractPage {
    public CheckoutCompletePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isTitleCorrect(String text);

    public abstract boolean isBackHomeBtnClickable();
}
