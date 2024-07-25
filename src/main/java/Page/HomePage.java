package Page;

import Base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//android.view.View[@content-desc=\"Manage Companies\"]/android.widget.TextView")
    WebElement clickWatchlist;

    @FindBy(xpath="//android.widget.EditText[@focusable='true']")
    WebElement searchCompany;

    @FindBy(xpath="//android.view.View[@content-desc=\"DONE\"]/android.widget.TextView")
    WebElement done;

    @FindBy(xpath= "//android.view.View[@content-desc=\"← Go Back\"]/android.widget.TextView")
    WebElement goBack;

    public void addCompanies(){
        clickWatchlist.click();
        searchCompany.sendKeys("Infosys Ltd");
        done.click();
        goBack.click();
        clickWatchlist.click();
    }

}
