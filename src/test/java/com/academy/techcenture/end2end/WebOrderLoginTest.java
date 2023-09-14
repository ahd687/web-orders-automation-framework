package com.academy.techcenture.end2end;

import com.academy.techcenture.base.BaseTest;
import com.academy.techcenture.constants.Constants;
import com.academy.techcenture.pages.ViewAllOrdersPage;
import org.testng.annotations.Test;
import com.academy.techcenture.pages.LoginPage;

import static com.academy.techcenture.constants.Constants.*;

public class WebOrderLoginTest extends BaseTest {



    @Test
    public void loginPositiveTest() throws InterruptedException {
        extentTest = reports.startTest("Login Positive Test");
        LoginPage loginPage = new LoginPage(driver);
        ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage(driver);

        loginPage.verifyUserIsOnLoginPage();
        loginPage.login(USERNAME, PASSWORD);
        viewAllOrdersPage.verifyUserIsOnViewAllOrdersPage();
    }
    @Test
    public void loginIncorrectPasswordTest() throws InterruptedException {
        extentTest = reports.startTest("Login Incorrect Password");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyUserIsOnLoginPage();
        loginPage.login(USERNAME, INCORRECT_PASSWORD);
        loginPage.verifyLoginError();
    }


    @Test
    public void loginIncorrectUsernameTest() throws InterruptedException {
        extentTest = reports.startTest("Login Incorrect User Name");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyUserIsOnLoginPage();
        loginPage.login(INCORRECT_USERNAME, PASSWORD);
        loginPage.verifyLoginError();
    }

    @Test
    public void loginIncorrectUsernameAndIncorrectPasswordTest() throws InterruptedException {
        extentTest = reports.startTest("Incorrect Login Credentials");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyUserIsOnLoginPage();
        loginPage.login(INCORRECT_USERNAME, INCORRECT_PASSWORD);
        loginPage.verifyLoginError();
    }

    @Test
    public void loginEmptyCredentialsTest() throws InterruptedException {
        extentTest = reports.startTest("Empty Credential");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyUserIsOnLoginPage();
        loginPage.login(EMPTY_USERNAME,EMPTY_PASSWORD);
        loginPage.verifyLoginError();
    }




}
