package Testclasses;

import Pages.HomePage;
import Testbase.WebtestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hometest extends WebtestBase {

     SoftAssert softAssert;
    public HomePage homePage;
    Hometest() {
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        intialization();
        homePage = new HomePage();
    }
    @Test(priority = 1)
    public void verifyFunctionalityOfLink() {
        softAssert = new SoftAssert();
        homePage.clickOnSignIn();
        System.out.println(driver.getCurrentUrl());
    }
}

