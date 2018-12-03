package com.sz.tf.rest.services;

import com.sz.tf.stores.models.TicketRequest;
import com.sz.tf.rest.models.TicketResponse;

public interface IRequestService {
    TicketResponse postResponse(TicketRequest ticketRequest);
}