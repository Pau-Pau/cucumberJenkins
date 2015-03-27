package pm.core.pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Intellij IDEA 14
 * User:  m3ik0
 * Date:  2/18/15.
 */
public class CreateProcessStepDefinitions {
    WebDriver driver;
    WebElement auth;

    @Then("^Login to ProcessMaker app with Admin credentials")
    public void login_to_processmaker_app_with_admin_credentials() throws Throwable{
        auth = driver.findElement(By.name("form[USR_USERNAME]"));
        auth.sendKeys("admin");
        auth = driver.findElement(By.name("form[USR_PASSWORD]"));
        auth.sendKeys("admin");
        auth = driver.findElement(By.name("form[USER_ENV]"));
        auth.sendKeys("workflow");
        auth = driver.findElement(By.name("form[USER_LANG]"));
        auth.sendKeys("English");
        auth = driver.findElement(By.name("form[BSUBMIT]"));
        auth.sendKeys();
        auth.submit();
    }

    @And("^Go to (.*) menu$")
    public void go_to_sub_menu(String submenu) throws Throwable{
        auth = driver.findElement(By.cssSelector("#"+submenu+" a"));
        auth.sendKeys();
        auth.click();
    }
}
