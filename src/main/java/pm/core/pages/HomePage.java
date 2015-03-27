package pm.core.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pm.core.support.ApplicationPage;

/**
 * Created by Intellij IDEA 14
 * User:  m3ik0
 * Date:  2/19/15.
 */
public class HomePage extends ApplicationPage{

    @FindBy(id = "pm_menu")
    WebElement main_menu;

    public HomePage (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getMain_menu(){
        return	main_menu;
    }
}
