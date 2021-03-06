package com.pubnub.api.models.server;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class HistoryForChannelsItem {

    @JsonProperty("message")
    @Getter private JsonNode message;

    @JsonProperty("timetoken")
    @Getter private Long timeToken;

}
