package pages.carinademo.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import pages.carinademo.common.ChartsPageBase;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE,parentClass = ChartsPageBase.class)
public class ChartsPage extends ChartsPageBase {
    public ChartsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void swipeToTemperatureChartContainer() {

    }

    @Override
    public boolean isPieChartContainerVisible() {
        return false;
    }

    @Override
    public boolean isTemperatureChartContainerVisible() {
        return false;
    }
}
