package Guru99;

import org.openqa.selenium.By;

public class SonyXperia extends Utils {
    LoadProp props=new LoadProp();
    double actualSonyXperiaprice=0.0;

    private By _sonyXPpriceProductPage=By.className("price");

    public void verifyURL(){
        validateURL(props.getProperty("expectedSponyXperiaURL"));
    }

    public void verifySonyXperiaPrice(){
       String priceProductPage=getTextFromContent(_sonyXPpriceProductPage);
       priceProductPage=priceProductPage.trim().replace("$", "").trim();
       actualSonyXperiaprice=Double.parseDouble(priceProductPage);
        System.out.println(actualSonyXperiaprice);
    }
    public void validatesonyxperiaprice(){

    }
}
