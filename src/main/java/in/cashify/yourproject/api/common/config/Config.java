package in.cashify.yourproject.api.common.config;

import com.google.gson.annotations.SerializedName;

public class Config {
    @SerializedName("env")
    private String environment;
    private String casUrl;

    public String getEnvironment() {
        return environment;
    }

    public String getCasUrl() {
        return casUrl;
    }
}
