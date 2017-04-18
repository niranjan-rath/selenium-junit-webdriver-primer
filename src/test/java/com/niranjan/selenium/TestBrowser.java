package com.niranjan.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
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
    public void browseToGoogle() {
        driver.get("http://www.sogeti.com");
    }

    @After
    public void tearDown() {
        driver.close();
    }
}