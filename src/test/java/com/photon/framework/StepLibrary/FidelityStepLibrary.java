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
}
