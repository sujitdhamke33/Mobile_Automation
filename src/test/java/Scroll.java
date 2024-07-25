import Page.LoginPage;
import Page.UpgradePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class Scroll extends LoginPage {

    LoginPage loginPage;
    UpgradePage homePage;
    @BeforeMethod
    public void setUp() throws IOException {
        Initialization();
        loginPage = new LoginPage();
    }
@Test
    public void scrollBottom(){
    loginPage.scroll();
    }

}
