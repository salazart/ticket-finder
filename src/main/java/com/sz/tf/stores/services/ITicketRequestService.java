package com.sz.tf.stores.services;

import com.sz.tf.stores.models.TicketRequest;

import java.util.List;

public interface ITicketRequestService {
    void addTicketRequest(TicketRequest ticketRequest);
    List<TicketRequest> getTicketRequests();
    TicketRequest getTicketRequestById(Long id);
}