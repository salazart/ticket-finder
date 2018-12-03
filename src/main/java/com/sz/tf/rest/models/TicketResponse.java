package com.sz.tf.rest.models;

import com.sz.tf.stores.models.Entity;

import java.sql.Date;
import java.util.List;

public class TicketResponse implements Entity {
    private int id;
    private String warning;
    private List<Train> trains;
    private Date date = new Date(new java.util.Date().getTime());

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
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

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}