package com.myproject.pages;

import com.myproject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);

        /*I used Page Object Model to simplify managing and maintaining my framework for myself and my team.
- this design pattern allows me to locate web elements only once, in their respective classes.
- so that if there are any problems with any web elements, I know exactly where to go and how to fix it.*/

    }

    @FindBy(name = "USER_LOGIN")
    public WebElement userNameBox;

    @FindBy(name="USER_PASSWORD")
    public WebElement passwordBox;

    @FindBy(xpath = "(//input[@class='login-btn'])[1]")
    public WebElement loginBtn;
}
