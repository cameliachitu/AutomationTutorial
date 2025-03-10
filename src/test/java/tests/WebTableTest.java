package tests;

import helpMethods.ElementHelper;
import helpMethods.TabWindowHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableTest {

    public WebDriver driver;

    @Test
    public void metodaTest() {

        TabWindowHelper tabWindowHelper = new TabWindowHelper(driver);
        ElementHelper elementHelper = new ElementHelper(driver);

//        //deschidem un browser
//        driver = new ChromeDriver();
//
//        //accesam o pagina Web
//        driver.get("https://demoqa.com");
//
//        //facem browserul in modul maximaze
//        driver.manage().window().maximize();
//
//        JavascriptExecutor executor = (JavascriptExecutor) driver;


        By elementsMenu = By.xpath("//h5[text()='Elements']");
        elementHelper.clickJSLocator(elementsMenu);

        By webTablesSubMenu = By.xpath("//span[text()='Web Tables']");
        elementHelper.clickJSLocator(webTablesSubMenu);

        List<WebElement> tablesRowList = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));
        Assert.assertEquals(tablesRowList.size(), 3, "Valoarea initiala a tabelului nu este 3");


        //indentificam un element
        By addElement = By.id("addNewRecordButton");
        elementHelper.clickJSLocator(addElement);

        //JavascriptExecutor folosit pentru erori click intercepted (reclame)
        //nu trebuie abuzat de acest lucru, deoarece el forteaza lucrurile

        By firstNameElement = By.id("firstName");
        String firstNameValue = "Chitu";
        elementHelper.fillLocator(firstNameElement, firstNameValue);

        By lastNameElement = By.id("lastName");
        String lastNameValue = "Camelia";
        elementHelper.fillLocator(lastNameElement, lastNameValue);

        By userEmailElement = By.id("userEmail");
        String userEmailValue = "camelia.chitu15@gmail.com";
        elementHelper.fillLocator(userEmailElement, userEmailValue);

        By ageElement = By.id("age");
        String ageValue = "25";
        elementHelper.fillLocator(ageElement, ageValue);

        By salaryElement = By.id("salary");
        String salaryValue = "3000";
        elementHelper.fillLocator(salaryElement, salaryValue);

        By departmentElement = By.id("department");
        String departmentValue = "it";
        elementHelper.fillLocator(departmentElement, departmentValue);

        By submitElement = By.id("submit");
        elementHelper.clickJSLocator(submitElement);

        tablesRowList = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));
        Assert.assertEquals(tablesRowList.size(), 4, "Valoarea actuala a tabelului nu este 4");
        String expectedRow = tablesRowList.get(3).getText();
        Assert.assertTrue(expectedRow.contains(firstNameValue));
        Assert.assertTrue(expectedRow.contains(lastNameValue));
        Assert.assertTrue(expectedRow.contains(userEmailValue));
        Assert.assertTrue(expectedRow.contains(ageValue));
        Assert.assertTrue(expectedRow.contains(salaryValue));
        Assert.assertTrue(expectedRow.contains(departmentValue));


        //edit functionality
        By editElement = By.id("edit-record-4");
        elementHelper.clickJSLocator(editElement);

        By editFirstNameElement = By.id("firstName");
        String editFirstNameValue = "Alexandra";
        editFirstNameElement.clear();
        elementHelper.fillLocator(editFirstNameElement, editFirstNameValue);

        By editLastNameElement = By.id("lastName");
        String editLastNameValue = "Ioana";
        editLastNameElement.clear();
        elementHelper.fillLocator(editLastNameElement, editLastNameValue);

        By editUserEmailElement = By.id("userEmail");
        String editUserEmailValue = "ioana.alexandra@gmail.com";
        editUserEmailElement.clear();
        elementHelper.fillLocator(editUserEmailElement, editUserEmailValue);

        By editAgeElement = By.id("age");
        String editAgeValue = "30";
        editAgeElement.clear();
        elementHelper.fillLocator(editAgeElement, editAgeValue);

        By editSalaryElement = By.id("salary");
        String editSalaryValue = "9000";
        editSalaryElement.clear();
        elementHelper.fillLocator(editSalaryElement, editSalaryValue);

        By editDepartmentElement = By.id("department");
        String editDepartmentValue = "Marketing";
        editDepartmentElement.clear();
        elementHelper.fillLocator(editDepartmentElement, editDepartmentValue);

        By resubmitElement = By.id("submit");
        elementHelper.clickJSLocator(resubmitElement);

    }
}
