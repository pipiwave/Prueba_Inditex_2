package Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import static Pages.Locators.BasePageLocators.*;

public class BasePage {
    public static WebDriver driver;

    public BasePage(){
        System.setProperty(CHROMEDRIVER, PATH_DRIVER);
        BasePage.driver = new ChromeDriver();
        BasePage.driver.manage().window().maximize();

    }

    public void navigateTo(String url){
        driver.get(url);

    }
    public WebElement find(By locator){

        return driver.findElement(locator);
    }

    public void write(By locator, String text){

        find(locator).clear();
        find(locator).sendKeys(text);
    }

    public void click(By locator){
        find(locator).click();
    }

    public static void closeBrowser(){
        driver.quit();
    }

    public void takeScreen() throws IOException {
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        File screenfile = screenshot.getScreenshotAs(OutputType.FILE);
        File pathfile = new File(PATH_SCREENSHOT);
        FileUtils.copyFile(screenfile,pathfile);
    }

}
