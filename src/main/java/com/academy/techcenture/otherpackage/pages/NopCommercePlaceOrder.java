package com.academy.techcenture.otherpackage.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NopCommercePlaceOrder {
    private WebDriver driver;

    public NopCommercePlaceOrder(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//a[contains(text(), 'Computers')])[1]")
    protected WebElement computersBtn;
    @FindBy(xpath = "(//a[@href='/desktops'])[1]")
    protected WebElement desktopBtn;
    @FindBy(xpath = "//a[text()='Lenovo IdeaCentre 600 All-in-One PC']")
    protected WebElement lenovoCompBtn;
    @FindBy(id="add-to-cart-button-3")
    protected WebElement addToCartBtn;

    @FindBy(xpath = "//a[text()= 'shopping cart']")
    protected  WebElement choppingCart;

    @FindBy(id ="termsofservice")
    protected WebElement termsOfServiceBtn;

    @FindBy(id ="checkout")
    protected WebElement checkoutBtn;

    @FindBy(xpath = "//input[@class='email']")
    protected WebElement emailField;

    @FindBy(xpath = "//input[@class='email']")
    protected WebElement passwordField;

    @FindBy(xpath ="//button[@class='button-1 login-button']")
    protected WebElement loginBtn;

    @FindBy(id ="BillingNewAddress_CountryId")
    protected WebElement selectCountyDropdown;
    @FindBy(id ="BillingNewAddress_StateProvinceId")
    protected  WebElement selectStateDropdown;
    @FindBy(id ="BillingNewAddress_City")
    protected WebElement cityNameField;
    @FindBy(id ="BillingNewAddress_Address1")
    protected WebElement streetNameField;
    @FindBy(id ="BillingNewAddress_Address2")
    protected WebElement aptNumberField;
    @FindBy(id ="BillingNewAddress_ZipPostalCode")
    protected WebElement zipcodeField;
    @FindBy(id ="BillingNewAddress_PhoneNumber")
    protected WebElement phoneNumberField;
    @FindBy(id="BillingNewAddress_FaxNumber")
    protected WebElement faxNumberField;
    @FindBy(xpath = "//button[@class ='button-1 new-address-next-step-button' and  @name ='save' ]")
    protected WebElement continueBtn;








}
