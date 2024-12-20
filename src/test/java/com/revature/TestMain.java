package com.revature;

import com.revature.pom.Registration;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "com.revature.steps",
        plugin = {"pretty", "html:src/test/resources/reports/html-report.html"}
)
public class TestMain {

    public static WebDriver driver = null;
    public static Registration registration;

    /*
        BeforeClass, provided by Junit, tells Junit to execute the associated method before any other
        tests. This is a useful tool for doing any setup that is needed across multiple tests, and is
        going to be more commonly used for System Testing than Integration or Unit Testing
     */

    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        registration = new Registration(driver);
    }

    /*
        AfterClass, provided by Junit, tells Junit to execute the associated method after all the testing is
        done. This is a useful tool for destroying any resources that need to be closed or generated
        reports not covered by your testing tools.
     */

    @AfterClass
    public static void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }
}