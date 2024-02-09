package pages.carinademo;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(id = "name")
    private ExtendedWebElement nameInput;

    @FindBy(id = "password")
    private ExtendedWebElement passwordInput;

    @FindBy(id = "radio_male")
    private ExtendedWebElement radioMale;

    @FindBy(id = "radio_female")
    private ExtendedWebElement radioFemale;

    @FindBy(id = "checkbox")
    private ExtendedWebElement privacySwitch;

    @FindBy(id = "login_button")
    private ExtendedWebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterName(String name) {
        nameInput.type(name);
    }

    public void enterPassword(String password) {
        passwordInput.type(password);
    }

    public void selectRadioMale() {
        radioMale.click();
    }

    public void acceptPrivacyPolicy() {
        privacySwitch.click();
    }

    public WebViewPage clickLoginBtn() {
        loginBtn.click();
        return new WebViewPage(driver);
    }

    public WebViewPage login(String name, String password) {
        enterName(name);
        enterPassword(password);
        selectRadioMale();
        acceptPrivacyPolicy();
        return clickLoginBtn();
    }
}
