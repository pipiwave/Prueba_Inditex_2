package Runner;

import Pages.BasePage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Features"},
        glue = {"Steps"}
)

public class TestRunner {
    @AfterClass
    public static void cierraBrowser(){
        BasePage.closeBrowser();
    }
}
