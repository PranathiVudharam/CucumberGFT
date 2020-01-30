package batchTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(features="demojan28.feature",glue= {"demojan"},tags= {"@datadriven"},plugin="json:target/cucumber-report.json")


public class TestRunner {

}
