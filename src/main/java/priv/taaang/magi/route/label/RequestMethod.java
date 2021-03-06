package priv.taaang.magi.route.label;

/**
 * Created by TdaQ on 16/12/16.
 */
public enum RequestMethod {
    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    PATCH("PATCH"),
    DELETE("DELETE"),
    HEAD("HEAD"),
    OPTIONS("OPTIONS"),
    TRACE("TRACE");

    private String mValue;

    RequestMethod(String mValue) {
        this.mValue = mValue;
    }

    public String value() {
        return mValue;
    }
}
