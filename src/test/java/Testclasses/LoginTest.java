 package Testclasses;

import Pages.HomePage;
import Testbase.LoginPage;
import Testbase.MyaccPage;
import Testbase.WebtestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;




public class LoginTest extends WebtestBase {


    public HomePage homePage;
    public LoginPage loginPage;
    public MyaccPage myaccPage;

    LoginTest() {
        super();
    }

    @BeforeMethod

    public void beforeMethod() {
       intialization();


       
        homePage = new HomePage();
        loginPage = new LoginPage();
        myaccPage = new MyaccPage();

    }


    @Test
    public void verifyLoginWithVaildEmailAndVaildPassword() {
        SoftAssert softAssert = new SoftAssert();
        HomePage.clickOnSignIn();

        loginPage.login(prop.getProperty("Mobile"), prop.getProperty("Password"));
    }

        @AfterMethod
        public void tearDown() {
       // driver.close();
    }
}   



    












