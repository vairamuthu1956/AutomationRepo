package Testbase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utility.Utility.driver;

public class LoginPage extends WebtestBase{
    @FindBy(id="Mobile")
    WebElement mobileNumberTextBox;
    @FindBy(name="Password")
    WebElement passwordTextBox;
    @FindBy(xpath = "//button[@class='btn btn-block btn-darkred']")
    WebElement loginBtn;
    public LoginPage(){ PageFactory.initElements(driver, this);}
    public void login(String Mobile  , String Password ) {
        mobileNumberTextBox.sendKeys(Mobile);
        passwordTextBox.sendKeys(Password);
        loginBtn.click();



    }
}
