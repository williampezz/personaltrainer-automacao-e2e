package com.personalfit.app.pages;

import com.personalfit.app.core.BasePage;

public class LoginPage extends BasePage {

    public void insertEmail(String email) {
        sendKeysByXpath("//android.widget.EditText[@index=0]", email);
    }

    public void insertPass(String pass) {
        sendKeysByXpath("//android.widget.EditText[@index=1]", pass);
    }

    public void clickEnter() {
        findElementByAccessibilityId("Entrar").click();
    }
}
