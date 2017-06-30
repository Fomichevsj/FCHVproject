package com.FomichevLTD.Stepick;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by safomichev on 30.06.2017.
 */

public class AppTestJunit5 {

    private static CustomLogger logger;




    @Test
    public void firstTestMethod() {







    }

    @BeforeClass()
    public static void setUp() {
        logger = new CustomLogger();
        logger.debug("Test ClassLogger Created");
    }

    @AfterClass()
    public static void tearDown() {
        logger.debug("TearDown Test");
    }
}
