package Guru99;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Utils {
    LoadProp props = new LoadProp();

    private By _username = By.xpath("//input[@name='uid']");
    private By _password = By.xpath("//input[@name='password']");
    private By _clicklongin = By.xpath("//input[@name='btnLogin']");

    public void verifyTitle() {
        driver.get(props.getProperty("url"));
        validateURL(props.getProperty("url"));
    }


    public void enterUsername() {
        enterText(_username, props.getProperty("username"));
    }

    public void enterPassword() {
        waitForElementVisible(_password, 100);
        enterText(_password, props.getProperty("password"));
    }

    public void clickonLoginbutton() {
        clickElement(_clicklongin);
    }




}