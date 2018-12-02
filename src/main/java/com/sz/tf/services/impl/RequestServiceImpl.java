package com.sz.tf.services.impl;

import com.sz.tf.models.Data;
import com.sz.tf.stores.models.TicketRequest;
import com.sz.tf.models.TicketResponse;
import com.sz.tf.services.IRequestService;
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

    private RestTemplate restTemplate = new RestTemplate();

    public TicketResponse postResponse(TicketRequest ticketRequest) {
        restTemplate.getMessageConverters()
                .add(0, new StringHttpMessageConverter(StandardCharsets.UTF_8));
        ResponseEntity<Data> response = restTemplate
                .postForEntity(ticketRequest.getUrl(), getHeadersForPost(ticketRequest), Data.class);
        return response.getBody().getData();
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