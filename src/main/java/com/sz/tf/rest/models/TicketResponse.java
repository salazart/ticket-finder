package com.sz.tf.rest.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sz.tf.stores.models.Entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class TicketResponse implements Entity {
    private int id;

    @JsonProperty("warning")
    private String warning;

    @JsonProperty("list")
    private List<Train> trains;
    private Date date = new Date();
    private String dateFormat;

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public List<Train> getTrains() {
        return trains;
    }

    public void setTrains(List<Train> trains) {
        this.trains = trains;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDateFormat() {
        return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(date);
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }
}