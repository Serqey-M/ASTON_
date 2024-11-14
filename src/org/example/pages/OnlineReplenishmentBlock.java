package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnlineReplenishmentBlock extends Website {
    public By blockName = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2");
    public By logoVisa = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[1]/img");
    public By logoVerifiedByVisa = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[2]/img");
    public By logoMasterCard = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[3]/img");
    public By logoMasterCardSecureCode = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[4]/img");
    public By logoBelcart = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[5]/img");
    public By linkMoreAboutService = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a");
    public By paymentOption = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button");
    public By communicationServices = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[1]/p");
    public By homeInternet = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]/p");
    public By instalment = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[3]/p");
    public By arrears = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[4]/p");
    public By phoneNumberField = By.xpath("//*[@id=\"connection-phone\"]");
    public By subscriberNumberField = By.xpath("//*[@id=\"internet-phone\"]");
    public By accountNumberFor44 = By.xpath("//*[@id=\"score-instalment\"]");
    public By accountNumberFor2073 = By.xpath("//*[@id=\"score-arrears\"]");
    public By amountCommunicationServicesField = By.xpath("//*[@id=\"connection-sum\"]");
    public By amountHomeInternetField = By.xpath("//*[@id=\"internet-sum\"]");
    public By amountInstalmentField = By.xpath("//*[@id=\"instalment-sum\"]");
    public By amountArrearsField = By.xpath("//*[@id=\"arrears-sum\"]");
    public By emailCommunicationServicesField = By.xpath("//*[@id=\"connection-email\"]");
    public By emailHomeInternetField = By.xpath("//*[@id=\"internet-email\"]");
    public By emailInstalmentField = By.xpath("//*[@id=\"instalment-email\"]");
    public By emailArrearsField = By.xpath("//*[@id=\"arrears-email\"]");
    public By buttonPayConnection = By.xpath("//*[@id=\"pay-connection\"]/button");

    public OnlineReplenishmentBlock(WebDriver driver) {super(driver);}

    public void choosingPaymentOption(By element){
        webElement(paymentOption).click();
        webElement(element).click();
    }
    public PayConnection payConnection (String phoneNumber, String amount){
        return new PayConnection(driver, phoneNumber, amount);
    }
}
