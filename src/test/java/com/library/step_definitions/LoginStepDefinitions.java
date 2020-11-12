package com.library.step_definitions;

import com.library.pages.LoginPage;
import com.library.utils.BrowserUtils;
import com.library.utils.ConfigurationReader;
import com.library.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginStepDefinitions {

    LoginPage loginPage=new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }


    @When("user logs in as a {string}")
    public void user_logs_in_as_a(String string) {
       loginPage.login(string);

    }

    @Then("user should see {string} profile name")
    public void user_should_see_profile_name(String string) {
        String actual = loginPage.getProfileSubTitleText();

        Assert.assertEquals(string,actual);
        BrowserUtils.wait(5);
    }

    ///////////////////////////////////////////////////////////////

    @Then("user should see {string}")
    public void user_should_see(String string) {
        String actual = loginPage.getPageSubTitleText().trim();
        Assert.assertEquals("Page title is not equal",string,actual);
    }



    @When("user logs in with {string} username and {string} password")
    public void user_logs_in_with_username_and_password(String username, String password) {
        loginPage.login(username,password);
    }


    @Then("user verifies that {string} message is displayed")
    public void user_verifies_that_message_is_displayed(String expected) {

        String actual = loginPage.getWarningMessageText().trim();
        Assert.assertEquals(expected,actual);

    }






}
