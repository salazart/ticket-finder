package com.sz.tf.controllers;

import com.sz.tf.models.TicketResponse;
import com.sz.tf.services.IRequestService;
import com.sz.tf.stores.models.TicketRequest;
import com.sz.tf.stores.services.ITicketRequestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
public class MainController {
    private static final String DATE_MASK = "dd.MM.yyyy";

    private IRequestService requestService;
    private ITicketRequestService ticketRequestService;

    @RequestMapping("/")
    public String index(){
        return "Greetings from ticket-finder";
    }

    @RequestMapping("/get")
    @ResponseBody
    public TicketResponse get(@RequestParam("id") Long id){
        TicketRequest ticketRequest = ticketRequestService.getTicketRequestById(id);
        return requestService.postResponse(ticketRequest);
    }

    @RequestMapping("/add")
    public String save(@RequestParam("url") String url,
                       @RequestParam("from") Long from,
                       @RequestParam("to") Long to,
                       @RequestParam("date") String date){

        TicketRequest ticketRequest = new TicketRequest();
        ticketRequest.setUrl(url);
        ticketRequest.setFrom(from);
        ticketRequest.setTo(to);
        try {
            ticketRequest.setDate(new SimpleDateFormat(DATE_MASK).parse(date));
        } catch (ParseException e) {
            return e.getMessage();
        }
        ticketRequestService.addTicketRequest(ticketRequest);

        return "Запись успешно добавлена.";
    }

    @RequestMapping("/all")
    @ResponseBody
    public List<TicketRequest> all(){
        return ticketRequestService.getTicketRequests();
    }

    @Resource(name = "requestService")
    public void setRequestService(IRequestService requestService) {
        this.requestService = requestService;
    }

    @Resource(name = "ticketRequestService")
    public void setTicketRequestService(ITicketRequestService ticketRequestService) {
        this.ticketRequestService = ticketRequestService;
    }
}