package pages.swaglabs.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import pages.swaglabs.common.CheckoutCompletePageBase;
import pages.swaglabs.common.CheckoutOverviewPageBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CheckoutOverviewPageBase.class)
public class CheckoutOverviewPage extends CheckoutOverviewPageBase implements IMobileUtils {

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[1]")
    private ExtendedWebElement productTitle;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-FINISH\"]")
    private ExtendedWebElement finishBtn;

    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean productTitleContains(String text) {
        return productTitle.getText().toLowerCase().contains(text.toLowerCase());
    }

    @Override
    public void swipeToFinishBtn() {
        swipe(finishBtn);
    }

    @Override
    public CheckoutCompletePageBase clickFinishBtn() {
        swipeToFinishBtn();
        finishBtn.click();
        return initPage(driver, CheckoutCompletePageBase.class);
    }
}
