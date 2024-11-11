package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Website {
    WebDriver driver;

    public Website(WebDriver driver){
        this.driver = driver;
    }

    public void openWebsite(String url){
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
}
