import Page.LoginPage;
import Page.ScreensPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class ScreenPageTest extends ScreensPage {
    LoginPage loginPage;
    ScreensPage screensPage;
    @BeforeMethod
    public void setUp() throws IOException {
        Initialization();
        loginPage = new LoginPage();
        screensPage= new ScreensPage();
    }
    @Test
    public void pennyStocksFind(){
        loginPage.login();
        screensPage.pennyStock();
    }
}
