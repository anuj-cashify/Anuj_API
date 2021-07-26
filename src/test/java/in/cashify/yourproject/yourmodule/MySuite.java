package in.cashify.yourproject.yourmodule;

import in.cashify.yourproject.api.common.config.ConfigManager;
import in.cashify.yourproject.api.oauth.OAuthResponse;
import in.cashify.yourproject.api.oauth.OAuthService;
import in.cashify.yourproject.common.MyRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MySuite {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Staring suite for the " + ConfigManager.CONFIG_MANAGER.getConfig().getEnvironment() + " Environment");
    }

    @Test(retryAnalyzer = MyRetryAnalyzer.class)
    void firstTest(ITestContext context) {
        OAuthResponse oAuth = new OAuthService().getOAuth(context);
        OAuthResponse myAuth = (OAuthResponse) context.getAttribute("myAuth");
        System.out.println(myAuth.getAccessToken());
    }
}
