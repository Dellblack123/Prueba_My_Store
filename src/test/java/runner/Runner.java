package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
glue = "steps",
plugin = "pretty")
public class Runner {

    @AfterClass
    public static void close(){
        BasePage.close();
    }
}