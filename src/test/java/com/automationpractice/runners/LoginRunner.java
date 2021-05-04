package com.automationpractice.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com/automationpractice/features/Login.feature", glue = "com.automationpractice.stepdefinitions", snippets = SnippetType.CAMELCASE, format = {"json:target/cucumber.json"})
public class LoginRunner {

}
