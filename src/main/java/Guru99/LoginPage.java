package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage extends Utils {
    LoadProp props = new LoadProp();
    private By _actualWelcomeMessage = By.xpath("//marquee[@class='heading3']");
    private By _actualManagerID=By.xpath("//td[contains(text(),'Manger Id : mngr232573')]");

    public void validateurl() {
        validateURL(props.getProperty("expectedLoginPageURL"));
    }

    public void captureText() {
        String expectedWelcomemessage = props.getProperty("expected_message");
        String expected_ManagerID= props.getProperty("expected_ManagerID");


        WebDriverWait wait= new WebDriverWait(driver, 300);
        wait.until(ExpectedConditions.visibilityOfElementLocated(_actualWelcomeMessage));
        String actualText = getTextFromContent(_actualWelcomeMessage);
        String actualMID=getTextFromContent((_actualManagerID));
        System.out.println(actualText);
        System.out.println(actualMID);
        Assert.assertEquals(actualText, expectedWelcomemessage);
        Assert.assertEquals(actualMID, expected_ManagerID);

    }
}