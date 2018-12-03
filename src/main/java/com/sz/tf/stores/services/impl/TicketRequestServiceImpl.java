package com.sz.tf.stores.services.impl;

import com.sz.tf.stores.models.TicketRequest;
import com.sz.tf.stores.models.TicketRequestMapper;
import com.sz.tf.stores.services.ITicketRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ticketRequestService")
public class TicketRequestServiceImpl extends AbstractDao<TicketRequest> implements ITicketRequestService {

    @Autowired
    public TicketRequestServiceImpl(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    public void addTicketRequest(TicketRequest ticketRequest){
        add(ticketRequest);
    }

    @Override
    public List<TicketRequest> getTicketRequests() {
        return all();
    }

    @Override
    public TicketRequest getTicketRequestById(int id) {
        return get(id);
    }

    @Override
    protected String queryGet() {
        return "select * from TICKET_REQUEST where `ID` = ?";
    }

    @Override
    protected RowMapper<TicketRequest> getMapper() {
        return new TicketRequestMapper();
    }

    @Override
    protected String queryAll() {
        return "select * from TICKET_REQUEST";
    }

    @Override
    protected String queryAdd() {
        return "insert into TICKET_REQUEST(`URL`, `FROM`, `TO`, `DATE`) values(?,?,?,?)";
    }

    @Override
    protected Object[] paramsAdd(TicketRequest ticketRequest) {
        return new Object[]{ticketRequest.getUrl(), ticketRequest.getFrom(), ticketRequest.getTo(), ticketRequest.getDate()};
    }
}