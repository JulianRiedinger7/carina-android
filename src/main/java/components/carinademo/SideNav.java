package components.carinademo;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import pages.carinademo.ChartsPage;

public class SideNav extends AbstractUIObject {

    @FindBy(xpath = "(.//android.widget.CheckedTextView)[1]")
    private ExtendedWebElement webViewLink;

    @FindBy(xpath = "(.//android.widget.CheckedTextView)[2]")
    private ExtendedWebElement chartsLink;

    @FindBy(xpath = "(.//android.widget.CheckedTextView)[3]")
        private ExtendedWebElement mapLink;

    @FindBy(xpath = "(.//android.widget.CheckedTextView)[4]")
    private ExtendedWebElement uiElementsLink;

    public SideNav(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ChartsPage clickChartsLink() {
        chartsLink.click();
        return new ChartsPage(driver);
    }
}
