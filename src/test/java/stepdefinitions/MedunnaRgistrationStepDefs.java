package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.Medunna_RegistrationPage;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

import java.util.List;

public class MedunnaRgistrationStepDefs {
    Medunna_RegistrationPage medunnaRegistrationPage=new Medunna_RegistrationPage();

    @When("the user provides the following details")
    public void theUserProvidesTheFollowingDetails(io.cucumber.datatable.DataTable dataTable) {
        WaitUtils.waitFor(1);
        List<String> crd=dataTable.row(1);
        medunnaRegistrationPage.ssnField.sendKeys(crd.get(0));
        medunnaRegistrationPage.firstnameField.sendKeys(crd.get(1));
        medunnaRegistrationPage.lastNameField.sendKeys(crd.get(2));
        medunnaRegistrationPage.usernameField.sendKeys(crd.get(3));
        medunnaRegistrationPage.emailField.sendKeys(crd.get(4));
        medunnaRegistrationPage.firstPasswordField.sendKeys(crd.get(5));
        medunnaRegistrationPage.secondPasswordField.sendKeys(crd.get(6));
    }

    @And("the user clicks on Register button")
    public void theUserClicksOnRegisterButton() {
        JSUtils.JSscrollAllTheWayDown();
        JSUtils.JSclickWithTimeout(medunnaRegistrationPage.submitButton);



    }

    @Then("verify {string} is displayed")
    public void verifyIsDisplayed(String expectetMessage) {
        WaitUtils.waitForVisibility(medunnaRegistrationPage.message,2);
       // System.out.println("medunnaRegistrationPage.registerSuccessMesage = " + medunnaRegistrationPage
        // .registerSuccessMesage);

        Assert.assertEquals(medunnaRegistrationPage.message.getText(),expectetMessage);


    }

    @When("user enters SSN field {string}")
    public void userEntersSSNField(String ssn) {
        BrowserUtils.sendKeysWithTimeout(medunnaRegistrationPage.ssnField,ssn,2);

    }

    @And("user enters firstname {string}")
    public void userEntersFirstname(String firstname) {
        BrowserUtils.sendKeysWithTimeout(medunnaRegistrationPage.firstnameField,firstname,2);

    }

    @And("user enters lastname {string}")
    public void userEntersLastname(String lastname) {
        BrowserUtils.sendKeysWithTimeout(medunnaRegistrationPage.lastNameField,lastname,2);

    }

    @And("user enters username {string}")
    public void userEntersUsername(String username) {
        BrowserUtils.sendKeysWithTimeout( medunnaRegistrationPage.usernameField,username,2);

    }

    @And("user enters email {string}")
    public void userEntersEmail(String email) {
        BrowserUtils.sendKeysWithTimeout(medunnaRegistrationPage.emailField,email,2);

    }

    @And("user enters firstPassword {string}")
    public void userEntersFirstPassword(String firstpass) {
       BrowserUtils.sendKeysWithTimeout(medunnaRegistrationPage.firstPasswordField,firstpass,2);
    }

    @And("user enters secondPassword {string}")
    public void userEntersSecondPassword(String secondpass) {
       BrowserUtils.sendKeysWithTimeout(medunnaRegistrationPage.secondPasswordField,secondpass,2);
    }



    @Then("verify the {string} validation message is displayed")
    public void verifyTheValidationMessageIsDisplayed(String message) {
       // Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(), '"+message+"')]"))
        // .isDisplayed());

        Assert.assertTrue(Driver.getDriver().getPageSource().contains(message));

    }
}
