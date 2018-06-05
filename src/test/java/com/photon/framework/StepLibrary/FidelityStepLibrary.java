package com.photon.framework.StepLibrary;
import com.photon.framework.StepLibrary.CommonLibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.photon.framework.Constant.FidelityConstant.HomePage;
import com.photon.framework.Constant.FidelityConstant.UsageAgrementPage;

public class FidelityStepLibrary {
    public static void searchAString (String searchString) throws Exception  {
    	System.out.println("FidelityStepLibrary : " +searchString);
        CommonLibrary.clearAndEnterText(HomePage.search_TXT, searchString);
        CommonLibrary.isElementPresentVerifyClick(HomePage.selectSearchOption);
    }
    
    public static void verifyAndClickMobileMenu () {
        try {
            if(CommonLibrary.isMobile) {
                CommonLibrary.isElementPresentVerifyClick(HomePage.mobileMenuBar);
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
    
    
    public static void validateSearchResult (String resultString) {
        try {
            CommonLibrary.isElementPresentVerification(HomePage.searchResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void validateHeaderMenu(String names) throws Exception {
        //Thread.sleep(2000);
        if(names.equalsIgnoreCase("Accounts & Trade"))
            CommonLibrary.isElementPresentVerification(HomePage.header_Accounts_Trade);
        else if(names.equalsIgnoreCase("Planning & Advice"))
            CommonLibrary.isElementPresentVerification(HomePage.header_Planning_Advice);
        else if(names.equalsIgnoreCase("News & Research"))
            CommonLibrary.isElementPresentVerification(HomePage.header_News_Research);
        else if(names.equalsIgnoreCase("Investment Products"))
            CommonLibrary.isElementPresentVerification(HomePage.header_Investment_Products);
        else if(names.equalsIgnoreCase("Why Fidelity"))
            CommonLibrary.isElementPresentVerification(HomePage.header_Why_Fidelity);
       // CommonLibrary.linkText_Validation(objectProperty, names);
    }
    
    
    public static void isHeaderLinksNavigatedToRespectivePage(String Links) throws Exception {
    	if(Links.equalsIgnoreCase("Refer A Friend")) {
    		CommonLibrary.isElementPresentVerification(UsageAgrementPage.REFER_FRIEND_PAGE);
    		Thread.sleep(5000);
    	}
    	else {
    		CommonLibrary.isElementPresentVerification(UsageAgrementPage.HEADER_PAGE);
    		Thread.sleep(5000);
    	}
    }
    
}
