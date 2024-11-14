package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Website {
    By buttonCookie = By.xpath("/html/body/div[6]/main/div/div[2]/div/div[2]/button[2]");

    static WebDriver driver;
    String url = "https://www.mts.by/";

    public Website(WebDriver driver){
        Website.driver = driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        openWebsite(url);
        try {
            webElement(buttonCookie).click();
        }
        catch (Exception ignored){
        }
    }

    public static void openWebsite(String url){
        driver.get(url);
    }

    public WebElement webElement(By element){
        return driver.findElement(element);
    }

    public String name(By element){
        return webElement(element).getText();
    }

    public Boolean iconDisplay(By element){
        return webElement(element).isDisplayed();
    }

    public String attributeSearch(By element, String nameAttribute){
        return webElement(element).getAttribute(nameAttribute);
    }

    public void click(By element){
        webElement(element).click();
    }

    public String url(){
        return driver.getCurrentUrl();
    }

    public void fillingInField(By element, String data){
        webElement(element).sendKeys(data);
    }
}
