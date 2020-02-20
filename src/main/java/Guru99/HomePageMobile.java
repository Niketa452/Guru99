package Guru99;

import org.openqa.selenium.By;

public class HomePageMobile extends Utils {
    LoadProp props = new LoadProp();

    private By _mobilelink = By.xpath("//a[contains(text(),'Mobile')]");

    public void verifyTitle() {
        driver.get(props.getProperty("url2"));
        validateURL(props.getProperty("url2"));

    }

    public void clickOnMobileLink() {
        clickElement(_mobilelink);


    }
}