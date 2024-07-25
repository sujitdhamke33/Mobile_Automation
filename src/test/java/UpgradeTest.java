import Page.LoginPage;
import Page.UpgradePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class UpgradeTest extends UpgradePage {
    LoginPage loginPage;
    UpgradePage upgradepage;
    @BeforeMethod
    public void setUp() throws IOException {
        Initialization();
        loginPage = new LoginPage();
    }
    @Test
    public void payment(){
        loginPage.login();
      //upgradepage.upgradeNow();
    }
}
