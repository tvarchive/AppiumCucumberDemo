package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {


    By userId = By.id(app_package_name + "user_id");
    By password = By.id(app_package_name + "user_password");
    By showPassword = By.id(app_package_name + "show_password");
    By login_Button = By.id(app_package_name + "btn_login");
    By error_text = By.id(app_package_name + "text");


    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void invalidLogin(String username, String password) {
        waitForVisibilityOf(userId);
        driver.findElement(userId).sendKeys(username);
        driver.findElement(this.password).sendKeys(password);
        driver.findElement(showPassword).click();
        driver.findElement(login_Button).click();
    }

    public void verifyErrorText(String error){
        error.contentEquals(driver.findElement(error_text).getText());
    }
}
