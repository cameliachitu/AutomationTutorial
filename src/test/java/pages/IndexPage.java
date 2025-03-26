package pages;

import helpMethods.ElementHelper;
import loggerUtility.LoggerUtility;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pageLocators.BrowserWindowLocators;
import pageLocators.IndexLocators;

public class IndexPage {

    public WebDriver driver;
    public ElementHelper elementHelper;


    public IndexPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void enterOnAlertFrameWindowMenu(){
        elementHelper.clickJSLocator(IndexLocators.alertsFrameWindowsMenu);
        LoggerUtility.infoTest("The user clicks on Alert Frame Window Menu");
    }

    public void enterOnAlertSubMenu(){
        elementHelper.clickJSLocator(IndexLocators.alertsSubMenu);
        LoggerUtility.infoTest("The user clicks on Alerts SubMenu");
    }

    public void enterOnBrowserSubmenu(){
        elementHelper.clickJSLocator(IndexLocators.browserSubmenu);
        LoggerUtility.infoTest("The user clicks on Browser SubMenu");
    }

    public void enterOnFrameSubmenu(){
        elementHelper.clickJSLocator(IndexLocators.frameSubmenu);
        LoggerUtility.infoTest("The user clicks on Frame SubMenu");
    }

    public void enterOnFormsMenu(){
        elementHelper.clickJSLocator(IndexLocators.practiceFormsMenu);
        LoggerUtility.infoTest("The user clicks on Forms Menu");
    }

    public void enterOnFormsSubmenu(){
        elementHelper.clickJSLocator(IndexLocators.practiceFormSubMenu);
        LoggerUtility.infoTest("The user clicks on Forms SubMenu");
    }
}
