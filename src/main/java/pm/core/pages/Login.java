package pm.core.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pm.core.support.ApplicationPage;

/**
 * Created by Intellij IDEA 14
 * User:  m3ik0
 * Date:  2/9/15.
 */
public class Login extends ApplicationPage{

    @FindBy(id = "form[USR_USERNAME]")
    public WebElement username;

    @FindBy(id = "form[USR_PASSWORD]")
    public WebElement password;

    @FindBy(id = "form[USER_ENV]")
    public WebElement workspace;

    @FindBy(id = "form[USER_LANG]")
    public WebElement language;

    @FindBy(id = "form[BSUBMIT]")
    public WebElement loginButton;

    public Login(WebDriver driver) {
        super(driver);
        //This initElements method will create  all WebElements
        PageFactory.initElements(driver, this);
    }

    public void setUsername(String usr) {
        username.sendKeys(usr);
    }

    public void setPassword(String pass) {
        this.password.sendKeys(pass);
    }

    public void setWorkspace(String ws) {
        this.workspace.sendKeys(ws);
    }

    public void setLanguage(String lang) {
        this.language.sendKeys(lang);
    }

    public void clickLoginButton() {
        this.loginButton.click();
    }

    public void authenticate(String usr, String pass, String ws, String lang) {
        this.username.sendKeys(usr);
        this.password.sendKeys(pass);
        this.workspace.sendKeys(ws);
        this.language.sendKeys(lang);
        this.loginButton.click();
    }

}

