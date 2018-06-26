package in.co.bananowallet.network.model.request;

import com.google.gson.annotations.SerializedName;

import in.co.bananowallet.network.model.Actions;
import in.co.bananowallet.network.model.BaseRequest;

/**
 * Fetch current price data
 */

public class CurrentPriceRequest extends BaseRequest {
    @SerializedName("action")
    private String action;

    @SerializedName("currency")
    private String currency;

    public CurrentPriceRequest() {
        this.action = Actions.PRICE.toString();
    }

    public CurrentPriceRequest(String currency) {
        this.action = Actions.PRICE.toString();
        this.currency = currency;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
