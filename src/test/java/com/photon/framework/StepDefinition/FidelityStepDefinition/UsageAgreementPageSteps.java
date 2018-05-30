package com.photon.framework.StepDefinition.FidelityStepDefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.configuration.ConfigurationException;

import com.photon.framework.StepLibrary.CommonLibrary;
import com.photon.framework.StepLibrary.HomeScreenLibrary;
import com.photon.framework.StepLibrary.JCP_LogIn_Library;
import com.photon.framework.StepLibrary.FidelityStepLibrary;
import com.photon.framework.Constant.FidelityConstant.HomePage;
import com.photon.framework.Constant.FidelityConstant.UsageAgrementPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UsageAgreementPageSteps {

    @Before
    public void launchBrowser() throws ConfigurationException, FileNotFoundException, IOException {
        new CommonLibrary();

    }

    @Given("^User launches the Fedelity URL$")
    public void user_launches_the_fedelity_url() throws Throwable {
        CommonLibrary.initiateBrowser();
    }

    @When("^User accepts the Usage Agrement$")
    public void user_accepts_the_usage_agrement() throws Throwable {

        CommonLibrary.isElementPresentVerifyClick(UsageAgrementPage.ACCEPT_BUTTON);
    }

    @Then("^User lands on the Usage Agrement page$")
    public void user_lands_on_the_usage_agrement_page() throws Throwable {
        CommonLibrary.isElementPresentVerification(UsageAgrementPage.ACCEPT_BUTTON);
    }

    @Then("^User lands on Loginpage$")
    public void user_lands_on_homepage() throws Throwable {
        CommonLibrary.isElementPresentVerification(HomePage.login_link);
    }
    
    @When("^User searches for \"(.*)\" in Fidelity website$")
    public void User_searches_for_in_Fidelity_website(String searchString) throws Exception {
        FidelityStepLibrary.searchAString(searchString);
    }
    
    @Then("^User validates the search result \"(.*)\"$")
    public void user_validates_the_search_result(String resultString) throws Throwable {
        
    }

}
