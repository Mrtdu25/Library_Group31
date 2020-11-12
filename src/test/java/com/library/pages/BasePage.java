package com.library.pages;

import com.library.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
    public BasePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@id='navbarDropdown']/span" )
    protected WebElement profileName;

    @FindBy(className = "nav-link")
    private WebElement pageSubTitle;


    public String getPageSubTitleText(){
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),20);
        wait.until(ExpectedConditions.visibilityOf(pageSubTitle));
        return pageSubTitle.getText();
    }


    public String getProfileSubTitleText() {

        WebElement profileNameText = wait.until(ExpectedConditions.visibilityOf(profileName));

        return profileNameText.getText().trim();
    }



}
