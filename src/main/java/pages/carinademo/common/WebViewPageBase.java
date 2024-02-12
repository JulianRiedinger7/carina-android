package pages.carinademo.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import components.carinademo.SideNav;
import components.carinademo.Toolbar;
import org.openqa.selenium.WebDriver;

public abstract class WebViewPageBase extends AbstractPage {
    public WebViewPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract Toolbar getToolbar();

    public abstract SideNav getSideNav();
}
