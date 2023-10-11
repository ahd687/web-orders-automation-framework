package com.academy.techcenture.otherpackage.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@class = 'ico-register']")
    protected WebElement registerLinkBtn;
    @FindBy(xpath = "//span[@class ='male']")
    protected WebElement maleBox;
    @FindBy(xpath = "//span[@class ='female']")
    protected WebElement femaleBox;
    @FindBy(id="FirstName")
    protected WebElement firstNameField;
    @FindBy(id="LastName")
    protected WebElement lastNameField;

    @FindBy(xpath = "//select[@name ='DateOfBirthDay']")
    protected WebElement dayDropdown;
    @FindBy(xpath = "//select[@name ='DateOfBirthMonth']")
    protected WebElement monthDropdown;
    @FindBy(xpath = "//select[@name ='DateOfBirthYear']")
    protected WebElement yearDropdown;
    @FindBy(id = "Email")
    protected WebElement registerEmailField;
    @FindBy(id ="Company")
    protected WebElement company;
    @FindBy(id ="Password")
    protected WebElement registerPasswordField;
    @FindBy(id= "ConfirmPassword")
    protected WebElement registerConfirmPasswordField;
    @FindBy(id="register-button")
    protected WebElement registerBtn;

    public void fillOutRegisterFields(){

    }




}
