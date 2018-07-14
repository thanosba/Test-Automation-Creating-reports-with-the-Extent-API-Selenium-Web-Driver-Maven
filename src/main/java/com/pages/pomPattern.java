/**
 * Created by thanos-imac on 14/7/18.
 */
package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pomPattern {

    WebDriver driver;
    @FindBy(xpath = "//*[@id='login-email']") WebElement email;
    @FindBy(xpath = "//*[@id='login-password']") WebElement password;
    @FindBy(xpath = "//*[@id='login-submit']") WebElement Signin;

    public pomPattern(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public String clickUserInfo() {
        email.sendKeys("your email");
        password.sendKeys("your password");
        return driver.getTitle();
    }

    public void clickSignin() {
        Signin.click();
    }
}

