import Page.UpgradePage;
import Page.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddCompanyTest extends LoginPage {


    LoginPage loginPage;
    UpgradePage homePage;

    @BeforeMethod
    public void setUp() throws IOException {
        Initialization();
        loginPage = new LoginPage();
    }

    @Test
    public void addCompany() {
        loginPage.login();
        loginPage.addCompanies();
    }
}