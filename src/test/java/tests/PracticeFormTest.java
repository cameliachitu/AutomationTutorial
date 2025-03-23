package tests;

import helpMethods.ElementHelper;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.PracticeFormPage;
import sharedData.SharedData;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PracticeFormTest extends SharedData {


    @Test
    public void metodaTest() {

        IndexPage indexPage = new IndexPage(driver);
        indexPage.enterOnFormsMenu();
        indexPage.enterOnFormsSubmenu();

        String firstNameValue = "Camelia";
        String lastNameValue = "Chitu";
        String emailValue = "camelia.chitu15@gmail.com";
        String genderValue = "female";
        String mobilePhoneValue = "0772141795";
        List<String> subjects = new ArrayList<>();
        subjects.add("Maths");
        subjects.add("Arts");
        subjects.add("Biology");
        subjects.add("Chemistry");
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Sports");
        hobbies.add("Reading");
        hobbies.add("Music");
        String addressValue = "Unirii 65";
        String pathValue = "src/test/resources/2022-12-14 (1).png";



        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.fillFirstName(firstNameValue);
        practiceFormPage.fillLastName(lastNameValue);
        practiceFormPage.fillEmail(emailValue);
        practiceFormPage.fillGender(genderValue);
        practiceFormPage.fillMobilePhone(mobilePhoneValue);
        practiceFormPage.fillSubjects(subjects);
        practiceFormPage.fillHobbies(hobbies);
        practiceFormPage.fillCurrentAddress(addressValue);
        practiceFormPage.pictureUpload(pathValue);


//        By practiceFormSubMenu = By.xpath("//span[text()='Practice Form']");
//        elementHelper.clickJSLocator(practiceFormSubMenu);
//
//        By firstNameElement = By.xpath("//input[@placeholder='First Name']");
//        String firstNameValue = "Camelia";
//        elementHelper.fillLocator(firstNameElement, firstNameValue);
//
//        By lastNameElement = By.xpath("//input[@placeholder='Last Name']");
//        String lastNameValue = "Chitu";
//        elementHelper.fillLocator(lastNameElement, lastNameValue);
//
//        By emailElement = By.id("userEmail");
//        String emailValue = "camelia.chitu@gmail.com";
//        elementHelper.fillLocator(emailElement, emailValue);
//
//
//        String genderValue = "Female";
//        By genderOptionsElement = By.xpath("//input[@name='gender']");
//        List<WebElement> genderOptionsList = driver.findElements(genderOptionsElement);
//        if (genderValue.equals("Male")) {
//            elementHelper.clickJSLocator(genderOptionsList.get(0));
//        }
//        if (genderValue.equals("Female")) {
//           elementHelper.clickJSLocator(genderOptionsList.get(1));
//        }
//        if (genderValue.equals("Other")) {
//            elementHelper.clickJSLocator(genderOptionsList.get(2));
//        }
//
//
//        By mobilePhoneElement = By.xpath("//input[@placeholder='Mobile Number']");
//        String mobilePhoneValue = "0772141795";
//        elementHelper.fillLocator(mobilePhoneElement, mobilePhoneValue);
//
//        By subjectsElement = By.id("subjectsInput");
//        elementHelper.clickJSLocator(subjectsElement);
//
//
//        //Trebuie sa facem o lista de Stringuri si sa adaugam elementele pe care vrem sa le adaugam
//        //Trebuie sa parcurgem lista pe care am facut-o cu un for
//        //In interiorul for-ului trebuie sa completez pe rand fiecare valoare in subjectElement si apoi sa apas un ENTER
//
//        List<String> subjects = new ArrayList<>();
//        subjects.add("Maths");
//        subjects.add("Arts");
//        subjects.add("Biology");
//        subjects.add("Chemistry");
//
//
//        for (int index = 0; index < subjects.size(); index++) {
////            subjectsElement.sendKeys(subjects.get(index));
////            subjectsElement.sendKeys(Keys.ENTER);
//            elementHelper.fillPressLocator(subjectsElement, subjects.get(index), Keys.ENTER);
//        }
//
//
//        List<String> hobbies = new ArrayList<>();
//        hobbies.add("Sports");
//        hobbies.add("Reading");
//        hobbies.add("Music");
//
//        List<WebElement> hobbiesOptionsList = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']//label"));
//        for (int index = 0; index < hobbies.size(); index++) {
//            String currentText = hobbiesOptionsList.get(index).getText();
//            if (hobbies.contains(currentText)) {
//               elementHelper.clickJSLocator(hobbiesOptionsList.get(index));
//            }
//
//        }
//
//        By pictureElement = By.id("uploadPicture");
//        File file = new File("src/test/resources/2022-12-14 (1).png");
//        elementHelper.fillLocator(pictureElement, file.getAbsolutePath());
//
//        By addressElement = By.id("currentAddress");
//        String addressValue = "Unirii 65";
//        elementHelper.fillLocator(addressElement, addressValue);
//
//        By stateElement = By.xpath("//div[text()='Select State']");
//        elementHelper.clickJSLocator(stateElement);
//
//        By stateInputElement = By.id("react-select-3-input");
//        String stateInputValue = "NCR";
////        stateInputElement.sendKeys(stateInputValue);
////        stateInputElement.sendKeys(Keys.ENTER);
//        elementHelper.fillPressLocator(stateInputElement, stateInputValue, Keys.ENTER);
//
//        By cityElement = By.xpath("//div[text()='Select City']");
//        elementHelper.clickJSLocator(cityElement);
//
//        By cityInputElement = By.id("react-select-4-input");
//        String cityInputValue = "Delhi";
////        cityInputElement.sendKeys(cityInputValue);
////        cityInputElement.sendKeys(Keys.ENTER);
//        elementHelper.fillPressLocator(cityInputElement, cityInputValue, Keys.ENTER);
//
//        By submitElement = By.id("submit");
//        elementHelper.clickJSLocator(submitElement);
//
//        //pana aici am lucrat 26.02
//
//        By thankyouElement = By.id("example-modal-sizes-title-lg");
//        String expectedMessage = "Thanks for submitting the form";
//        elementHelper.validateTextLocator(thankyouElement, expectedMessage);
////        String actualMessage = thankyouElement.getText();
////        Assert.assertEquals(actualMessage, expectedMessage);
////        System.out.println("Testul a fost validat");
//
//        By tablesRowsListElement = By.xpath("//tbody/tr");
//        List<WebElement> tablesRowsList = driver.findElements(tablesRowsListElement);
//        elementHelper.validateTextContainsElement(tablesRowsList.get(0), "Student Name");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(0), firstNameValue);
//        elementHelper.validateTextContainsElement(tablesRowsList.get(0),lastNameValue);
//
//        elementHelper.validateTextContainsElement(tablesRowsList.get(1),"Student Email");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(1), emailValue);
//
//        elementHelper.validateTextContainsElement(tablesRowsList.get(2),"Gender");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(2), genderValue);
//
//        elementHelper.validateTextContainsElement(tablesRowsList.get(3),"Mobile");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(3), mobilePhoneValue);
//
//        elementHelper.validateTextContainsElement(tablesRowsList.get(5),"Subjects");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(5),"Maths");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(5),"Arts");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(5),"Biology");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(5),"Chemistry");
//
//        elementHelper.validateTextContainsElement(tablesRowsList.get(6),"Hobbies");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(6),"Sports");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(6),"Reading");
//
//        elementHelper.validateTextContainsElement(tablesRowsList.get(7),"Picture");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(7),"2022-12-14 (1).png");
//
//        elementHelper.validateTextContainsElement(tablesRowsList.get(8),"Address");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(8), addressValue);
//
//        elementHelper.validateTextContainsElement(tablesRowsList.get(9),"State and City");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(9), stateInputValue);
//        elementHelper.validateTextContainsElement(tablesRowsList.get(9), cityInputValue);
    }

}

