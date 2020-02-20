package Guru99;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import static Guru99.Utils.randomdate;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.apache.commons.io.FileUtils.copyFile;

public class Hooks extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProp props = new LoadProp();
    ExtentReports extent;
    ExtentTest logger;


    @Before
    public void browserSetup() {
        browserSelector.setUpBrowser();
        driver.manage().window().fullscreen();//to maximise the web page.
        driver.manage().timeouts().implicitlyWait(30, SECONDS);//waiting time before opening teh website
    }



    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenShotName = scenario.getName().replaceAll("[.,;:?!]", "") + randomdate() + ".png";
            try {
                File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                File destinationPath = new File(System.getProperty("user.dir") + "/target/Destination/screenshots" + screenShotName);
                copyFile(sourcePath, destinationPath);
                scenario.write("!!!!!!!!.....Scenario Failed.....!!!!!!!! Please see attached screenshot for the error/issue");
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");

            } catch (IOException e) {
            }
        }
         driver.quit();


    }
}