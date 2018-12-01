package com.sz.tf.models;

import java.util.List;

public class TicketResponse {
    private String warning;
    private List<Train> trains;

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
}