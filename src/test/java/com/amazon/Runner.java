package com.amazon;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
    //@CucumberOptions(glue="/home/middela/Azure_Repos/personal/bddCucumber/src/main/java/com/amazon/in/stepdefs",features = "src/test/homePageSanity.feature")
    //@CucumberOptions(features="home\\middela\\Azure_Repos\\personal\\bddCucumber\\src\\test\\homePageSanity.feature",glue={"com.amazon.in.stepdefs"})
@CucumberOptions(features="E:\\sampleMavenproject\\letsPlay-master\\Feature\\homePageSanity.feature",
        glue={"com.amazon.in.stepdefs"},
        dryRun = false,
        monochrome = true,
        plugin = {"pretty","html:test-output"}
)
    public class Runner {
    }
