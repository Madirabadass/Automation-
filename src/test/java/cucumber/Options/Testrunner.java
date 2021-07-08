package cucumber.Options;

import io.cucumber.core.backend.StepDefinition;
import org.junit.runner.RunWith;
import  io.cucumber.junit.CucumberOptions;
import  io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Resources/Features/Placevalidations.feature",glue = "Stepdefinitions")

public class Testrunner {
}
