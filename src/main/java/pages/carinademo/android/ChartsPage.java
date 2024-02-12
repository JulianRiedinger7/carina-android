package pages.carinademo.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import pages.carinademo.common.ChartsPageBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ChartsPageBase.class)
public class ChartsPage extends ChartsPageBase implements IMobileUtils {

    @FindBy(id = "fragmentFruitChart")
    private ExtendedWebElement pieChartContainer;

    @FindBy(id = "fragmentHiloChart")
    private ExtendedWebElement temperatureChartContainer;

    public ChartsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void swipeToTemperatureChartContainer() {
        swipe(temperatureChartContainer);
    }

    @Override
    public boolean isPieChartContainerVisible() {
        return pieChartContainer.isVisible();
    }

    @Override
    public boolean isTemperatureChartContainerVisible() {
        swipeToTemperatureChartContainer();
        return temperatureChartContainer.isVisible();
    }
}
