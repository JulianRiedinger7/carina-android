package pages.carinademo;

import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ChartsPage extends AbstractPage implements IMobileUtils {

    @FindBy(id = "fragmentFruitChart")
    private ExtendedWebElement pieChartContainer;

    @FindBy(id = "fragmentHiloChart")
    private ExtendedWebElement temperatureChartContainer;

    public ChartsPage(WebDriver driver) {
        super(driver);
    }

    public void swipeToTemperatureChartContainer() {
        swipe(temperatureChartContainer);
    }

    public boolean isPieChartContainerVisible() {
        return pieChartContainer.isVisible();
    }

    public boolean isTemperatureChartContainerVisible() {
        swipeToTemperatureChartContainer();
        return temperatureChartContainer.isVisible();
    }
}
