package io.loop.step_definitions;

import io.cucumber.java.*;
import io.loop.utils.Driver;

public class Hook {

    @Before
    public void setUp(){
        Driver.getDriver();
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}
