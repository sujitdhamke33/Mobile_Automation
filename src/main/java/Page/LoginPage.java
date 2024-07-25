package Page;


import Base.BasePage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//android.view.View[@content-desc=\"\uF234 LOGIN\"]/android.widget.TextView[1]")
    WebElement clickLogin;

    //

    @FindBy(xpath = "//android.view.View[@content-desc=\"Login here\"]/android.widget.TextView")
    WebElement loginHere;
    @FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[5]/android.widget.Button")
    WebElement loginButton;
    @FindBy(xpath = "//android.widget.EditText[@focusable='true']\n")

    WebElement userEmail;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[5]/android.widget.EditText[2]")
    WebElement userPassword;

    // -----------------------------------------------------------HomePage___________

    @FindBy(xpath = "//android.view.View[@content-desc=\"Manage Companies\"]/android.widget.TextView")
    WebElement clickWatchlist;

    @FindBy(xpath="//android.widget.EditText[@focusable='true']")
    WebElement searchCompany;

    @FindBy(xpath="//android.view.View[@content-desc=\"DONE\"]/android.widget.TextView")
    WebElement done;

    @FindBy(xpath= "//android.view.View[@content-desc=\"← Go Back\"]/android.widget.TextView")
    WebElement goBack;

//---------------------------------UpgradePage-------------------

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.widget.ListView/android.view.View[5]/android.widget.Button")
    WebElement Account;

    @FindBy(xpath="//android.view.View[@content-desc=\"\uE804 Upgrade\"]/android.widget.TextView[2]")
    WebElement upgrade;

    @FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.widget.GridView/android.view.View[1]/android.view.View/android.widget.Button")
    WebElement upgradeNow;

    @FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")
    WebElement phoneNumber;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.widget.GridView/android.view.View[8]/android.view.View/android.widget.TextView")
    WebElement Proceed;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.ListView/android.view.View[2]")
    WebElement card;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.TextView")
    WebElement payNow;

    public void login(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        clickLogin.click();
        loginHere.click();
        userEmail.sendKeys("onlinegamediwebsite@gmail.com");
        userPassword.sendKeys("Sujit@5788");
        //scroll();
        loginButton.click();
        //upgradeGoyal();
        //addCompanies();
    }

    public void addCompanies(){
        login();
        clickWatchlist.click();
        searchCompany.sendKeys("Infosys Ltd");
        done.click();
        goBack.click();
        clickWatchlist.click();
    }

    public void upgradeGoyal(){
        login();
        Account.click();
        upgrade.click();
        upgradeNow.click();
        phoneNumber.sendKeys("9370092186");
        Proceed.click();
        card.click();
        payNow.click();
    }

    public void scroll(){
        login();
    //  Don't have an account?
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Product\"));"));
    }
}