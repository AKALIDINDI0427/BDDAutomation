package com;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.java.After;
import io.cucumber.junit.*;
import resources.BasePage;


@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/java/feature/firstProgram.feature", glue="classpath:stepdef")
public class CucumberTemplate {
	
 private static BasePage base = new BasePage();
	
	
	@AfterClass
	public static void teardDown()
	{
		base.driver.quit();
	}
}
