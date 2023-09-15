package Pages;

import Utility.ActionUtility;
import Utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Testbase.WebtestBase.driver;

public class MouseOverPage {
    @FindBy(xpath ="//span[text()='Browse Categories']")
    WebElement mouseOverElement ;
    @FindBy(xpath ="//i[@class='w-icon-mobile'])[1]")
    WebElement mobile;

    public MouseOverPage(){
        PageFactory.initElements(driver, this);
    }
    public void mouseOverAction1(){
        ActionUtility.mouseOverAction(mouseOverElement);}


    public void clickOnmobile(){
        Utility.explicitWaitForElement(mobile);
    }

}

