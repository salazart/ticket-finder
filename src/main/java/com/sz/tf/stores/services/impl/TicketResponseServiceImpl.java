package com.sz.tf.stores.services.impl;

import com.sz.tf.rest.models.TicketResponse;
import com.sz.tf.stores.models.TicketResponseMapper;
import com.sz.tf.stores.services.ITicketResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("ticketResponseService")
public class TicketResponseServiceImpl extends AbstractDao<TicketResponse> implements ITicketResponseService {

    @Autowired
    protected TicketResponseServiceImpl(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    @Override
    public List<TicketResponse> getTicketResponses() {
        return all();
    }

    @Override
    public TicketResponse addTicketResponse(TicketResponse ticketResponse) {
        return add(ticketResponse);
    }

    @Override
    protected String queryGet() {
        return null;
    }

    @Override
    protected RowMapper<TicketResponse> getMapper() {
        return new TicketResponseMapper();
    }

    @Override
    protected String queryAll() {
        return "select * from TICKET_RESPONSE";
    }

    @Override
    protected String queryAdd() {
        return "insert into TICKET_RESPONSE(`warning`, `date`) values(?,?)";
    }

    @Override
    protected Object[] paramsAdd(TicketResponse ticketResponse) {
        return new Object[]{ticketResponse.getWarning(), ticketResponse.getDate()};
    }
}