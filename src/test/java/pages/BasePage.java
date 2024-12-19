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

    public void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000); // Convierte segundos a milisegundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restaura el estado de interrupción
            System.out.println("Error en la espera: " + e.getMessage());
        }
    }

    public String getText(String locator){
        return find(locator).getText();
    }

    public String extractNumeric(String text) {
        return text.replaceAll("[^\\d.]", ""); // Elimina todo excepto dígitos y punto decimal
    }

    public String getInputValue(String locator) {
        return find(locator).getAttribute("value");
    }

}