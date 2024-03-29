package pages.carinademo.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ChartsPageBase extends AbstractPage {
    public ChartsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void swipeToTemperatureChartContainer();

    public abstract boolean isPieChartContainerVisible();

    public abstract boolean isTemperatureChartContainerVisible();
}
