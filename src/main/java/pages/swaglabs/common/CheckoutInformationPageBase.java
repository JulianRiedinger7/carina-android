package pages.swaglabs.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import pages.swaglabs.android.CheckoutOverviewPage;

public abstract class CheckoutInformationPageBase extends AbstractPage {
    public CheckoutInformationPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isFirstNameInputVisible();
    public abstract boolean isLastNameInputVisible();

    public abstract boolean isPostalCodeInputVisible();

    public abstract void enterFirstName(String firstName);

    public abstract void enterLastName(String lastName);

    public abstract void enterPostalCode(String postalCode);

    public abstract CheckoutOverviewPageBase clickContinueBtn();
}
