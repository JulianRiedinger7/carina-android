package pages.carinademo.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import components.carinademo.SideNav;
import components.carinademo.Toolbar;
import org.openqa.selenium.WebDriver;
import pages.carinademo.common.WebViewPageBase;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = WebViewPageBase.class)
public class WebViewPage extends WebViewPageBase {
    public WebViewPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public Toolbar getToolbar() {
        return null;
    }

    @Override
    public SideNav getSideNav() {
        return null;
    }
}
