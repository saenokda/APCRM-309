package com.myproject.pages;

import com.myproject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user-name")
    public WebElement profilePhoto;

    @FindBy(xpath = "(//span[.='Themes'])[2]")
    public WebElement themesBtn;

    @FindBy(xpath="//div[@class='theme-dialog-item-title']")
    public List<WebElement> themes;

    @FindBy(id= "save-button")
    public WebElement saveBtn;

    @FindBy(id = "create-button")
    public WebElement customBtn;

    @FindBy(id = "theme-dialog-field-file-input")
    public WebElement uploadBtn;

    @FindBy(id = "theme-dialog-create-button")
    public WebElement createBtn;

    @FindBy(xpath ="//div[@class='theme-dialog-item theme-dialog-item-video']")
    public List<WebElement> animatedThemes;



}
