package pages.carinademo.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import components.carinademo.SideNav;
import components.carinademo.Toolbar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import pages.carinademo.common.WebViewPageBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WebViewPageBase.class)
public class WebViewPage extends WebViewPageBase {

    @FindBy(id = "toolbar")
    private Toolbar toolbar;

    @FindBy(id = "nav_view")
    private SideNav sideNav;

    public WebViewPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public Toolbar getToolbar() {
        return toolbar;
    }

    @Override
    public SideNav getSideNav() {
        return sideNav;
    }
}
