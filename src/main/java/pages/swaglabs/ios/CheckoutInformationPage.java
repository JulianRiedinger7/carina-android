package pages.swaglabs.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import pages.swaglabs.common.CheckoutInformationPageBase;
import pages.swaglabs.common.CheckoutOverviewPageBase;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CheckoutInformationPageBase.class)
public class CheckoutInformationPage extends CheckoutInformationPageBase {
    public CheckoutInformationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isFirstNameInputVisible() {
        return false;
    }

    @Override
    public boolean isLastNameInputVisible() {
        return false;
    }

    @Override
    public boolean isPostalCodeInputVisible() {
        return false;
    }

    @Override
    public void enterFirstName(String firstName) {

    }

    @Override
    public void enterLastName(String lastName) {

    }

    @Override
    public void enterPostalCode(String postalCode) {

    }

    @Override
    public CheckoutOverviewPageBase clickContinueBtn() {
        return null;
    }
}
