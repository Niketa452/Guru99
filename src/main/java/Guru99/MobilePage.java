package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.*;

public class MobilePage extends Utils {
    LoadProp props = new LoadProp();
    double expectedPricenumber=0.0;

    private By _clickonsortby = By.xpath("//select[@onchange='setLocation(this.value)']");
    private By _mobileproductgrid=By.xpath("//ul[@class='products-grid products-grid--max-4-col first last odd']");
    private By _sonyxperia=By.cssSelector("span#product-price-1");
    private By _clickonsonyxp=By.cssSelector("img#product-collection-image-1");


    public void verifyMobilePageURL() {
        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.equals(props.getProperty("expectedMobilePagTitle")));
    }

    public void selectNameOption() {
        selectByVisibleTesxt(_clickonsortby, "Name");

        }
    public void verifyMobileSortbyNamePage(){
        List <String> temp=new ArrayList<String>();
        List <String> temp1=new ArrayList<String>();
        List<WebElement>mobileproduct=driver.findElements(_mobileproductgrid);
        for (WebElement element:mobileproduct) {
            String products = element.getText();
            temp.add(products);
            temp1.add(products);
        }
        Collections.sort(temp);
        if (temp.equals(temp1)) {
            Assert.assertTrue(true);

        }
        else{
            System.out.println("List is not sorted");
        }

    }

    public void sonyXperiaPrice(){
        String price = getTextFromContent(_sonyxperia);
        price=price.trim().replace("$", "").trim();
        expectedPricenumber=Double.parseDouble(price);
        System.out.println(expectedPricenumber);
    }
    public void clickonSonyXperia(){
        clickElement(_clickonsonyxp);

    }
    }