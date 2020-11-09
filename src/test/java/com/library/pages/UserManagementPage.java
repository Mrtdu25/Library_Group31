package com.library.pages;

import com.library.utils.BrowserUtils;
import com.library.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserManagementPage extends BasePage {


    @FindBy(tagName = "h3")
    private WebElement usersPageHeadText;

    @FindBy(xpath = "//input[@type='search']")
    private WebElement bookSearchInput;

    @FindBy(tagName = "tbody")
    public WebElement searchBoxTbody;

    public void navigateTo(String text){

        WebElement tabValue = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + text + "')]"));

        tabValue.click();

    }

    public String getUsersPageHeadText(){

        return usersPageHeadText.getText().trim();
    }

    public void clickOnBookSearchInput(){

        bookSearchInput.click();
    }

    public void searchTheText(String searchText){

        bookSearchInput.sendKeys(searchText, Keys.ENTER);


    }








}
