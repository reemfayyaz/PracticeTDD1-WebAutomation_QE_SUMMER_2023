package com.nysoftusa.Pages;

import com.nysoftusa.configaration.WebTestBase;
import org.openqa.selenium.By;
import org.testng.Assert;



public class AmazonHomePage extends WebTestBase {

    public static void checkFunctionalityOfAmazonSignIn(){
        driver.findElement(By.xpath("//div//span[text()='Hello, sign in']")).click();
        waitFor(2);
        driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys("goodluckinc797@gmail.com");
        driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
        driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys("Rajashani555");
        driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
        waitFor(2);
//String expectedResult="Hello, Reem";
        //String actualResult=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/div")).getText();
        //  Assert.assertEquals(actualResult,expectedResult,"abc");
    }
    public static void checkFunctionalityOfCustomerService(){
        // driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[12]")).click();
        driver.findElement(By.cssSelector("a[data-csa-c-content-id=nav_cs_fs_hub_navbar_c]")).click();
        waitFor(2);
        String expectedResult="Welcome to Amazon Customer Service";
        String actualResult=driver.findElement(By.xpath("//h1[text()='Welcome to Amazon Customer Service']")).getText();
        //  Assert.assertTrue(actualResult.contains("Amazon Music"));
        Assert.assertEquals(expectedResult,actualResult,"does not match");
    }
}
