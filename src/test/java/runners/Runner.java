package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions" ,

        tags = "@US008",


        dryRun = true

)


public class Runner {




}
