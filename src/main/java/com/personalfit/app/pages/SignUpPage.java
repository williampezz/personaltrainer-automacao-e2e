package com.personalfit.app.pages;

import com.personalfit.app.core.BasePage;
import com.personalfit.app.utils.GenerateEmail;

public class SignUpPage extends BasePage {

    private GenerateEmail genEmail = new GenerateEmail();


    public void signUpButton() {
        findElementByAccessibilityId("Criar conta").click();
    }

    public void createEmail(String cadEmail) {
        sendKeysByXpath("//android.widget.EditText[@index=0]", cadEmail);

    }

    public void confirmeEmail(String confEmail) {
        sendKeysByXpath("//android.widget.EditText[@index=1]", confEmail);
    }

    public void createPass(String cadPass) {
        sendKeysByXpath("//android.widget.EditText[@index=2]", cadPass);
    }

    public void confirmePass(String confPass) {
        sendKeysByXpath("//android.widget.EditText[@index=3]", confPass);
    }

    public void clickCreateAccount() {
        findElementByXpath("//android.widget.Button[@content-desc=\"Criar conta\"]").click();
    }

    public void accountOk() {
        findElementByAccessibilityId("Conta criada com sucesso!");


    }
}
