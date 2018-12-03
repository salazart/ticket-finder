package com.sz.tf.stores.models;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TicketRequestMapper  implements RowMapper<TicketRequest> {

    public TicketRequest mapRow(ResultSet resultSet, int i) throws SQLException {
        TicketRequest ticketRequest = new TicketRequest();
        ticketRequest.setId(resultSet.getInt("id"));
        ticketRequest.setUrl(resultSet.getString("url"));
        ticketRequest.setFrom(resultSet.getLong("from"));
        ticketRequest.setTo(resultSet.getLong("to"));
        ticketRequest.setDate(resultSet.getDate("date"));
        return ticketRequest;
    }
}