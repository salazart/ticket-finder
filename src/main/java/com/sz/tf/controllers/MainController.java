package com.sz.tf.controllers;

import com.sz.tf.models.TicketRequest;
import com.sz.tf.models.TicketResponse;
import com.sz.tf.services.IRequestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MainController {
    private static final String URL = "";
    private IRequestService requestService;

    @RequestMapping("/")
    public String index(){
        return "Greetings from ticket-finder";
    }

    @RequestMapping("/find")
    public String find(){
        TicketRequest ticketRequest = new TicketRequest();
        ticketRequest.setUrl(URL);
        ticketRequest.setDate("");
        ticketRequest.setFrom("");
        ticketRequest.setTo("");
        TicketResponse ticketResponse = requestService.postResponse(ticketRequest);

        return ticketResponse.getWarning();
    }

    @Resource(name = "requestService")
    public void setRequestService(IRequestService requestService) {
        this.requestService = requestService;
    }
}