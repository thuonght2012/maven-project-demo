package pages;

import runner.TestRunner;

/**
 * Created by nththuy on 1/3/20.
 */
public class CommonPage {


    public void closeAlertPopup() {
        TestRunner.driver.switchTo().alert().accept();

    }


}
