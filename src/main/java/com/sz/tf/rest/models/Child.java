package com.sz.tf.rest.models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "minDate",
        "maxDate"
})
public class Child {

    @JsonProperty("minDate")
    private String minDate;
    @JsonProperty("maxDate")
    private String maxDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("minDate")
    public String getMinDate() {
        return minDate;
    }

    @JsonProperty("minDate")
    public void setMinDate(String minDate) {
        this.minDate = minDate;
    }

    @JsonProperty("maxDate")
    public String getMaxDate() {
        return maxDate;
    }

    @JsonProperty("maxDate")
    public void setMaxDate(String maxDate) {
        this.maxDate = maxDate;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
