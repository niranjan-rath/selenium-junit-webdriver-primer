package com.niranjan.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by NIRRATH on 18-4-2017.
 */
public class TestBrowser {
    public WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void browseToTestForm() {
        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
    }

    @After
    public void tearDown() {
        driver.close();
    }
}