package pages.swaglabs.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import pages.swaglabs.android.CheckoutCompletePage;

public abstract class CheckoutOverviewPageBase extends AbstractPage {
    public CheckoutOverviewPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean productTitleContains(String text);

    public abstract void swipeToFinishBtn();

    public abstract CheckoutCompletePageBase clickFinishBtn();
}
