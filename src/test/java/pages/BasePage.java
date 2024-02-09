package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
        System.setProperty("webdriver.chrome.driver", "C:/Users/user/inetum/chromedriver-win64/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver,10);
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver,10);
    }

    public static void navigateTo(String url) {
        driver.get(url);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);

    }

    public static void CloseBrowser(){
        driver.quit();
    }
    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
    public void clickElement(String locator){
        Find(locator).click();

    }

    public void AceptAlert(){
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }
    public void write (String locator, String TextToWrite){
        Find(locator).clear();
        Find(locator).sendKeys(TextToWrite);
    }

    public String GetValueFromTable( String locator){

        return Find(locator).getText();

    }

    public void scrolldown() throws InterruptedException{
       try {
       }catch (NoSuchElementException e){
           e.printStackTrace();
       }
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        wait = new WebDriverWait(driver, 10);
    }
}
