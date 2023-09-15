package Pages;

import Testbase.WebtestBase;
import Utility.Utility;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.xml.xpath.XPath;

import static Utility.Utility.driver;

public class

HomePage  extends WebtestBase {
    @FindBy(xpath = "//span[text()='Sign In']")
    static
    WebElement SigninBtn;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    public static void clickOnSignIn() {
        SigninBtn.click();

    }
    @FindBy(xpath = "//span[text()='Browse Categories']")
    WebElement mouseoverelement;

    @FindBy(xpath = "//i[@class='w-icon-mobile'])[1]")
    WebElement mobile;



}


