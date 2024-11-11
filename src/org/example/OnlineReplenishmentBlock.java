package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnlineReplenishmentBlock extends Website {
    By blockName = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2");
    By logoVisa = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[1]/img");
    By logoVerifiedByVisa = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[2]/img");
    By logoMasterCard = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[3]/img");
    By logoMasterCardSecureCode = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[4]/img");
    By logoBelcart = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[5]/img");
    By linkMoreAboutService = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a");
    By paymentOption = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button");
    By communicationServices = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[1]/p");
    By homeInternet = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]/p");
    By instalment = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[3]/p");
    By arrears = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[4]/p");
    By phoneNumberField = By.xpath("//*[@id=\"connection-phone\"]");
    By amountField = By.xpath("//*[@id=\"connection-sum\"]");
    By emailField = By.xpath("//*[@id=\"connection-email\"]");
    By continueButton = By.xpath("//*[@id=\"connection-phone\"]");
    WebDriver driver;


    public OnlineReplenishmentBlock(WebDriver driver) {
        super(driver);
    }
}
