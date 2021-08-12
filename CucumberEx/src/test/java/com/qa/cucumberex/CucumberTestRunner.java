package com.qa.cucumberex;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
features = {"classpath:features"},
glue = {"classpath:com.qa.cucumberex.calculator"},
snippets = SnippetType.CAMELCASE,
plugin = {"summary", "pretty"},
monochrome = true
	)

public class CucumberTestRunner {

}
