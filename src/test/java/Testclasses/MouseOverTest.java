package Testclasses;

import Pages.HomePage;
import Pages.MouseOverPage;
import Testbase.WebtestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MouseOverTest extends WebtestBase {
    public HomePage homePage;
    public MouseOverPage mouseOverPage;

    MouseOverTest(){
        super();
    }

    @BeforeMethod
    public void beforeMethod(){
        intialization();
        homePage = new HomePage();
        mouseOverPage = new MouseOverPage();
    }




    @Test(description = "Verify Mouse Over Action")
    public void verifyMouseOverAction(){
        SoftAssert softAssert = new SoftAssert();
        mouseOverPage.mouseOverAction1();
        mouseOverPage.clickOnmobile();
       // softAssert.assertEquals(mouseOverPage.createdWishLists(),"Your Lists","Text should be match");
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}

