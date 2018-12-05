package com.sz.tf.rest.services.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sz.tf.rest.models.Data;
import com.sz.tf.rest.models.TicketResponse;
import com.sz.tf.rest.services.IRequestService;
import com.sz.tf.stores.models.TicketRequest;
import com.sz.tf.stores.services.ITicketResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;

@Service("requestService")
public class RequestServiceImpl implements IRequestService {
    private static final String DEFAULT_TIME_VALUE = "00:00";
    private static final String DEFAULT_URL_VALUE = "train-list";

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ITicketResponseService ticketResponseService;

    public TicketResponse postResponse(TicketRequest ticketRequest) {
        restTemplate.getMessageConverters()
                .add(0, new StringHttpMessageConverter(StandardCharsets.UTF_8));
        ResponseEntity<Data> response = restTemplate
                .postForEntity(ticketRequest.getUrl(), getHeadersForPost(ticketRequest), Data.class);
        TicketResponse ticketResponse = response.getBody().getData();
        ticketResponseService.addTicketResponse(ticketResponse);
        return ticketResponse;
    }

    private MultiValueMap<String, String> getHeadersForPost(TicketRequest ticketRequest) {
        return new LinkedMultiValueMap<String, String>(){{
            add("from", String.valueOf(ticketRequest.getFrom()));
            add("to", String.valueOf(ticketRequest.getTo()));
            add("date", String.valueOf(ticketRequest.getDate()));
            add("time", DEFAULT_TIME_VALUE);
            add("url", DEFAULT_URL_VALUE);
        }};
    }
}