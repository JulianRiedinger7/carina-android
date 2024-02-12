package pages.swaglabs.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import components.swaglabs.Product;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractPage {
    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    protected abstract int getProductListSize();

    public abstract boolean isCartIconVisible();

    public abstract boolean isCartBadgeCorrect(int itemsNumber);

    public abstract Product getProduct(int index);

    public abstract CartPageBase clickCartIcon();
}
