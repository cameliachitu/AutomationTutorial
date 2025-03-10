package tests;

import helpMethods.ElementHelper;
import helpMethods.TabWindowHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import sharedData.SharedData;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BrowserTest extends SharedData {

    @Test
    public void metodaTest() {

        //obiect de tipul TabWindowHelper; similar cu cel de la Masini
        TabWindowHelper tabWindowHelper = new TabWindowHelper(driver);

        ElementHelper elementHelper = new ElementHelper(driver);

        By alertFrameWindowsMenu = By.xpath("//h5[text()='Alerts, Frame & Windows']");
        elementHelper.clickJSLocator(alertFrameWindowsMenu);

        By browserSubMenu = By.xpath("//span[text()='Browser Windows']");
        elementHelper.clickJSLocator(browserSubMenu);

        By tabButtonElement = By.id("tabButton");
        elementHelper.clickJSLocator(tabButtonElement);

        System.out.println(driver.getCurrentUrl());

//        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));
        tabWindowHelper.switchToSpecificTabWindow(1);

        System.out.println(driver.getCurrentUrl());

        //inchide tab-ul curent
//        driver.close();

        tabWindowHelper.closeCurrentTabWindow();

//        driver.switchTo().window(tabs.get(0));
        tabWindowHelper.switchToSpecificTabWindow(0);
        By windowButtonElement = By.id("windowButton");
        elementHelper.clickJSLocator(windowButtonElement);

        //pentru a ramane deschise ambele taburi
//        List<String> windows = new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(windows.get(1));

        tabWindowHelper.switchToSpecificTabWindow(1);


    }
}
