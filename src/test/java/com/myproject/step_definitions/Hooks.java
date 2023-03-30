package com.myproject.step_definitions;

import com.myproject.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setup(){
        System.out.println("This is BEFORE method.It will execute before each scenario");
    }

    @After
    public void tearDownScenario(Scenario scenario){
        if (scenario.isFailed()){
            TakesScreenshot takesScreenshot= (TakesScreenshot) Driver.getDriver();
            byte[] screenshotAs = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotAs,"image/png",scenario.getName());
        }

        Driver.closeDriver();
    }
}