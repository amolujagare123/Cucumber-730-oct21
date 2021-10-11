package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/login2.feature"
        ,glue = "stepdefinition"
       /* ,tags = "@login"*/
, plugin = {"pretty","html:target/cucumber/report.html"}
)
public class TestRunner {
}
