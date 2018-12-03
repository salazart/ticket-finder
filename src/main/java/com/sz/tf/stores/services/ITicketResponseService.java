package com.sz.tf.stores.services;

import com.sz.tf.rest.models.TicketResponse;

import java.util.List;

public interface ITicketResponseService {
    List<TicketResponse> getTicketResponses();
    TicketResponse addTicketResponse(TicketResponse ticketResponse);
}