package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        tags="@SeleccionProducto"
)

public class Runner {
   /* @AfterClass
    public static void cleanDriver(){
        BasePage.CloseBrowser();
    }*/
}