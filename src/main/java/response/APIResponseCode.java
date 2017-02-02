package response;

/**
 * Created by mangs on 17. 2. 2.
 */
public enum APIResponseCode {
    //global code
    G_SUCCESS("01.000", "OK"),
    G_INTERNAL_ERROR("01.001", "Internal server error");

    private final String code;
    private final String message;
    private final Object data;

    APIResponseCode(String id, String message) {
        this.code = id;
        this.message = message;
        this.data = null;
    }
    APIResponseCode(String id, String message, Object data) {
        this.code = id;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}
