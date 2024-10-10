package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.BlueRental_LoginPage;

import java.util.List;

public class BlueRentalStepDef {
    BlueRental_LoginPage blueRentalloginPage=new BlueRental_LoginPage();

    @When("user enters admin email and password")
    public void user_enters_admin_email_and_password(io.cucumber.datatable.DataTable dataTable) {
        List<String> credentials=dataTable.row(1);
        // System.out.println("credentials = " + credentials);  //[jack1@gmail.com,12345 ]
        blueRentalloginPage.email.sendKeys(credentials.get(0));  //sends email dynamically
        blueRentalloginPage.password.sendKeys(credentials.get(1));  //sends password dynamically

    }
    @When("user clicks on login button\\(bluerentalcars)")
    public void user_clicks_on_login_button_bluerentalcars() {
       blueRentalloginPage.loginButton.click();
    }

    @Then("verify login is successful")
    public void verify_login_is_successful() {
        //System.out.println(blueRentalloginPage.adminProfile.getText());
        Assert.assertEquals("Jack Nickolson", blueRentalloginPage.adminProfile.getText());
    }

}
