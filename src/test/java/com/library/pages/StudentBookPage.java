package com.library.pages;

import com.library.utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class StudentBookPage extends LoginPage{

    @FindBy(xpath = "//span[contains(text(),'Borrowing Books')]")
    private WebElement borrowingBooksButton;

    @FindBy(xpath = "//table//a")
    private List<WebElement> borrowedBooks;

    @FindBy(xpath = "//table//tbody//tr")
    private List<WebElement>bookInfo;



    public void clickOnBorrowingBooksButton(){
        BrowserUtils.wait(3);
        BrowserUtils.clickOnElement(borrowingBooksButton);
    }


    public  void getInfo(){



        for (WebElement book : bookInfo) {
            String text = book.getText();
            System.out.println(text);
            BrowserUtils.wait(1);
           
        }
            Assert.assertTrue(book.isDisplayed());


    }



}
