/********      Framework has been created by Nachiyappan        *******/
package testRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
        (
		features=".//Features//",
		glue="stepDefinitions",
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		)
public class TestRun 
{

}
