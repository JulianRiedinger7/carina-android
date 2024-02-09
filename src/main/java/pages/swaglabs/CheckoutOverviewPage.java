package pages.swaglabs;

import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage extends AbstractPage implements IMobileUtils {

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[1]")
    private ExtendedWebElement productTitle;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-FINISH\"]")
    private ExtendedWebElement finishBtn;

    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
    }

    public boolean productTitleContains(String text) {
        return productTitle.getText().toLowerCase().contains(text.toLowerCase());
    }

    public void swipeToFinishBtn() {
        swipe(finishBtn);
    }

    public CheckoutCompletePage clickFinishBtn() {
        finishBtn.click();
        return new CheckoutCompletePage(driver);
    }
}
