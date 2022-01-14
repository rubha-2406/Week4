package runner;

import io.cucumber.messages.types.StepDefinition;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/feature/Login.feature", monochrome = true , publish = true , glue = "steps", tags="@Regression or @smoke")
public class CucumberRunner extends StepDefinition{

}
