package pages.swaglabs.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import pages.swaglabs.common.CheckoutInformationPageBase;
import pages.swaglabs.common.CheckoutOverviewPageBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CheckoutInformationPageBase.class)
public class CheckoutInformationPage extends CheckoutInformationPageBase {

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-First Name\"]")
    private ExtendedWebElement firstNameInput;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Last Name\"]")
    private ExtendedWebElement lastNameInput;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Zip/Postal Code\"]")
    private ExtendedWebElement postalCodeInput;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-CONTINUE\"]")
    private ExtendedWebElement continueBtn;

    public CheckoutInformationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isFirstNameInputVisible() {
        return firstNameInput.isVisible();
    }

    @Override
    public boolean isLastNameInputVisible() {
        return lastNameInput.isVisible();
    }

    @Override
    public boolean isPostalCodeInputVisible() {
        return postalCodeInput.isVisible();
    }

    @Override
    public void enterFirstName(String firstName) {
        firstNameInput.type(firstName);
    }

    @Override
    public void enterLastName(String lastName) {
        lastNameInput.type(lastName);
    }

    @Override
    public void enterPostalCode(String postalCode) {
        postalCodeInput.type(postalCode);
    }

    @Override
    public CheckoutOverviewPageBase clickContinueBtn() {
        continueBtn.click();
        return initPage(driver, CheckoutOverviewPageBase.class);
    }
}
