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
        "code",
        "station",
        "stationTrain",
        "date",
        "time",
        "sortTime"
})
public class To {

    @JsonProperty("code")
    private String code;
    @JsonProperty("station")
    private String station;
    @JsonProperty("stationTrain")
    private String stationTrain;
    @JsonProperty("date")
    private String date;
    @JsonProperty("time")
    private String time;
    @JsonProperty("sortTime")
    private Integer sortTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("station")
    public String getStation() {
        return station;
    }

    @JsonProperty("station")
    public void setStation(String station) {
        this.station = station;
    }

    @JsonProperty("stationTrain")
    public String getStationTrain() {
        return stationTrain;
    }

    @JsonProperty("stationTrain")
    public void setStationTrain(String stationTrain) {
        this.stationTrain = stationTrain;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("sortTime")
    public Integer getSortTime() {
        return sortTime;
    }

    @JsonProperty("sortTime")
    public void setSortTime(Integer sortTime) {
        this.sortTime = sortTime;
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
