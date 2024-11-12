package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestPayConnection {
    static String phoneNumber = "297777777";
    static String amount = "10.05";
    static WebDriver driver = new ChromeDriver();
    static PayConnection payConnection = new PayConnection(driver, phoneNumber, amount);

    @BeforeAll
    public static void initDriver() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void switchTo(){
        Assertions.assertInstanceOf(PayConnection.class, payConnection);
    }

    @Test
    public void headingAmount(){
        Assertions.assertEquals(payConnection.name(payConnection.headingAmount), amount + " BYN");
    }

    @Test
    public void nameButton(){
        Assertions.assertEquals(payConnection.name(payConnection.button), "Оплатить " + amount + " BYN");
    }

    @Test
    public void headingPhoneNumber(){
        Assertions.assertEquals(payConnection.name(payConnection.headingPhoneNumber), "Оплата: Услуги связи Номер:375" + phoneNumber);
    }

    @Test
    public void labelCardNumber(){
        Assertions.assertEquals(payConnection.name(payConnection.labelCardNumber), "Номер карты");
    }

    @Test
    public void labelValidityPeriod(){
        Assertions.assertEquals(payConnection.name(payConnection.labelValidityPeriod), "Срок действия");
    }

    @Test
    public void labelCVC(){
        Assertions.assertEquals(payConnection.name(payConnection.labelCVC), "CVC");
    }

    @Test
    public void labelNameHolder(){
        Assertions.assertEquals(payConnection.name(payConnection.labelNameHolder), "Имя держателя (как на карте)");
    }

    @Test
    public void logoVisa(){
        Assertions.assertTrue(payConnection.iconDisplay(payConnection.logoVisa));
    }



    @AfterAll
    public static void closeDriver(){
        driver.quit();
    }
}