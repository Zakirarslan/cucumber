package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.Allovercommerce_locators;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.WaitUtils;

public class AllovercommerceStepDefs {
    Allovercommerce_locators allovercommerce_locators=new Allovercommerce_locators();

    @Given("user is on allovercommerce homepage")
    public void user_is_on_allovercommerce_homepage() {
        Driver.getDriver().get("https://allovercommerce.com/");
        WaitUtils.waitFor(2);

    }
    @And("user clicks on SignIn button")
    public void user_clicks_on_sign_in_button() {
        BrowserUtils.clickWithTimeOut(allovercommerce_locators.signIn,1);

    }
    @Then("user enters username and password")
    public void user_enters_username_and_password() {
        allovercommerce_locators.username.sendKeys("admin06");
        allovercommerce_locators.password.sendKeys("admin06");


    }
    @Then("user clicks on login button")
    public void user_clicks_on_login_button() {
        allovercommerce_locators.login.click();

    }
    @Then("verify url contains allover")
    public void verify_url_contains_allover() {
        System.out.println(Driver.getDriver().getCurrentUrl());
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("allover"));

    }
    @Then("close the driver")
    public void close_the_driver() {
        Driver.closeDriver();

    }


}
