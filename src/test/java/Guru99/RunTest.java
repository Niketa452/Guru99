package Guru99;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features=".", tags=("@login, @~mobilecategory, @~verifySonyXperiaprice"), plugin= {"pretty", "html:target/Destination"})
public class RunTest {
}
