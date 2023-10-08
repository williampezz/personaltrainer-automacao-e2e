package com.personalfit.app.core;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import static com.personalfit.app.core.DriverFactory.getDriver;

//Cria buscar genericas para evitar redundancias
public class BasePage {

    public MobileElement findElementByXpath(String xpath) {
        return getDriver().findElement(By.xpath(xpath));
    }

    public MobileElement findElementByAccessibilityId(String accessibilityId) {
        return getDriver().findElement(MobileBy.AccessibilityId(accessibilityId));
    }

    public void sendKeysByXpath(String xpath, String keysToSend) {
        MobileElement mobileElement = findElementByXpath(xpath);
        mobileElement.click();
        mobileElement.sendKeys(keysToSend);
    }

    public MobileElement findElementById(String id) {
        return getDriver().findElement(MobileBy.id(id));
    }
}
