package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Google_Homepage;
import utilities.Driver;
import utilities.WaitUtils;

public class GoogleStepDefs {
    Google_Homepage google_homepage=new Google_Homepage();

    /*
     *********** STEP DEFINITIONS **********
     * After we create our test Sceanrios, we need to generate step definitions to write our code
     * Use Runner to generate the missing step definitions
     * Use the templates and add them in your step definitions folder
     * Then complete your java code using page object modeling
     * @tags are used to run specific test scenarios. we can use multiple tags
     */
    @Given("user is on the google homepage")
    public void user_is_on_the_google_homepage() {
        Driver.getDriver().get("https://www.google.com/");
        WaitUtils.waitFor(2);
        try {
            google_homepage.cookiePopUp.click();
        }catch (Exception e){

        }

    }
    @And("user search for iphone")
    public void user_search_for_iphone() {
        google_homepage.searchBox.sendKeys("iphone", Keys.ENTER);
        WaitUtils.waitFor(2);

    }
    @Then("verify the result contains iphone")
    public void verify_the_result_contains_iphone() {
        System.out.println(":"+Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iphone"));
        WaitUtils.waitFor(2);

    }


    @And("user search for teapots")
    public void userSearchForTeapots() {
        google_homepage.searchBox.sendKeys("teapot",Keys.ENTER);
        WaitUtils.waitFor(2);
    }

    @Then("verify the result contains teapot")
    public void verifyTheResultContainsTeapot() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("teapot"));
        WaitUtils.waitFor(2);
    }
    //day31
    @Given("user search for {string}")
    public void user_search_for(String product) {
        google_homepage.searchBox.sendKeys(product,Keys.ENTER);
    }



}

































