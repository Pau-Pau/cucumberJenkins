package pm.core.pages;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Intellij IDEA 14
 User:  m3ik0
 Date:  2/9/15.
 */
@RunWith(Cucumber.class)
@Cucumber.Options(features = {"src/test/resources/pm/core/pages/loginPaos.feature"})

//format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}
public class RunCukesTest {
}
