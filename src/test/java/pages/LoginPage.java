package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{

    private final By loginField = By.xpath("//*[@id='user-name']");
    private final By passwordField = By.cssSelector("[data-test='password']");
    private final By loginButton = By.cssSelector("[value='Login']");
    private final By errorMessage = By.xpath("//h3");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(BASE_URL);
    }

    public void login(final String login, final String password) {
        driver.findElement(loginField).sendKeys(login);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public String checkErrorMessage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        return driver.findElement(errorMessage).getText();
    }

}
