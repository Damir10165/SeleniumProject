import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class MainTest {

    @Test
    public void correctLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("[data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("[value='Login']")).click();
        boolean titleIsDisplayed = driver.findElement(By.xpath("//*[text()='Products']")).isDisplayed();
        assertTrue(titleIsDisplayed);

        driver.quit();

//        driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys(Keys.CONTROL + "A");
//        driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys(Keys.BACK_SPACE);

//        driver.findElement(By.id("user-name"));
//        driver.findElement(By.cssSelector("#user-name"));
//        driver.findElement(By.cssSelector("[id='user-name']"));
//
//        driver.findElement(By.xpath("//*[@id='user-name']"));
    }
}
