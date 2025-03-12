package tests;

import helpMethods.AlertHelper;
import helpMethods.ElementHelper;
import helpMethods.TabWindowHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import sharedData.SharedData;

import java.time.Duration;

public class AlertTest extends SharedData {


    @Test
    public void metodaTest() {

        ElementHelper elementHelper = new ElementHelper(driver);
        AlertHelper alertHelper = new AlertHelper(driver);

        By alertsFrameWindowsMenu = By.xpath("//h5[text()='Alerts, Frame & Windows']");
        elementHelper.clickJSLocator(alertsFrameWindowsMenu);

        By alertsSubMenu = By.xpath("//span[text()='Alerts']");
        elementHelper.clickJSLocator(alertsSubMenu);

        By alertOkElement = By.id("alertButton");
        elementHelper.clickJSLocator(alertOkElement);

//        Alert alertOk = driver.switchTo().alert();
//        System.out.println(alertOk.getText());
//        alertOk.accept();
        alertHelper.acceptAlert();
        //in loc de cele 3 linii vom avea doar linia de sus

        By timerAlertElement = By.id("timerAlertButton");
        elementHelper.clickJSLocator(timerAlertElement);

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alertTimer = driver.switchTo().alert();
//        System.out.println(alertTimer.getText());
//        alertTimer.accept();
        //accept - pentru ok
        alertHelper.acceptAlert();

        By confirmButtonElement = By.id("confirmButton");
        elementHelper.clickJSLocator(confirmButtonElement);

        //dismiss - pentru cancel
//        Alert alertOkCancel = driver.switchTo().alert();
//        System.out.println(alertOkCancel.getText());
//        alertOkCancel.dismiss();
        alertHelper.cancelAlert();

        By promptButtonElement = By.id("promtButton");
        elementHelper.clickJSLocator(promptButtonElement);

        //completarea campului de alerta
//        Alert alertPrompt = driver.switchTo().alert();
//        System.out.println(alertPrompt.getText());
//        String alertValue = "Mesaj de alerta";
//        alertPrompt.sendKeys(alertValue);
        alertHelper.fillAlert("Mesaj de alerta");
    }
}
