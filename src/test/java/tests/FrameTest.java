package tests;

import helpMethods.ElementHelper;
import helpMethods.TabWindowHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageLocators.IndexLocators;
import pages.FramePage;
import pages.IndexPage;
import sharedData.SharedData;

import java.time.Duration;

public class FrameTest extends SharedData {


    @Test
    public void metodaTest() {

        IndexPage indexPage = new IndexPage(driver);
        indexPage.enterOnAlertFrameWindowMenu();
        indexPage.enterOnFrameSubmenu();

        FramePage framePage = new FramePage(driver);
        framePage.switchToSpecificTab();
        framePage.switchToParent();



//        TabWindowHelper tabWindowHelper = new TabWindowHelper(driver);
//        ElementHelper elementHelper = new ElementHelper(driver);
//
////        JavascriptExecutor executor = (JavascriptExecutor) driver;
//
//        By frameMenu = By.xpath("//h5[text()='Alerts, Frame & Windows']");
//        elementHelper.clickJSLocator(frameMenu);
//
//        By frameSubMenu = By.xpath("//span[text()='Frames']");
//        elementHelper.clickJSLocator(frameSubMenu);
//
////        driver.switchTo().frame("frame1");
//        tabWindowHelper.switchToSpecificTabWindow2("frame1");
//
//        By textElement = By.id("sampleHeading");
//        System.out.println(textElement.getText());
//
//        driver.switchTo().parentFrame();
//        driver.switchTo().frame("frame2");
//
//        By textElement2 = By.id("sampleHeading");
//        System.out.println(textElement2.getText());
//
    }
}
