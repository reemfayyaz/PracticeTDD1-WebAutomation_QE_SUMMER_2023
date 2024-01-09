package com.nysoftusa.testpages;

import com.nysoftusa.Pages.AmazonHomePage;
import com.nysoftusa.configaration.WebTestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonHomePageWebTest extends AmazonHomePage {
    // Test Class: where we wrote all the test cases
    // Test case means the methods which belongs to a @Test annotation

    @Test
    public static void verifyUserCanSignINTOAmazonAccount() {
        //Given User open the Chrome Browser.
        //When User type https://www.Amazon.com/ in Address bar and hit enter.
        //Then User Landed on Amazon Home Page.
        //User click  sign in Button.
        //User enter the Valid Email "reemraja555@gmail.com"in editField and Click Continue.
        // User enter the password "55555555"  editField and Click Continue.
        //User Verify the Successful sign in.
        checkFunctionalityOfAmazonSignIn();
        String expectedResult = "Hello, Reem";
        String actualResult = driver.findElement(By.xpath("//div[@class='nav-line-1-container']")).getText();
        Assert.assertEquals(actualResult, expectedResult, "does not Match");

    }

@Test
    public static void verifyFunctionalityOfCustomerService(){
//Given User open the Chrome Browser.
        //When User type https://www.Amazon.com/ in Address bar and hit enter.
        //Then User landed on Amazon Home Page.
//User can see the CustomerService Button.
        //User Click the CustomerService Button.
        //User verify the link.
        checkFunctionalityOfCustomerService();
        String expectedResult="Welcome to Amazon Customer Service";
        String actualResult=driver.findElement(By.xpath("//h1[text()='Welcome to Amazon Customer Service']")).getText();
        Assert.assertEquals(expectedResult,actualResult,"does not match");


    }




    }
