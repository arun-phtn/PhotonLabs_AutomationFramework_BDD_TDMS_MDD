package com.photon.framework.StepLibrary;
import com.photon.framework.StepLibrary.CommonLibrary;
import com.photon.framework.Constant.FidelityConstant.HomePage;

public class FidelityStepLibrary {
    public static void searchAString (String searchString) {
        CommonLibrary.clearAndEnterText(HomePage.search_TXT, searchString);
        CommonLibrary.isElementPresentVerifyClick(HomePage.selectSearchOption);
    }
    
    public static void validateSearchResult (String resultString) {
        try {
            CommonLibrary.isElementPresentVerification(HomePage.searchResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void validateHeaderMenu(String names) throws Exception {
        
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
}
