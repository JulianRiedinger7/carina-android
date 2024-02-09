package components.carinademo;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Toolbar extends AbstractUIObject {

    @FindBy(xpath = ".//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    private ExtendedWebElement hamburgerMenu;

    public Toolbar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickHamburgerMenu() {
        hamburgerMenu.click();
    }
}
