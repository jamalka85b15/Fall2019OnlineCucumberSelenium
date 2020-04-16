package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition {
    LoginPage loginPage=new LoginPage();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("Open login page");
        String url= ConfigurationReader.getProperty("qa3");
        Driver.getDriver().get(url);

    }

    @When("user logs as a sales manager")
    public void user_logs_as_a_sales_manager() {
        System.out.println("Login as sales Manager");

        loginPage.login("salesmanager110", "UserUser123");

    }
    @When("user logs as a store manager")
    public void user_logs_as_a_store_manager() {
        loginPage.login("storemanager85","UserUser123");
    }


    @Then("user should verify that title is Dashboard")
    public void user_should_verify_that_title_is_Dashboard() {
        System.out.println("Title is Dashboard");
        Assert.assertEquals("Dashboard", Driver.getDriver().getTitle());
        Driver.closeDriver();

    }

}
