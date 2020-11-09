package com.library.step_definitions;

import com.library.pages.UserManagementPage;
import com.library.utils.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserManagementStepDefinition {
    UserManagementPage userManagementPage=new UserManagementPage();

    @Then("user navigates to {string}")
    public void user_navigates_to(String string) {

       userManagementPage.navigateTo(string);
    }


    @Then("user should see {string} page")
    public void user_should_see_page(String expected) {

        String actual = userManagementPage.getUsersPageHeadText();
        Assert.assertEquals(expected,actual);


    }
    @When("user clicks on Search")
    public void user_clicks_on_search() {

        userManagementPage.clickOnBookSearchInput();

    }
    @When("user enters the {string}")
    public void user_enters_the(String string) {

        userManagementPage.searchTheText(string);

    }
    @Then("user should see desired search")
    public void user_should_see_desired_search() {

        userManagementPage.searchBoxTbody.isDisplayed();
        BrowserUtils.wait(10);
    }



}
