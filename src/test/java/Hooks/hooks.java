package Hooks;

import Ultility.TestBasePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import junit.framework.Test;


public class hooks {

        @Before
        public void openBrowser() {
            System.out.println("before");
            TestBasePage.openBrowser();
        }

        @After
        public void tearDown() {
            TestBasePage.getDriver().quit();
        }

    }
