package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestMts {
    static WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @BeforeAll
    public static void initDriver(){
        driver.get("https://www.mts.by/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement buttonCookie = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[2]/div/div[2]/button[2]"));
        buttonCookie.click();
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
    public void linkMoreAboutService() {
        WebElement linkMoreAboutService = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a"));
        linkMoreAboutService.click();
        Assertions.assertEquals(driver.getCurrentUrl(), "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/");
        driver.get("https://www.mts.by/");
    }

    @Test
    public void continueButton(){
        WebElement phoneNumberField = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        phoneNumberField.sendKeys("297777777");
        WebElement amountField = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        amountField.sendKeys("10");
        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        continueButton.click();
        WebElement bepaidIframe = driver.findElement(By.xpath("/html/body/div[8]/div/iframe"));
        driver.switchTo().frame(bepaidIframe);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/span[1]"))));
        WebElement text = driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/span[1]"));
        Assertions.assertEquals(text.getText(), "10.00 BYN");
        driver.get("https://www.mts.by/");
    }

    @AfterAll
    public static void closeDriver(){
        driver.quit();
    }
}


