package response;

/**
 * Created by mangs on 17. 2. 2.
 */
public class APIResponseJson {
    String code;
    String message;
    Object data;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }

    static public APIResponseJson makeJsonResult(APIResponseCode rs) {
        APIResponseJson result = new APIResponseJson();
        result.setCode(rs.getCode());
        result.setMessage(rs.getMessage());

        return result;
    }
    static public APIResponseJson makeJsonResult(APIResponseCode rs, Object data) {
        APIResponseJson result = new APIResponseJson();
        result.setCode(rs.getCode());
        result.setMessage(rs.getMessage());
        result.setData(data);

        return result;
    }
}
