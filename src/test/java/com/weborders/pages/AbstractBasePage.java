package com.weborders.pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
It is meant to be extended
 */
public class AbstractBasePage {

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 20);

    public AbstractBasePage(){ // constructor
        PageFactory.initElements(Driver.getDriver(), this);
    }
}

// Constructor is a special kind of method that stands for object building





// this class is a basement for all other classes
// it is meant to be extended
