package org.sgcib.itec.fcc.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(strict = true, 
features = { 
	"features"}, 
plugin = { "pretty", "html:target/cucumber-html", "json:target/cucumber.json" }, 
tags = { "~@ignore" , "@sprint_1" })
public class CucumberTest {

}