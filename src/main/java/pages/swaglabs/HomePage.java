package pages.swaglabs;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import components.swaglabs.Product;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Item\"]")
    private List<Product> productList;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart\"]")
    private ExtendedWebElement cartIcon;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart\"]//android.widget.TextView")
    private ExtendedWebElement cartBadge;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private int getProductListSize() {
        return productList.size();
    }

    public boolean isCartIconVisible() {
        return cartIcon.isVisible();
    }

    public boolean isCartBadgeCorrect(int itemsNumber) {
        return cartBadge.getText().equalsIgnoreCase(String.valueOf(itemsNumber));
    }

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

    public CartPage clickCartIcon() {
        cartIcon.click();
        return new CartPage(driver);
    }

}
