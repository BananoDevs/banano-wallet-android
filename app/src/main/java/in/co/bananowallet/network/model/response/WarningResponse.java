package in.co.bananowallet.network.model.response;

import com.google.gson.annotations.SerializedName;

import in.co.bananowallet.network.model.BaseResponse;

/**
 * Error response from service
 */

public class WarningResponse extends BaseResponse {
    @SerializedName("warning")
    private String warning;

    public WarningResponse() {
    }

    public WarningResponse(String warning) {
        this.warning = warning;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }
}
