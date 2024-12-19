package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    Actions actiones = new Actions(driver);

    static{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
    }

    public static void close(){
        driver.quit();
    }

    public void navigateToUrl(String url){
        driver.get(url);
    }

    public WebElement find(String locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    public void click(String locator){
        find(locator).click();
    }

    public void write(String locator, String text){
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    public void posarMouse(String locator){
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", locator);
        actiones.moveToElement(find(locator)).perform();
    }
}