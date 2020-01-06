package tests;

import org.openqa.selenium.support.PageFactory;
import pages.AddCustomerPage;
import pages.CommonPage;
import pages.LoginPage;
import pages.OpenAccountPage;
import runner.TestRunner;

/**
 * Created by nththuy on 1/3/20.
 */
public class PageProvider {


    private static AddCustomerPage addCustomerPage;
    private static OpenAccountPage openAccountPage;
    private static CommonPage commonPage;
    private static LoginPage loginPage;


    public static AddCustomerPage getAddCustomerPage() {
        if (addCustomerPage == null) {
            addCustomerPage = PageFactory.initElements(TestRunner.driver, AddCustomerPage.class);
        }
        return addCustomerPage;
    }


    public static OpenAccountPage getOpenAccountPage() {
        if (openAccountPage == null) {
            openAccountPage = PageFactory.initElements(TestRunner.driver, OpenAccountPage.class);
        }
        return openAccountPage;
    }


    public static CommonPage getCommonPage() {
        if (commonPage == null) {
            commonPage = PageFactory.initElements(TestRunner.driver, CommonPage.class);
        }
        return commonPage;
    }
    public static LoginPage getLoginPage(){
        if (loginPage == null) {
            loginPage = PageFactory.initElements(TestRunner.driver, LoginPage.class);
        }
        return loginPage;
    }

}
