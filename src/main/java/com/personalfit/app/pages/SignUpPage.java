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
}
