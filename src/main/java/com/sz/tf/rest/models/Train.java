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
        "num",
        "category",
        "isTransformer",
        "travelTime",
        "from",
        "to",
        "types",
        "child",
        "allowStudent",
        "allowBooking",
        "isCis",
        "isEurope",
        "allowPrivilege"
})
public class Train {

    @JsonProperty("num")
    private String num;
    @JsonProperty("category")
    private Integer category;
    @JsonProperty("isTransformer")
    private Integer isTransformer;
    @JsonProperty("travelTime")
    private String travelTime;
    @JsonProperty("from")
    private From from;
    @JsonProperty("to")
    private To to;
    @JsonProperty("types")
    private java.util.List<Type> types = null;
    @JsonProperty("child")
    private Child child;
    @JsonProperty("allowStudent")
    private Integer allowStudent;
    @JsonProperty("allowBooking")
    private Integer allowBooking;
    @JsonProperty("isCis")
    private Integer isCis;
    @JsonProperty("isEurope")
    private Integer isEurope;
    @JsonProperty("allowPrivilege")
    private Integer allowPrivilege;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("num")
    public String getNum() {
        return num;
    }

    @JsonProperty("num")
    public void setNum(String num) {
        this.num = num;
    }

    @JsonProperty("category")
    public Integer getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Integer category) {
        this.category = category;
    }

    @JsonProperty("isTransformer")
    public Integer getIsTransformer() {
        return isTransformer;
    }

    @JsonProperty("isTransformer")
    public void setIsTransformer(Integer isTransformer) {
        this.isTransformer = isTransformer;
    }

    @JsonProperty("travelTime")
    public String getTravelTime() {
        return travelTime;
    }

    @JsonProperty("travelTime")
    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    @JsonProperty("from")
    public From getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(From from) {
        this.from = from;
    }

    @JsonProperty("to")
    public To getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(To to) {
        this.to = to;
    }

    @JsonProperty("types")
    public java.util.List<Type> getTypes() {
        return types;
    }

    @JsonProperty("types")
    public void setTypes(java.util.List<Type> types) {
        this.types = types;
    }

    @JsonProperty("child")
    public Child getChild() {
        return child;
    }

    @JsonProperty("child")
    public void setChild(Child child) {
        this.child = child;
    }

    @JsonProperty("allowStudent")
    public Integer getAllowStudent() {
        return allowStudent;
    }

    @JsonProperty("allowStudent")
    public void setAllowStudent(Integer allowStudent) {
        this.allowStudent = allowStudent;
    }

    @JsonProperty("allowBooking")
    public Integer getAllowBooking() {
        return allowBooking;
    }

    @JsonProperty("allowBooking")
    public void setAllowBooking(Integer allowBooking) {
        this.allowBooking = allowBooking;
    }

    @JsonProperty("isCis")
    public Integer getIsCis() {
        return isCis;
    }

    @JsonProperty("isCis")
    public void setIsCis(Integer isCis) {
        this.isCis = isCis;
    }

    @JsonProperty("isEurope")
    public Integer getIsEurope() {
        return isEurope;
    }

    @JsonProperty("isEurope")
    public void setIsEurope(Integer isEurope) {
        this.isEurope = isEurope;
    }

    @JsonProperty("allowPrivilege")
    public Integer getAllowPrivilege() {
        return allowPrivilege;
    }

    @JsonProperty("allowPrivilege")
    public void setAllowPrivilege(Integer allowPrivilege) {
        this.allowPrivilege = allowPrivilege;
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