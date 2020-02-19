package com.iterable.iterableapi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.json.JSONException;
import org.json.JSONObject;

public class IterableAttributionInfo {

    public final int campaignId;
    public final int templateId;
    public final String messageId;

    public IterableAttributionInfo(int campaignId, int templateId, @Nullable String messageId) {
        this.campaignId = campaignId;
        this.templateId = templateId;
        this.messageId = messageId;
    }

    @NonNull
    public JSONObject toJSONObject() {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put(IterableConstants.KEY_CAMPAIGN_ID, campaignId);
            jsonObject.put(IterableConstants.KEY_TEMPLATE_ID, templateId);
            jsonObject.put(IterableConstants.KEY_MESSAGE_ID, messageId);
        } catch (JSONException ignored) {}
        return jsonObject;
    }

    @Nullable
    public static IterableAttributionInfo fromJSONObject(@Nullable JSONObject jsonObject) {
        if (jsonObject != null) {
            return new IterableAttributionInfo(
                    jsonObject.optInt(IterableConstants.KEY_CAMPAIGN_ID),
                    jsonObject.optInt(IterableConstants.KEY_TEMPLATE_ID),
                    jsonObject.optString(IterableConstants.KEY_MESSAGE_ID)
            );
        } else {
            return null;
        }
    }
}
