package pages.swaglabs.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import components.swaglabs.Product;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.swaglabs.common.CartPageBase;
import pages.swaglabs.common.HomePageBase;

import java.time.Duration;
import java.util.List;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Item\"]")
    private List<Product> productList;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart\"]")
    private ExtendedWebElement cartIcon;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart\"]//android.widget.TextView")
    private ExtendedWebElement cartBadge;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected int getProductListSize() {
        return productList.size();
    }

    @Override
    public boolean isCartIconVisible() {
        return cartIcon.isVisible();
    }

    @Override
    public boolean isCartBadgeCorrect(int itemsNumber) {
        return cartBadge.getText().equalsIgnoreCase(String.valueOf(itemsNumber));
    }

    @Override
    public Product getProduct(int index) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return getProductListSize() > 0;
            }
        });
        return productList.get(index);
    }

    @Override
    public CartPageBase clickCartIcon() {
        cartIcon.click();
        return initPage(driver, CartPageBase.class);
    }

}
