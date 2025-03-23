package pages;

import helpMethods.ElementHelper;
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
    }

    public void enterOnAlertSubMenu(){
        elementHelper.clickJSLocator(IndexLocators.alertsSubMenu);
    }

    public void enterOnBrowserSubmenu(){
        elementHelper.clickJSLocator(IndexLocators.browserSubmenu);
    }

    public void enterOnFrameSubmenu(){
        elementHelper.clickJSLocator(IndexLocators.frameSubmenu);
    }

    public void enterOnFormsMenu(){
        elementHelper.clickJSLocator(IndexLocators.practiceFormsMenu);
    }

    public void enterOnFormsSubmenu(){
        elementHelper.clickJSLocator(IndexLocators.practiceFormSubMenu);
    }
}
