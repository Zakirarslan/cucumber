package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.DataTable_Homepage;
import utilities.*;

import java.util.List;

public class DataTableStepDefs {
    DataTable_Homepage dataTable_homepage=new DataTable_Homepage();
    @And("user clicks on New button")
    public void userClicksOnNewButton() {

       dataTable_homepage.NewButton.click();
    }


    @And("user enters first name as {string}")
    public void userEntersFirstNameAs(String firstName) {
        dataTable_homepage.firstName.sendKeys(firstName);
        WaitUtils.waitFor(1);
    }


    @And("user enters last name as {string}")
    public void userEntersLastNameAs(String lastName) {
        dataTable_homepage.lastName.sendKeys(lastName);
        WaitUtils.waitFor(1);
    }

    @And("user enters position as {string}")
    public void userEntersPositionAs(String position) {
        dataTable_homepage.position.sendKeys(position);
        WaitUtils.waitFor(1);
    }

    @And("user enters office as {string}")
    public void userEntersOfficeAs(String office) {
        dataTable_homepage.office.sendKeys(office);
        WaitUtils.waitFor(1);
    }

    @And("user enters extension as {string}")
    public void userEntersExtensionAs(String extension) {
        dataTable_homepage.extension.sendKeys(extension);
        WaitUtils.waitFor(1);
    }

    @And("user enters start date as {string}")
    public void userEntersStartDateAs(String startDate) {
        dataTable_homepage.startDate.sendKeys(startDate);
        WaitUtils.waitFor(1);
    }

    @And("user enters salary as {string}")
    public void userEntersSalaryAs(String salary) {
        dataTable_homepage.salary.sendKeys(salary);
        WaitUtils.waitFor(1);
    }

    @And("user clicks on Create button")
    public void userClicksOnCreateButton() {
        dataTable_homepage.createButton.click();

    }

    @Then("verify that the name field contains {string}")
    public void verifyThatTheNameFieldContains(String firstName) {
        dataTable_homepage.searchBox.sendKeys(firstName);
        Assert.assertTrue(dataTable_homepage.nameField.getText().contains(firstName));

    }


}
