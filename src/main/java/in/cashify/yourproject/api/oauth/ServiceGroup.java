package in.cashify.yourproject.api.oauth;

import com.google.gson.annotations.SerializedName;

public class ServiceGroup {
    @SerializedName("key")
    private String name;

    @SerializedName("si")
    private String identifier;

    @SerializedName("is")
    private int isSecure;

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public boolean isSecure() {
        return isSecure > 0;
    }
}
