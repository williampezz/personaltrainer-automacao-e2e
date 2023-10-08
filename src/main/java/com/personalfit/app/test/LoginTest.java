package com.personalfit.app.test;

import com.personalfit.app.core.BaseTest;
import com.personalfit.app.core.DriverFactory;
import com.personalfit.app.pages.HomePage;
import com.personalfit.app.pages.LoginPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

public class LoginTest extends BaseTest {

    public AndroidDriver<MobileElement> driver;

    private HomePage home = new HomePage();
    private LoginPage login = new LoginPage();

    @Before
    public void inicializaAppiumFlutter() throws MalformedURLException {
        driver = DriverFactory.getDriver();
    }


    @Test
    public void LoginValid() {
        home.selectTypePersonal();
        login.insertEmail("brunofsimon@outlook.com");
        login.insertPass("3030150");
        login.clickEnter();
        }

    @Test
    public void LoginInvalid() {
        home.selectTypePersonal();
        login.insertEmail("brunofsimon@outlook.com");
        login.insertPass("2154!@");
        login.clickEnter();
        login.loginFalse();
    }

    }

