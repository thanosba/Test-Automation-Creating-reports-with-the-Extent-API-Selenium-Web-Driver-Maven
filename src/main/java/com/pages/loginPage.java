/**
 * Created by thanos-imac on 14/7/18.
 */

package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

public class loginPage {

    WebDriver driver;
    @FindBy(name = "session_key") WebElement username;
    @FindBy(how = How.NAME, using = "session_password") WebElement password;
    @FindBy(how = How.XPATH, using = "//input[@value='Sign in']") WebElement signin;

    public loginPage(WebDriver driver) {
        super();
        this.driver = driver;
    }
    public String clickLogin() {
        //username.sendKeys("");
        //password.sendKeys("");
        //signin.click();
        return driver.getTitle();
    }

    public void loadWebPage(String url) {
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}