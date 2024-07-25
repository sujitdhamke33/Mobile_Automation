package Page;

import Base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScreensPage extends BasePage {
    LoginPage loginpage;
@FindBy(xpath = "//android.view.View[@content-desc=\"\uE832 SCREENS\"]/android.widget.TextView[1]")
    WebElement screensButton;
@FindBy(xpath = "//android.view.View[@content-desc=\"CREATE NEW SCREEN\"]/android.widget.TextView")
    WebElement creteNewScreen;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.EditText")
    WebElement query;



    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.widget.Button[1]")
    WebElement run;

    public void pennyStock(){
        screensButton.click();
        creteNewScreen.click();
        query.sendKeys("Current price > 1000 AND\n" +
                "Market capitalization > 50000 ");
        run.click();
    }
}
