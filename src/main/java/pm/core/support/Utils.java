package pm.core.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.IOException;

/**
 * Created by Intellij IDEA 14
 * User:  m3ik0
 * Date:  2/19/15.
 */
public class Utils {
    public static WebDriver setup(WebDriver driver) throws Exception {
        driver = setUpFirefox(driver, Constants.LOGIN_PAGE);
        return driver;
    }

    public static WebDriver setUpFirefox(WebDriver driver, String baseUrl) throws Exception{
        if(driver == null){
            FirefoxProfile firefoxProfile = new FirefoxProfile();
            firefoxProfile.setPreference("browser.download.folderList",2);
            firefoxProfile.setPreference("browser.download.manager.showWhenStarting",false);
            firefoxProfile.setPreference("browser.download.dir","/media/hdd1/Automation_firefox_downloads");
            firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/xml");
            driver = new FirefoxDriver(firefoxProfile);
            driver.get(baseUrl);
            return driver;
        } else return driver;
    }

    public static void tearDown(WebDriver driver) throws IOException {

            //driver.quit();
        Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
        //Thread.sleep(5000);
        Runtime.getRuntime().exec("taskkill /F /IM plugin-container.exe");
        Runtime.getRuntime().exec("taskkill /F /IM WerFault.exe");

    }
}
