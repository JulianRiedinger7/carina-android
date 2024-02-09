package pages.carinademo;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends AbstractPage {

    @FindBy(id = "next_button")
    private ExtendedWebElement nextBtn;

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isNextBtnClickable() {
        return nextBtn.isClickable();
    }

    public LoginPage clickNextBtn() {
        nextBtn.click();
        return new LoginPage(driver);
    }
}
