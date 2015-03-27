package pm.core.support;

import org.openqa.selenium.WebDriver;

/**
 * Created by Intellij IDEA 14
 * User:  m3ik0
 * Date:  2/9/15.
 */
public abstract class ApplicationPage {
    protected WebDriver driver;

    public ApplicationPage(WebDriver driver) {
        this.driver = driver;
    }
}

