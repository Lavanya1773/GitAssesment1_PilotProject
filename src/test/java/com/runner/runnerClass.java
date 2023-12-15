//package com.runner;
//import org.junit.runner.RunWith;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/resources/Features/AccountInformation.feature", glue = "com.stepdefinitions",plugin = {"pretty", "html:target/Reports/Cucuber.html", "junit:target/Reports/Cucuber.xml", "json:target/Reports/Cucuber.json"})
//
//public class runnerClass {
//
//}

// package com.runner;
// import org.testng.annotations.DataProvider;
// import io.cucumber.testng.AbstractTestNGCucumberTests;
// import io.cucumber.testng.CucumberOptions;

// @CucumberOptions(features = "src/test/resources/Features/message.feature", glue = "com.stepdefinitions")
 
// public class runnerTestNG extends AbstractTestNGCucumberTests{
// 	@Override
// 	@DataProvider(parallel = true)
// 	public Object[][] scenarios(){
// 		return super.scenarios();
// 	}
// }