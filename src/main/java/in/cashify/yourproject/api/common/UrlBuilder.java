package in.cashify.yourproject.api.common;


import in.cashify.yourproject.api.oauth.OAuthResponse;
import in.cashify.yourproject.api.oauth.ServiceGroup;
import org.testng.ITestContext;

public class UrlBuilder {

    public static final String OAUTH = "oauth";

    public static String getUrl(ITestContext context, ServiceGroupEnum serviceGroup, String url) {
        OAuthResponse oauth = (OAuthResponse) context.getAttribute(OAUTH);
        String serviceIdentifier = getServiceIdentifier(serviceGroup.getName(), oauth);
        assert serviceIdentifier != null;
        return "https://" + serviceIdentifier + "api.cashify.in" + "." + url;
    }

    private static String getServiceIdentifier(String serviceGroup, OAuthResponse oauth) {
        ServiceGroup[] serviceGroups = oauth.getServiceGroups();
        for (ServiceGroup group : serviceGroups) {
            if (group.getName().equals(serviceGroup)) {
                return group.getIdentifier();
            }
        }
        return null;
    }
}
