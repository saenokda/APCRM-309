package com.myproject.step_definitions;

import com.myproject.pages.HomePage;
import com.myproject.pages.LoginPage;
import com.myproject.utilities.BrowserUtils;
import com.myproject.utilities.ConfigurationReader;
import com.myproject.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ThemesStepDefinitions {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user is already on homepage")
    public void user_is_already_on_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
        loginPage.userNameBox.sendKeys(ConfigurationReader.getProperty("username1"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginBtn.click();
    }

    @When("User clicks the profile picture on the top right corner")
    public void user_clicks_the_profile_picture_on_the_top_right_corner() {
        homePage.profilePhoto.click();
    }

    @When("User sees dropdown options and clicks Themes button")
    public void user_sees_dropdown_options_and_clicks_themes_button() {
        homePage.themesBtn.click();
    }

    @Then("User sees themes to choose from")
    public void user_should_see_80_pictures_to_choose_from() {
        //int sizeOfThemes = homePage.themes.size();
        //System.out.println("sizeOfThemes = " + sizeOfThemes);
        // Assert.assertEquals(int1, sizeOfThemes);
    }

    @And("User clicks one of them background changes")
    public void user_clicks_one_of_them_background_changes(){
        for (int i = 0; i < homePage.themes.size(); i++) {
            //homePage.themes.get(i).click();
            //BrowserUtils.sleep(2);;
            Assert.assertTrue(homePage.themes.get(i).isEnabled());
        }
    }

    @And("User clicks save")
    public void user_clicks_save() {
        homePage.saveBtn.click();
    }

    @And("User clicks Custom Theme button")
    public void user_clicks_custom_theme_button() {
        homePage.customBtn.click();
    }

    @Then("User should be able to upload custom image")
    public void user_uploads_custom_image(){
        String filePath = "C:\\Users\\sae\\Desktop\\wallpaper.jpg";
        homePage.uploadBtn.sendKeys(filePath);
        BrowserUtils.sleep(3);
    }

    @Then("User clicks the Create button")
    public void user_clicks_the_create_button(){
        homePage.createBtn.click();
        BrowserUtils.sleep(6);
    }

    @Then("User chooses animated background")
    public void user_chooses_animated_background(){
        for (int i = 0; i < homePage.animatedThemes.size(); i++) {
            //homePage.animatedThemes.get(i).click();
            //BrowserUtils.sleep(3);
            Assert.assertTrue(homePage.animatedThemes.get(i).isEnabled());
        }
    }











}
