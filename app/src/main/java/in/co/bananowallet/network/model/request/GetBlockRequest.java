package in.co.bananowallet.network.model.request;

import com.google.gson.annotations.SerializedName;

import in.co.bananowallet.network.model.Actions;
import in.co.bananowallet.network.model.BaseRequest;

/**
 * Retrieve hash history
 */

public class GetBlockRequest extends BaseRequest {
    @SerializedName("action")
    private String action;

    @SerializedName("hash")
    private String hash;


    public GetBlockRequest() {
        this.action = Actions.GET_BLOCK.toString();
    }

    public GetBlockRequest(String hash) {
        this.action = Actions.GET_BLOCK.toString();
        this.hash = hash;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
