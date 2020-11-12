package com.library.pages;

import com.library.utils.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "inputEmail")
    private WebElement inputEmail;

    @FindBy(id = "inputPassword")
    private WebElement inputPassword;

    @FindBy(xpath = "//button[contains(text(),'Sign in')]" )
    private WebElement signInButton;

    @FindBy(xpath = "//div[contains(text(),'Sorry, Wrong Email or Password')]")
    private WebElement warningMessage;


    public void login(String emailValue,String passwordValue){

        inputEmail.sendKeys(emailValue);
        inputPassword.sendKeys(passwordValue, Keys.ENTER);

    }

    public void login(String role){

        String emailValue="";
        String passwordValue="";

        if (role.equalsIgnoreCase("student")){
            emailValue=ConfigurationReader.getProperty("email1");
            passwordValue=ConfigurationReader.getProperty("password1");
        }else if (role.equalsIgnoreCase("librarian")){
            emailValue=ConfigurationReader.getProperty("emailLibrarian");
            passwordValue=ConfigurationReader.getProperty("passwordLibrarian");

        }

        inputEmail.sendKeys(emailValue);
        inputPassword.sendKeys(passwordValue,Keys.ENTER);

    }

    public String getWarningMessageText() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return warningMessage.getText().trim();
    }





}
