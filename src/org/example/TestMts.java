package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestMts {
    WebDriver driver = new ChromeDriver();

    @BeforeEach
    public void initDriver(){
        driver.get("https://www.mts.by/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement buttonCooki = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[2]/div/div[2]/button[2]"));
        buttonCooki.click();

    }

    @Test
    public void blockName(){
        WebElement blockName = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2"));
        Assertions.assertEquals(blockName.getText(), "Онлайн пополнение\nбез комиссии");
        }

    @Test
    public void logoVisa(){
        WebElement logoVisa = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[1]/img"));
        Assertions.assertTrue(logoVisa.isDisplayed());
        Assertions.assertEquals(logoVisa.getAttribute("alt"), "Visa");
    }

    @Test
    public void logoVerifiedByVisa(){
        WebElement logoVerifiedByVisa = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[2]/img"));
        Assertions.assertTrue(logoVerifiedByVisa.isDisplayed());
        Assertions.assertEquals(logoVerifiedByVisa.getAttribute("alt"), "Verified By Visa");
    }

    @Test
    public void logoMasterCard(){
        WebElement logoMasterCard = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[3]/img"));
        Assertions.assertTrue(logoMasterCard.isDisplayed());
        Assertions.assertEquals(logoMasterCard.getAttribute("alt"), "MasterCard");
    }

    @Test
    public void logoMasterCardSecureCode(){
        WebElement logoMasterCardSecureCode = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[4]/img"));
        Assertions.assertTrue(logoMasterCardSecureCode.isDisplayed());
        Assertions.assertEquals(logoMasterCardSecureCode.getAttribute("alt"), "MasterCard Secure Code");
    }

    @Test
    public void logoBelcart(){
        WebElement logoBelcart = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[5]/img"));
        Assertions.assertTrue(logoBelcart.isDisplayed());
        Assertions.assertEquals(logoBelcart.getAttribute("alt"), "Белкарт");
    }

    @Test
    public void linkMoreAboutService() throws InterruptedException {
        WebElement linkMoreAboutService = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a"));
        linkMoreAboutService.click();
        System.out.println(driver.getCurrentUrl());
    }

//    @AfterAll
//    public static void closeDriver(){
//        driver.quit();
//    }
}


