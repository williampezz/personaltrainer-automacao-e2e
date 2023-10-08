package com.personalfit.app.pages;

import com.personalfit.app.core.BasePage;

public class HomePage extends BasePage {

    public void selectTypePersonal() {
        findElementByAccessibilityId("Sou um Personal").click();
    }

    public void selectTypeAluno() {
        findElementByAccessibilityId("Sou um aluno").click();
    }

}
