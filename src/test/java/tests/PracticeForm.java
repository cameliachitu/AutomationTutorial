package tests;

import helpMethods.ElementHelper;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import sharedData.SharedData;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PracticeForm extends SharedData {


    @Test
    public void metodaTest() {

        ElementHelper elementHelper = new ElementHelper(driver);

        By formsMenu = By.xpath("//h5[text()='Forms']");
        elementHelper.clickJSLocator(formsMenu);

        By practiceFormSubMenu = By.xpath("//span[text()='Practice Form']");
        elementHelper.clickJSLocator(practiceFormSubMenu);

        By firstNameElement = By.xpath("//input[@placeholder='First Name']");
        String firstNameValue = "Camelia";
        elementHelper.fillLocator(firstNameElement, firstNameValue);

        By lastNameElement = By.xpath("//input[@placeholder='Last Name']");
        String lastNameValue = "Chitu";
        elementHelper.fillLocator(lastNameElement, lastNameValue);

        By emailElement = By.id("userEmail");
        String emailValue = "camelia.chitu@gmail.com";
        elementHelper.fillLocator(emailElement, emailValue);


        String genderValue = "Female";
        By genderOptionsElement = By.xpath("//input[@name='gender']");
        List<WebElement> genderOptionsList = driver.findElements(genderOptionsElement);
        if (genderValue.equals("Male")) {
            elementHelper.clickJSLocator(genderOptionsList.get(0));
        }
        if (genderValue.equals("Female")) {
           elementHelper.clickJSLocator(genderOptionsList.get(1));
        }
        if (genderValue.equals("Other")) {
            elementHelper.clickJSLocator(genderOptionsList.get(2));
        }


        By mobilePhoneElement = By.xpath("//input[@placeholder='Mobile Number']");
        String mobilePhoneValue = "0772141795";
        elementHelper.fillLocator(mobilePhoneElement, mobilePhoneValue);

        By subjectsElement = By.id("subjectsInput");
        elementHelper.clickJSLocator(subjectsElement);


        //Trebuie sa facem o lista de Stringuri si sa adaugam elementele pe care vrem sa le adaugam
        //Trebuie sa parcurgem lista pe care am facut-o cu un for
        //In interiorul for-ului trebuie sa completez pe rand fiecare valoare in subjectElement si apoi sa apas un ENTER

        List<String> subjects = new ArrayList<>();
        subjects.add("Maths");
        subjects.add("Arts");
        subjects.add("Biology");
        subjects.add("Chemistry");


        for (int index = 0; index < subjects.size(); index++) {
//            subjectsElement.sendKeys(subjects.get(index));
//            subjectsElement.sendKeys(Keys.ENTER);
            elementHelper.fillPressLocator(subjectsElement, subjects.get(index), Keys.ENTER);
        }


        List<String> hobbies = new ArrayList<>();
        hobbies.add("Sports");
        hobbies.add("Reading");
        hobbies.add("Music");

        List<WebElement> hobbiesOptionsList = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']//label"));
        for (int index = 0; index < hobbies.size(); index++) {
            String currentText = hobbiesOptionsList.get(index).getText();
            if (hobbies.contains(currentText)) {
                executor.executeScript("arguments[0].click();", hobbiesOptionsList.get(index));
            }

        }

        By pictureElement = By.id("uploadPicture");
        File file = new File("src/test/resources/2022-12-14 (1).png");
        elementHelper.fillLocator(pictureElement, file.getAbsolutePath());

        By addressElement = By.id("currentAddress");
        String addressValue = "Unirii 65";
        elementHelper.fillLocator(addressElement, addressValue);

        By stateElement = By.xpath("//div[text()='Select State']");
        elementHelper.clickJSLocator(stateElement);

        By stateInputElement = By.id("react-select-3-input");
        String stateInputValue = "NCR";
//        stateInputElement.sendKeys(stateInputValue);
//        stateInputElement.sendKeys(Keys.ENTER);
        elementHelper.fillPressLocator(stateInputElement, stateInputValue, Keys.ENTER);

        By cityElement = By.xpath("//div[text()='Select City']");
        elementHelper.clickJSLocator(cityElement);

        By cityInputElement = By.id("react-select-4-input");
        String cityInputValue = "Delhi";
//        cityInputElement.sendKeys(cityInputValue);
//        cityInputElement.sendKeys(Keys.ENTER);
        elementHelper.fillPressLocator(cityElement, cityInputValue, Keys.ENTER);

        By submitElement = By.id("submit");
        elementHelper.clickJSLocator(submitElement);

        //pana aici am lucrat 26.02

        WebElement thankyouElement = driver.findElement(By.id("example-modal-sizes-title-lg"));
        String expectedMessage = "Thanks for submitting the form";
        String actualMessage = thankyouElement.getText();
        Assert.assertEquals(actualMessage, expectedMessage);
        System.out.println("Testul a fost validat");

        List<WebElement> tablesRowsList = driver.findElements(By.xpath("//tbody/tr"));
        Assert.assertTrue(tablesRowsList.get(0).getText().contains("Student Name"));
        Assert.assertTrue(tablesRowsList.get(0).getText().contains(firstNameValue));
        Assert.assertTrue(tablesRowsList.get(0).getText().contains(lastNameValue));

        Assert.assertTrue(tablesRowsList.get(1).getText().contains("Student Email"));
        Assert.assertTrue(tablesRowsList.get(1).getText().contains(emailValue));

        Assert.assertTrue(tablesRowsList.get(2).getText().contains("Gender"));
        Assert.assertTrue(tablesRowsList.get(2).getText().contains(genderValue));

        Assert.assertTrue(tablesRowsList.get(3).getText().contains("Mobile"));
        Assert.assertTrue(tablesRowsList.get(3).getText().contains(mobilePhoneValue));

        Assert.assertTrue(tablesRowsList.get(5).getText().contains("Subjects"));
        Assert.assertTrue(tablesRowsList.get(5).getText().contains("Maths"));
        Assert.assertTrue(tablesRowsList.get(5).getText().contains("Arts"));
        Assert.assertTrue(tablesRowsList.get(5).getText().contains("Biology"));
        Assert.assertTrue(tablesRowsList.get(5).getText().contains("Chemistry"));

        Assert.assertTrue(tablesRowsList.get(6).getText().contains("Hobbies"));
        Assert.assertTrue(tablesRowsList.get(6).getText().contains("Sports"));
        Assert.assertTrue(tablesRowsList.get(6).getText().contains("Reading"));

        Assert.assertTrue(tablesRowsList.get(7).getText().contains("Picture"));
        Assert.assertTrue(tablesRowsList.get(7).getText().contains("2022-12-14 (1).png"));

        Assert.assertTrue(tablesRowsList.get(8).getText().contains("Address"));
        Assert.assertTrue(tablesRowsList.get(8).getText().contains(addressValue));

        Assert.assertTrue(tablesRowsList.get(9).getText().contains("State and City"));
        Assert.assertTrue(tablesRowsList.get(9).getText().contains(stateInputValue));
        Assert.assertTrue(tablesRowsList.get(9).getText().contains(cityInputValue));
    }

}

