package pm.core.pages;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pm.core.support.Constants;
import pm.core.support.Utils;

import java.util.concurrent.TimeUnit;

/**
 * Created by Intellij IDEA 14
 * User:  m3ik0
 * Date:  2/9/15.
 */
public class LoginStepDefinitions {
    WebDriver driver;
    Login login;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to(Constants.LOGIN_PAGE);
        driver.manage().window().maximize();
    }

    @Given("^The login page of ProcessMaker app is Loaded$")
    public void the_login_page_of_ProcessMaker_app_is_Loaded() throws Throwable {
        login = new Login(driver);
    }

    @Then("^Fill the username with (.*) and password with (.*)$")
    public void fill_the_username_and_password(String usr, String pass) throws Throwable {
        login.setUsername(usr);
        login.setPassword(pass);
    }

    @And("^Choose the workspace on you work e.g. (.*)$")
    public void choose_the_workflow_on_you_work(String ws) throws Throwable {
        login.setWorkspace(ws);
    }

    @And("^Select the (.*) language to manage the app$")
    public void select_the_language_to_manage_the_app(String lang) throws Throwable{
        login.setLanguage(lang);

    }

    @And("^Click on Login button$")
    public void click_on_Login_button() throws Throwable{
        login.clickLoginButton();
    }

    @Then("^The Homepage is displayed$")
    public void the_homepage_is_displayed() throws Throwable{
        driver.get(Constants.HOME_PAGE);
        HomePage homePage = new HomePage(driver);
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.id("pm_menu")));
        Assert.assertTrue(!homePage.getMain_menu().getText().toLowerCase().isEmpty());
    }

    @Then("^Authenticate with admin credentials$")
    public void authenticate_with_admin_credentials(){
        login.authenticate(
                Constants.ADMIN_USER,
                Constants.ADMIN_PASS,
                Constants.DEFAULT_WS,
                Constants.DEFAULT_LANG);
    }

    @After
    public void tearDown() throws Exception {
        Utils.tearDown(driver);

    }
}
