package ru.hellocucumber;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@all",
        features = "src/test/resources/features",
        glue = {"ru"}
)
public class RunCucumberTest {
}
