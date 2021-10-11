package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@reg")
    public void beforeMyScenario()
    {
        System.out.println("***** beforeMyScenario() >>>>");
    }

    @After("@reg")
    public void afterMyScenario()
    {
        System.out.println("***** afterMyScenario() >>>>");
    }

}
