package in.cashify.yourproject.api.oauth;

import com.google.gson.annotations.SerializedName;

public class OAuthResponse {
    @SerializedName("access_token")
    String accessTokenValue;

    @SerializedName("token_type")
    String tokenType;

    @SerializedName("ser")
    ServiceGroup[] serviceGroups;

    @SerializedName("isp")
    int isPublic;

    @SerializedName("expires_in")
    long expiresIn;

    public String getAccessToken() {
        return accessTokenValue;
    }

    public String getTokenType() {
        return tokenType;
    }

    public ServiceGroup[] getServiceGroups() {
        return serviceGroups;
    }

    public boolean isPublic() {
        return isPublic > 0;
    }

    public long getExpiresIn() {
        return expiresIn;
    }
}
