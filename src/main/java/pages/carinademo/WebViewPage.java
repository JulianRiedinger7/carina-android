package pages.carinademo;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import components.carinademo.SideNav;
import components.carinademo.Toolbar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class WebViewPage extends AbstractPage {

    @FindBy(id = "toolbar")
    private Toolbar toolbar;

    @FindBy(id = "nav_view")
    private SideNav sideNav;

    public WebViewPage(WebDriver driver) {
        super(driver);
    }

    public Toolbar getToolbar() {
        return toolbar;
    }

    public SideNav getSideNav() {
        return sideNav;
    }
}
