package pm.core.pages;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Intellij IDEA 14
 User:  m3ik0
 Date:  2/9/15.
 */
@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}
//features = {"src/test/resources/pm/core/pages/login1.feature"}
)
public class RunCukesTest {
}
