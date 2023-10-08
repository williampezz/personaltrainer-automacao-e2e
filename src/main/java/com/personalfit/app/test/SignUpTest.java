package com.personalfit.app.test;

import com.personalfit.app.core.BaseTest;
import com.personalfit.app.pages.HomePage;
import com.personalfit.app.pages.SignUpPage;
import com.personalfit.app.utils.GenerateEmail;
import io.appium.java_client.MobileElement;
import org.junit.Test;

public class SignUpTest extends GenerateEmail {

    GenerateEmail emailGenerator = new GenerateEmail();
    String generatedEmail = emailGenerator.genEmailRandom();

    private SignUpPage signUp = new SignUpPage();
    private HomePage home = new HomePage();

    @Test
    public void signUpValid() {
        home.selectTypePersonal();
        signUp.signUpButton();
        signUp.createEmail(generatedEmail+"@test.com");
        signUp.confirmeEmail(emailGenerator.getGeneratedEmail());
    }
}
