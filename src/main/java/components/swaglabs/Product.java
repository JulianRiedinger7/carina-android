package components.swaglabs;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Product extends AbstractUIObject {

    @FindBy(xpath = ".//android.widget.TextView[@content-desc=\"test-Item title\"]")
    private ExtendedWebElement title;

    @FindBy(xpath = ".//android.widget.TextView[@content-desc=\"test-Price\"]")
    private ExtendedWebElement price;

    @FindBy(xpath = ".//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"]")
    private ExtendedWebElement addToCartBtn;

    public Product(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
    private double convertPriceToDouble() {
        String originalPriceText = price.getText();
        String cleanPriceText = originalPriceText.replaceAll("[^\\d.]", "");

        return Double.parseDouble(cleanPriceText);
    }

    public boolean titleContains(String text) {
        return title.getText().toLowerCase().contains(text.toLowerCase());
    }

    public boolean isPriceCorrect() {
        return convertPriceToDouble() > 0d;
    }

    public void clickAddToCartBtn() {
        addToCartBtn.click();
    }
}
