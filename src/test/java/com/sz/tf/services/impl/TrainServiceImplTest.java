package com.sz.tf.services.impl;

import com.sz.tf.models.TicketRequest;
import com.sz.tf.models.TicketResponse;
import com.sz.tf.services.IRequestService;
import org.junit.Test;

public class TrainServiceImplTest {
    private static final String URL = "https://booking.uz.gov.ua/ru/train_search/";
    private IRequestService trainService = new RequestServiceImpl();

    private TicketRequest ticketRequest = new TicketRequest();

    @Test
    public void getTickets() {
        ticketRequest.setUrl(URL);
        ticketRequest.setDate("2018-12-29");
        ticketRequest.setFrom("2200300");
        ticketRequest.setTo("2200001");

        TicketResponse ticketResponse = trainService.postResponse(ticketRequest);
        System.out.println(ticketResponse.getWarning());
    }
}