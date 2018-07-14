/**
 * Created by thanos-imac on 14/7/18.
 */

package com.tests;
import com.listeners.MyListener;
import com.pages.loginPage;
import com.pages.pomPattern;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestApp extends MyListener {
    loginPage mlp;
    pomPattern mrp;

 @Parameters("browser")
 @BeforeTest
 public void beforeTest(String browserName) {
     if (browserName.equalsIgnoreCase("Chrome")) {
         mlp = PageFactory.initElements(driver, loginPage.class);
         mrp = PageFactory.initElements(driver, pomPattern.class);
     }
 }

 @AfterTest
 public void afterTest() {
  System.out.println("in after test");
  mlp = null;
  mrp = null;
 }

 @Test
 public void testMercuryTours() {
  System.out.println("in test method");
  mlp.loadWebPage("https://www.linkedin.com/");
  mrp.clickUserInfo();
  mrp.clickSignin();
  String title = mlp.clickLogin();

  //Pass condition
  //Assert.assertEquals("(5) LinkedIn", driver.getTitle(), "Strings are matching");
  //test.log(LogStatus.INFO, "the test tours is passed");

   //Fail condition with screenshot
    Assert.assertEquals("LinkedIn", driver.getTitle(), "Strings are not matching");
    test.log(LogStatus.INFO, "the test tours is failed");
 }
}
