package com.sz.tf.services;

import com.sz.tf.models.TicketRequest;
import com.sz.tf.models.TicketResponse;

public interface IRequestService {
    TicketResponse postResponse(TicketRequest ticketRequest);
}