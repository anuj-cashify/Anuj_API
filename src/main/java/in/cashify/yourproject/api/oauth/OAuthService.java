package in.cashify.yourproject.api.oauth;

import in.cashify.yourproject.api.common.config.ConfigManager;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import org.testng.ITestContext;

import static io.restassured.RestAssured.given;

public class OAuthService {

    public OAuthResponse getOAuth(ITestContext context) {
        String url = ConfigManager.CONFIG_MANAGER.getConfig().getCasUrl();
        Response response = given()
                .contentType(ContentType.URLENC)
                .post(url);
        OAuthResponse oAuthResponse = response.body().as(OAuthResponse.class, ObjectMapperType.GSON);
        context.setAttribute("myAuth", oAuthResponse);
        return oAuthResponse;
    }

}
