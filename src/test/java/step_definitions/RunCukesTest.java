package step_definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		strict = false,
		features = "classpath:features",
		plugin = {"pretty", "json:target/cucumber.json"},
		tags = { "~@ignore" }
		)
public class RunCukesTest{
	
}