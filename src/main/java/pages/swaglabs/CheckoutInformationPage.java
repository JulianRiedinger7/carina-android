package pages.swaglabs;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CheckoutInformationPage extends AbstractPage {

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

    public boolean isFirstNameInputVisible() {
        return firstNameInput.isVisible();
    }

    public boolean isLastNameInputVisible() {
        return lastNameInput.isVisible();
    }

    public boolean isPostalCodeInputVisible() {
        return postalCodeInput.isVisible();
    }

    public void enterFirstName(String firstName) {
        firstNameInput.type(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameInput.type(lastName);
    }

    public void enterPostalCode(String postalCode) {
        postalCodeInput.type(postalCode);
    }

    public CheckoutOverviewPage clickContinueBtn() {
        continueBtn.click();
        return new CheckoutOverviewPage(driver);
    }
}
