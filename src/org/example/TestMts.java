package org.example;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMts {
    WebDriver driver = new ChromeDriver();

    @BeforeEach
    public void initDriver(){
        driver.get("https://www.mts.by/");
    }

    @Test
    public void blockName(){
        WebElement blockName = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2"));
        System.out.println(blockName.getText());

        }

    @AfterEach
    public void closeDriver(){
        driver.quit();
    }
}


