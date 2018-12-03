package com.sz.tf.stores.models;

import com.sz.tf.rest.models.TicketResponse;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TicketResponseMapper implements RowMapper<TicketResponse> {

    public TicketResponse mapRow(ResultSet resultSet, int i) throws SQLException {
        TicketResponse ticketResponse = new TicketResponse();
        ticketResponse.setId(resultSet.getInt("id"));
        ticketResponse.setWarning(resultSet.getString("warning"));
        ticketResponse.setDate(resultSet.getDate("date"));
        return ticketResponse;
    }
}