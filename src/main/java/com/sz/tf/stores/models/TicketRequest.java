package com.sz.tf.stores.models;

import java.sql.Date;

public class TicketRequest implements Entity {
    private int id;
    private String url;
    private Long from;
    private Long to;
    private Date date;

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDate(java.util.Date date) {
        this.date = new Date(date.getTime());
    }
}