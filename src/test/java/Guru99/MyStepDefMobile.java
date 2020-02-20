package Guru99;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MyStepDefMobile {
    HomePageMobile homePageMobile=new HomePageMobile();
    MobilePage mobilePage=new MobilePage();
    SonyXperia sonyXperia=new SonyXperia();

    @Given("^User is on homepage$")
    public void user_is_on_homepage()  {
    homePageMobile.verifyTitle();
    }

    @When("^User clicks on Mobile link$")
    public void user_clicks_on_Mobile_link()  {
        homePageMobile.clickOnMobileLink();

    }

    @When("^User is navigated to mobile category page$")
    public void user_is_navigated_to_mobile_category_page()  {
        mobilePage.verifyMobilePageURL();


    }

    @When("^Selects 'Name' from 'Sort By' dropdown$")
    public void selects_Name_from_Sort_By_dropdown() {
        mobilePage.selectNameOption();

    }

    @Then("^Mobile products should be displayed in alphabetical order$")
    public void mobile_products_should_be_displayed_in_alphabetical_order() {
        mobilePage.verifyMobileSortbyNamePage();
    }
    @When("^User checks the price of Sony Xperia$")
    public void user_checks_the_price_of_Sony_Xperia()  {
        mobilePage.sonyXperiaPrice();

    }

    @When("^User clicks on Sony Xperia product$")
    public void user_clicks_on_Sony_Xperia_product()  {
        mobilePage.clickonSonyXperia();

    }

    @Then("^User is navigated to Sony Xperia product page$")
    public void user_is_navigated_to_Sony_Xperia_product_page()  {
        sonyXperia.verifyURL();

    }

    @Then("^Price of the product is same as the product list page$")
    public void price_of_the_product_is_same_as_the_product_list_page()  {
        sonyXperia.verifySonyXperiaPrice();
        if (sonyXperia.actualSonyXperiaprice==mobilePage.expectedPricenumber){
            Assert.assertTrue(true);
            System.out.println("The price of SonyXperia on the list page and product page is same");
        }
        else{
            System.out.println("The price of SonyXperia on the list page and product page is not same");
        }


    }



}
