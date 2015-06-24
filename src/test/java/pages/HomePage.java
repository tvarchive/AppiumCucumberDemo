package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class HomePage extends BasePage {

    By search_button_locator = By.id(app_package_name + "menu_search");
    By search_textbox_locator = By.id(app_package_name + "autoCompleteTextView");


    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    public void searchFor(String keyword) {
        waitForClickabilityOf(search_button_locator);
        driver.findElement(search_button_locator).click();

        waitForVisibilityOf(search_textbox_locator);
        driver.findElement(search_textbox_locator).sendKeys(keyword);

    }

    public void clearText(WebElement elementToBeCleared) {
        elementToBeCleared.sendKeys("x");
        elementToBeCleared.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        elementToBeCleared.sendKeys(Keys.chord(Keys.BACK_SPACE));
    }

}
