package com.sz.tf.stores.services.impl;

import com.sz.tf.stores.models.TicketRequest;
import com.sz.tf.stores.models.TicketRequestMapper;
import com.sz.tf.stores.services.ITicketRequestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ticketRequestService")
public class TicketRequestServiceImpl implements ITicketRequestService {

    private final String SQL_INSERT = "insert into TICKET_REQUEST(`URL`, `FROM`, `TO`, `DATE`) values(?,?,?,?)";
    private final String SQL_GET_ALL = "select * from TICKET_REQUEST";
    private final String SQL_GET_BY_ID = "select * from TICKET_REQUEST where `ID` = ?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addTicketRequest(TicketRequest ticketRequest){
        jdbcTemplate.update(SQL_INSERT,
                ticketRequest.getUrl(), ticketRequest.getFrom(), ticketRequest.getTo(), ticketRequest.getDate());
    }

    @Override
    public List<TicketRequest> getTicketRequests() {
        return jdbcTemplate.query(SQL_GET_ALL, new TicketRequestMapper());
    }

    @Override
    public TicketRequest getTicketRequestById(Long id) {
        return jdbcTemplate.queryForObject(SQL_GET_BY_ID, new Object[]{id}, new TicketRequestMapper());
    }
}