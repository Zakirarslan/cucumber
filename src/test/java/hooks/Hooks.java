package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    @Before
    public void setUpScenario(){
        System.out.println("Before Hooks");
    }
    @After
    public void tearDown(Scenario scenario) {
        //System.out.println("After Hooks");
       //byte[] screenshotpassed = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
       //scenario.attach(screenshotpassed, "image/png", "screenshot of failed step");
        //Driver.closeDriver();
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot of failed step");
            Driver.closeDriver();
        }
    }
    @After ("@teapot and @Flower" )

    public void tearDownspecific(){
        System.out.println("specific");
    }


}
