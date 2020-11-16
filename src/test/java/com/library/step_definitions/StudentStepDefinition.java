package com.library.step_definitions;

import com.library.pages.BasePage;
import com.library.pages.StudentBookPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class StudentStepDefinition extends BasePage {

    StudentBookPage studentBookPage=new StudentBookPage();

    @And("user clicks on Borrowing Books button")
    public void user_clicks_on_borrowing_books_button() {
        studentBookPage.clickOnBorrowingBooksButton();
    }

    @Then("user should be able to see information of the borrowed books history")
    public void user_should_be_able_to_see_information_of_the_borrowed_books_history() {
        studentBookPage.getInfo();
    }
}
