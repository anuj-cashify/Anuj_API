package in.cashify.yourproject.api.common;

public enum ServiceGroupEnum {
    CAS("cas"),
    CUSTOMER("customer"),
    DOCUMENT_MANAGER("document-manager"),
    MARKETING_SERVICE("marketing-service"),
    PRODUCT_DISCOVERY("product_discovery"),
    SCREEN_PRO_API("screenpro-api"),
    SEO_ENGINE("seo-engine"),
    USER_ACTIVITIES("user-activities"),
    WORDPRESS("wordpress"),
    ;

    private final String name;

    ServiceGroupEnum(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }
}
