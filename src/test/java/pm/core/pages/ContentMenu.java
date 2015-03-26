package pm.core.pages;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pm.core.support.Constants;
import pm.core.support.Utils;

import java.util.concurrent.TimeUnit;

/**
 * Created by user Paos on 24/03/2015.
 */
public class ContentMenu {
    WebDriver driver;
    // WebElement auth;
    Login login;
    header header;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get(Constants.LOGIN_PAGE);
        driver.manage().window().maximize();
        login = new Login(driver);
        header = new header(driver);

    }

    @And("^Click en Home$")
    public void Click_en_Home()  {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("pm_menu")));
        header.clickHome();
        //Thread.sleep (10000);
    }

    @And("^Click en Designer$")
    public void Click_en_Designer()  {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("pm_menu")));
        header.clickProcess();

    }

    @And("^Click en Dashboard")
    public void Click_en_Dasboards() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("pm_menu")));
        header.clickDashboards();

    }

    @And("^Click en Setup$")
    public void Click_en_Setup()  {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("pm_menu")));
        header.clickSetup();
    }

    @Then("^Show cases list$")
    public void Show_en_cases() {
        driver.get(Constants.HOME_PAGE);
    }

    @Then("^Show process list$")
    public void Show_en_Designer() {
        driver.get(Constants.PROCESS_PAGE);
    }

    @Then("^Show dashboards list$")
    public void Show_en_dashboards() {
        driver.get(Constants.DASHBOARDS_PAGE);
    }

    @Then("^Show Setup list$")
    public void Show_en_Setup() {
        driver.get(Constants.SETUP_PAGE);
    }

    @After
    public void tearDown() throws Exception {
        Utils.tearDown(driver);
    }
}


   /* @And("^Authenticate with admin$")
    public void Authenticate_with_admin() {
        login.authenticate(
                Constants.ADMIN_USER,
                Constants.ADMIN_PASS,
                Constants.DEFAULT_WS,
                Constants.DEFAULT_LANG);
    }*/
