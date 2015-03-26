package pm.core.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pm.core.support.ApplicationPage;

/**
 * Created by user Paos on 24/03/2015.
 */
public class header extends ApplicationPage {

    @FindBy(id = "CASES")
    public WebElement Home;

    //@FindBy(xpath = )

    @FindBy(id = "PROCESSES")
    public WebElement Processes;

    @FindBy(id = "DASHBOARD")
    public WebElement Dasboards;

    @FindBy(id = "SETUP")
    public WebElement Setup;

    public header(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickHome() {
        this.Home.click();

    }

    public void clickProcess() {
        this.Processes.click();
    }

    public void clickDashboards() {
        this.Dasboards.click();
    }

    public void clickSetup() {
        this.Setup.click();

    }
}
